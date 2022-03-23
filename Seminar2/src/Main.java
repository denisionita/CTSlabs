package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<ro.ase.cts.lab02.Product>());

        ro.ase.cts.lab02.Product p1 = new ro.ase.cts.lab02.Product("Laptop", 3200.5, 1,1, 1123, "");
        ro.ase.cts.lab02.Product p2 = new ro.ase.cts.lab02.Product("Frigider", 207.95, 1,2, 1245, "");

        ro.ase.cts.lab02.Product p3 = new ro.ase.cts.lab02.Product(p1);

        p3.setQuantity(5);
        p3.setName("Paine");

        o.modifyProductsList(1,p1);
        o.modifyProductsList(1,p2);

        o.modifyProductsList(2, p1);
        System.out.println(p1.equals(p2));
    }
}

class OShop {
    private String onlineShopName;
    private String i;
    private ArrayList<ro.ase.cts.lab02.Product> products;

    OShop(String name, String img, ArrayList<ro.ase.cts.lab02.Product> products)
    {
        this.products = new ArrayList<ro.ase.cts.lab02.Product>();
        this.i = img;
        this.onlineShopName = name;
    }

    public void modifyProductsList(int what, ro.ase.cts.lab02.Product p)
    {
        if(what == 1)
        {
            this.products.add(p);
        }
        else
            this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getI() {
        return i;
    }

    public void setImg(String img) {
        this.i = img;
    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private Cateogry category;
    private int quantity;
    private String exp; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public enum Cateogry {

    }

    public Product(String n, double p, int pt, int pc, int id, String exp)
    {
        name = n;
        price = p;
        productType = pt;
        category = pc;
        this.id = id;
        this.exp = exp;
    }

    public Product(Product p)
    {
        this.name = p.name;
        this.price = p.price;
        this.productType = p.productType;
        this.category = p.category;
        this.id = p.id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public boolean equals(ro.ase.cts.lab02.Product p)
    {
        if(p.id != this.id)
            return false;
        if(!p.name.equals(this.name))
            return false;
        if(p.price != this.price)
            return false;
        if(p.productType != p.productType)
            return false;
        if(p.category != this.category)
            return false;

        return true;
    }

    public void applyDiscout(double val){
        if(val>1)
            this.price -=this.price *val/100;
        else
            this.price -=this.price *val;
    }

    public void raisePrice(double val){
        if(val>1)
            this.price +=this.price *val/100;
        else
            this.price +=this.price *val;
    }

    public void modify(boolean flag, double val)
    {
        if(flag)
            this.price +=this.price *val;
        if(!flag)
            this.price -=this.price *val/100;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProdId() {
        return id;
    }

    public void setProdId(int prodId) {
        this.id = prodId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String usn;
    private String userId;
    private ArrayList<Order> o;
    private ArrayList<Order> c;

    public User(String usn, String userId)
    {
        this.usn = usn;
        this.userId = userId;
        o=new ArrayList<Order>();
        c=new ArrayList<Order>();
    }

    public void addO1(Order o)
    {
        this.o.add(o);
    }

    public void addO2(Order o)
    {
        this.c.add(o);
    }
}

class Order
{
    private ArrayList<ro.ase.cts.lab02.Product> l;
    private String addr;

    public Order()
    {
        l = new ArrayList<ro.ase.cts.lab02.Product>();
    }
    public void add(ro.ase.cts.lab02.Product p)
    {
        if(l.size() > 99)
            return;

        l.add(p);
    }

    public void remove(ro.ase.cts.lab02.Product p)
    {
        l.remove(p);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

class InventoryP
{
    private ro.ase.cts.lab02.Product p;
    private int q;

    public InventoryP(ro.ase.cts.lab02.Product p, int q)
    {
        this.p = new ro.ase.cts.lab02.Product(p);
        this.q = q;
    }
    public ro.ase.cts.lab02.Product getP() {
        return p;
    }

    public void setP(ro.ase.cts.lab02.Product p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}


