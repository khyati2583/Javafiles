package Oopspackage;

public class Stock {
    String name;
    String model;
    int price;
    String colour;

    public Stock(String name, String model, int price, String colour) {

        this.name = name;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String toString() {
        return ("New launch of " + this.getName()  +    "Model is " + this.getModel() + ". "  +  "Price is for this is GBP " +  this.getPrice() + "."  +
                "Very nice in colour that is " + this.getColour() + ".");
    }

    public static void main(String[] args) {


        Stock Apple = new Stock("Apple", "Apple Iphone 12", 800, "Purple");
        System.out.println(Apple.toString());
    }
}


