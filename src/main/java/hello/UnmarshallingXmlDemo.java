package hello;

import hello.model.UserBean;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringWriter;


public class UnmarshallingXmlDemo {
    public static void main(String[] args) throws InterruptedException, JAXBException, FileNotFoundException {
        System.out.println("----------UnmarshallingXmlDemo start----------");

        JAXBContext context = JAXBContext.newInstance(UserBean.class);

        UserBean user = (UserBean) context.createUnmarshaller()
                .unmarshal(new FileReader("demo.xml"));

        System.out.println(user.getXmlElement());
        System.out.println(user.getXmlAttribute1());

        System.out.println("----------UnmarshallingXmlDemo end----------");
    }
}


