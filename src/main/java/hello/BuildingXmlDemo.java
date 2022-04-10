package hello;

import hello.model.UserBean;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;


public class BuildingXmlDemo {
    public static void main(String[] args) throws InterruptedException, JAXBException {
        System.out.println("----------BuildingXml start----------");
        StringWriter stringWriter = new StringWriter();

        JAXBContext context = JAXBContext.newInstance(UserBean.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        UserBean userBean = new UserBean();
        userBean.setXmlAttribute1("this is xmlAttribute1");
        userBean.setXmlElement("this is XmlElement");

        marshaller.marshal(userBean, stringWriter);
        System.out.println(stringWriter.toString());

        System.out.println("----------BuildingXml end----------");
    }
}


