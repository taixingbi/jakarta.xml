package hello.model;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Items")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemsBean {
    @XmlElement(name = "Item")
    private List<ItemBean> items = null;

    public void setItems(List<ItemBean> items) {
        this.items = items;
    }

    public List<ItemBean> getItems( ) {
        return items;
    }
}