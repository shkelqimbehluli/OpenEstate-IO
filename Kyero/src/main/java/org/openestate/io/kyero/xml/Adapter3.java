
package org.openestate.io.kyero.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseNonNegativeInteger(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.kyero.KyeroUtils.printNonNegativeInteger(value));
    }

}
