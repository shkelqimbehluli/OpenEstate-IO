
package org.openestate.io.trovit.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}picture" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "picture"
})
@XmlRootElement(name = "pictures")
public class Pictures implements Cloneable, CopyTo2, Equals2, ToString2
{

    protected List<Picture> picture;

    /**
     * Gets the value of the picture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Picture }
     * 
     * 
     */
    public List<Picture> getPicture() {
        if (picture == null) {
            picture = new ArrayList<Picture>();
        }
        return this.picture;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<Picture> thePicture;
            thePicture = (((this.picture!= null)&&(!this.picture.isEmpty()))?this.getPicture():null);
            strategy.appendField(locator, this, "picture", buffer, thePicture, ((this.picture!= null)&&(!this.picture.isEmpty())));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Pictures) {
            final Pictures copy = ((Pictures) draftCopy);
            {
                Boolean pictureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.picture!= null)&&(!this.picture.isEmpty())));
                if (pictureShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Picture> sourcePicture;
                    sourcePicture = (((this.picture!= null)&&(!this.picture.isEmpty()))?this.getPicture():null);
                    @SuppressWarnings("unchecked")
                    List<Picture> copyPicture = ((List<Picture> ) strategy.copy(LocatorUtils.property(locator, "picture", sourcePicture), sourcePicture, ((this.picture!= null)&&(!this.picture.isEmpty()))));
                    copy.picture = null;
                    if (copyPicture!= null) {
                        List<Picture> uniquePicturel = copy.getPicture();
                        uniquePicturel.addAll(copyPicture);
                    }
                } else {
                    if (pictureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.picture = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Pictures();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Pictures that = ((Pictures) object);
        {
            List<Picture> lhsPicture;
            lhsPicture = (((this.picture!= null)&&(!this.picture.isEmpty()))?this.getPicture():null);
            List<Picture> rhsPicture;
            rhsPicture = (((that.picture!= null)&&(!that.picture.isEmpty()))?that.getPicture():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "picture", lhsPicture), LocatorUtils.property(thatLocator, "picture", rhsPicture), lhsPicture, rhsPicture, ((this.picture!= null)&&(!this.picture.isEmpty())), ((that.picture!= null)&&(!that.picture.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
