package hello.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Item")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemBean {
    @XmlAttribute(name = "AdjustmentType")
    private String adjustmentType= "SAKS";

    @XmlAttribute(name = "ItemID")
    private String itemID;

    @XmlAttribute(name = "OrganizationCode")
    private String OrganizationCode="SAKS";

    @XmlAttribute(name = "ProductClass")
    private String productClass="";

    @XmlAttribute(name = "Quantity")
    private String quantity;

    @XmlAttribute(name = "ShipNode")
    private String shipNode;

    @XmlAttribute(name = "SupplyType")
    private String supplyType = "ONHAND";

    @XmlAttribute(name = "UnitOfMeasure")
    private String unitOfMeasure = "EACH";

    public ItemBean() {}

    public void setAdjustmentType(String adjustmentType){
        this.adjustmentType = adjustmentType;
    }
    public String getAdjustmentType(){
        return adjustmentType;
    }

    public void setItemID(String itemID){
        this.itemID = itemID;
    }
    public String getItemID(){
        return itemID;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public void setShipNode(String shipNode){
        this.shipNode = shipNode;
    }
}