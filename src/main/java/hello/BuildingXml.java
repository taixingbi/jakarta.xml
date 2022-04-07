package hello;

import hello.model.Duke;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;

public class BuildingXml {
    public static void main(String[] args) throws InterruptedException, JAXBException {
        System.out.println("----------BuildingXml start----------");
        StringWriter stringWriter = new StringWriter();

        JAXBContext context = JAXBContext.newInstance(Duke.class);
        Marshaller marshaller = context.createMarshaller();
        System.out.println( marshaller.toString() );

        Duke duke1 = new Duke("java", 2);
        marshaller.marshal(duke1, stringWriter);
        System.out.println(stringWriter.toString());

        System.out.println("----------BuildingXml end----------");
    }
}


