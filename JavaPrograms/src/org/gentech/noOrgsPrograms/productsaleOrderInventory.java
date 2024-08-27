package org.gentech.noOrgsPrograms;

class Product
{
    String NameProduct;
    int amount;
    Product()
    {
    	NameProduct="Himalaya";
        amount=1500;
        System.out.println(" Name of the Product ="+NameProduct);
        System.out.println("Amount of the product ="+amount);

        System.out.println("++++++++++");	 
    }
}
class Sales
{
    String SalesName;
    String SalesID;
    Sales()
    {
    	SalesName = "Specialist Anandh";
        SalesID= "IZXD";
        System.out.println(" Name of the sales ="+SalesName);
        System.out.println("Sales ID =" +SalesID);

        System.out.println("++++++++++");
    }
}
class Order
{
    String orderID;
    String orderProduct;
    Order()
    {
    	orderID="IGFRq";
        orderProduct ="Earthmama";
        System.out.println(" order ID= "+orderID);
        System.out.println("order Products= "+orderProduct);

        System.out.println("++++++++++");
    }
}
class Inventory
{
    String StockID;
    String InventoryItem;
    Inventory()
    {
    	StockID="DAYA";
        InventoryItem ="HealthGlow";
        System.out.println(" stock ID= "+StockID);
        System.out.println("InventoryItem= "+InventoryItem);

    }
}
public class productsaleOrderInventory
{
    public static void main(String args[])
    {
        Product p1= new Product();
        Sales s1= new Sales();
        Order o1= new Order();
        
        Inventory i1= new Inventory();
    }
}

