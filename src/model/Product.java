

public class Product{
  private String id;
  private String name;
  private String version;
  private double price;

  public Product(String id, String name, String version, double price){
    this.id = id;
    this.name = name;
    this.version = version;
    this.price = price;
  }

  @Override
  public String toString(){
    return "Product: " + name + "\n"
       + " ID: " + id + "\n"
       + " Version: " + version +  "\n"
       + " Price: " + price
       + "\n" ;
  }
}
