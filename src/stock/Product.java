package stock;

public class Product implements Comparable<Product> {

    private int ID;
    private String Name;
    private String Brand;
    private double BuyPrice;
    private double SellPrice;
    private double Stock; //Belki işlem yapılır diye Double alındı.
    private String alisTarihi;
    private String satisTarihi;
    private int warnLimit;
    private String aliciIsmi;

    public Product(int iD) {
        ID = iD;
    }

    public Product(int iD, String name, String brand, double buyPrice, double sellPrice, double stock, int warnlimit) {
        ID = iD;
        Name = name;
        Brand = brand;
        BuyPrice = buyPrice;
        SellPrice = sellPrice;
        Stock = stock;
        warnLimit = warnlimit;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getBuyPrice() {
        return BuyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        BuyPrice = buyPrice;
    }

    public double getSellPrice() {
        return SellPrice;
    }

    public void setSellPrice(double sellPrice) {
        SellPrice = sellPrice;
    }

    public double getStock() {
        return Stock;
    }

    public void setStock(double stock) {
        Stock = stock;
    }

    public int getWarnLimit() {
        return warnLimit;
    }

    public void setWarnLimit(int warnLimit) {
        this.warnLimit = warnLimit;
    }

    @Override
    public String toString() {
        return "Product [ID=" + ID + ", Name=" + Name + ", Brand=" + Brand + ", BuyPrice=" + BuyPrice + ", SellPrice="
                + SellPrice + ", Stock=" + Stock + "]";
    }
    @Override
    public int compareTo(Product o) {
              return this.getName().compareTo(o.getName());
    }
}
