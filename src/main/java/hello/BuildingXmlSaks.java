package hello;

import hello.model.ItemBean;
import hello.model.ItemsBean;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;


public class BuildingXmlSaks {
    public static void main(String[] args) throws InterruptedException, JAXBException {
        System.out.println("----------BuildingXml start----------");
        StringWriter stringWriter = new StringWriter();

        ItemBean item = new ItemBean();
        item.setAdjustmentType("ADJUSTMENT");
        item.setItemID("717185");
        item.setQuantity("10");
        item.setShipNode("Node1234");

        List<ItemBean> items = new ArrayList<>();
        items.add(item);

        JAXBContext context = JAXBContext.newInstance(ItemsBean.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        ItemsBean itemsBean = new ItemsBean();
        itemsBean.setItems(items);

        marshaller.marshal(itemsBean, stringWriter);
        System.out.println(stringWriter.toString());

        System.out.println("----------BuildingXml end----------");
    }
}


