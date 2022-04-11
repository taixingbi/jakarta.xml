package hello.model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "Demo")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserBean {
    @XmlAttribute(name = "XmlAttribute1")
    private String xmlAttribute1;

    @XmlAttribute(name = "XmlAttribute2")
    private final String XmlAttribute2 = "this is xmlAttribute2";

    @XmlElement(name = "xmlElement")
    String xmlElement;

    public UserBean() {}

    public void setXmlAttribute1(String xmlAttribute1){
        this.xmlAttribute1 = xmlAttribute1;
    }

    public String getXmlAttribute1(){
        return xmlAttribute1;
    }

    public void setXmlElement(String xmlElement){
        this.xmlElement = xmlElement;
    }

    public String getXmlElement(){
        return xmlElement;
    }


}