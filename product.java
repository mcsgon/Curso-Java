package exemplo2.entites;

public class product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock (){
     return price * quantity;
    }
    public void adProduct(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts (int quantity){
        this.quantity -= quantity;
}
    public String toString() {
        return name + " ,R$" + String.format("%.2f",price) + ", "+ quantity + " unidades " +  String.format("%.2f",totalValueInStock());
}
}