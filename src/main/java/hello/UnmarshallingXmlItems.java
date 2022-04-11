package hello;

import hello.model.ItemsBean;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class UnmarshallingXmlItems {
    public static void main(String[] args) throws InterruptedException, JAXBException, FileNotFoundException {
        System.out.println("----------UnmarshallingXmlDemo start----------");

        JAXBContext context = JAXBContext.newInstance(ItemsBean.class);

        ItemsBean items = (ItemsBean) context.createUnmarshaller()
                .unmarshal(new FileReader("items.xml"));

        System.out.println(items.getItems().get(0).getItemID());

        System.out.println("----------UnmarshallingXmlDemo end----------");
    }
}


