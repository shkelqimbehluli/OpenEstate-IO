//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.25 at 02:50:35 AM CET 
//


package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseYesNo(value));
    }

    public String marshal(Boolean value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printYesNo(value));
    }

}
