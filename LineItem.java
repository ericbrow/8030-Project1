public class LineItem {
  private String itemName;
  private int quantity;
  private double price;
  
  public LineItem(String newName, int newQty, double newPrice) {
    itemName = newName;
    quantity = newQty;
    price = newPrice;
  }
  
  public String getName() {
    return itemName;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public double getPrice() {
    return price;
  }
  
  public double getTotalPrice() {
    return price*quantity;
  }
  
  public void setQuantity(int newQty) {
    quantity = newQty;
  }
  
  public void setPrice(double newPrice) {
    price = newPrice;
  }
  
  public String toString() {
    String outString = this.getName() + " qty " + this.getQuantity() + " @ " + this.getPrice() + "/t$" + this.getTotalPrice();
    return outString;
  }

}
