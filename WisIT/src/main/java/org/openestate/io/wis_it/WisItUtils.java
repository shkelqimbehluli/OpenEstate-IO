/*
 * Copyright 2015 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openestate.io.wis_it;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.core.XmlValidationHandler;
import org.openestate.io.wis_it.xml.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * WisItUtils.
 *
 * @author Andreas Rudolph
 */
public class WisItUtils
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( WisItUtils.class );
  public final static String PACKAGE = "org.openestate.io.wis_it.xml";
  public final static String NAMESPACE = StringUtils.EMPTY;
  private final static ObjectFactory FACTORY = new ObjectFactory();
  private static JAXBContext JAXB = null;

  private WisItUtils()
  {
  }

  public static WisItDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument(XmlUtils.newDocument( input, true ) );
  }

  public static WisItDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument(XmlUtils.newDocument( xmlFile, true ) );
  }

  public static WisItDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument(XmlUtils.newDocument( xmlString, true ) );
  }

  public static WisItDocument createDocument( Document doc )
  {
    if (WisItDocument.isReadable( doc ))
      return new WisItDocument( doc );
    else
      return null;
  }

  public static Marshaller createMarshaller() throws JAXBException
  {
    return createMarshaller( Charset.defaultCharset().name(), true );
  }

  public static Marshaller createMarshaller( String encoding, boolean formatted ) throws JAXBException
  {
    Marshaller m = getContext().createMarshaller();
    m.setProperty( Marshaller.JAXB_ENCODING, encoding );
    m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, formatted );
    m.setEventHandler(new XmlValidationHandler() );
    return m;
  }

  public static Unmarshaller createUnmarshaller() throws JAXBException
  {
    Unmarshaller m = getContext().createUnmarshaller();
    m.setEventHandler(new XmlValidationHandler() );
    return m;
  }

  public static Element createUserDefinedSimplefield( Document doc, String name, String value )
  {
    Element root = XmlUtils.getRootElement( doc );
    Element node = doc.createElementNS( root.getNamespaceURI(), "user_defined_simplefield" );
    node.setAttribute( "feldname", name );
    node.setTextContent( value );
    return node;
  }

  public synchronized static JAXBContext getContext() throws JAXBException
  {
    if (JAXB==null) initContext( Thread.currentThread().getContextClassLoader() );
    return JAXB;
  }

  public static DateFormat getDateTimeFormat()
  {
    return new SimpleDateFormat( "yyyy-MM-dd mm:hh:ss" );
  }

  public synchronized static ObjectFactory getFactory()
  {
    return FACTORY;
  }

  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    JAXB = JAXBContext.newInstance( PACKAGE, classloader );
  }


  public static Calendar parseDateTime( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      Date date = DateUtils.parseDateStrictly( value, new String[]{
        "yyyy-MM-dd mm:hh:ss", "yyyy-MM-dd mm:hh", "yyyy-MM-dd" } );
      Calendar cal = Calendar.getInstance();
      cal.setTime( date );
      return cal;
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    throw new IllegalArgumentException( "Can't parse date-time value '"+value+"'!" );
  }

  public static Double parseDecimal( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDouble( value ): null;
  }

  public static Integer parseInteger( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInt( value ): null;
  }

  public static Boolean parseYesNo( String value )
  {
    value = StringUtils.trimToNull( value );
    if ("ja".equalsIgnoreCase( value ))
      return Boolean.TRUE;
    else if ("nein".equalsIgnoreCase( value ))
      return Boolean.FALSE;
    else if (value!=null)
      return DatatypeConverter.parseBoolean( value );
    else
      throw new IllegalArgumentException( "Can't parse boolean value '" + value + "'!" );
  }

  public static String printDateTime( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print date-time value!" );
    else
      return getDateTimeFormat().format( value.getTime() );
  }

  public static String printDecimal( Double value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print decimal value!" );

    NumberFormat formatter = NumberFormat.getInstance( Locale.ENGLISH );
    formatter.setGroupingUsed( false );
    formatter.setMaximumFractionDigits( 2 );
    return formatter.format( value );
  }

  public static String printNonNegativeInteger( Integer value )
  {
    if (value==null || value<0)
      throw new IllegalArgumentException( "Can't print integer value!" );
    else
      return DatatypeConverter.printInt( value );
  }

  /*public static String printPositiveInteger( Integer value )
  {
    if (value==null || value<1)
      throw new IllegalArgumentException( "Can't print integer value!" );
    else
      return DatatypeConverter.printInt( value );
  }*/

  public static String printYesNo( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "ja";
    else if (Boolean.FALSE.equals( value ))
      return "nein";
    else
      throw new IllegalArgumentException( "Can't print boolean value!" );
  }
}