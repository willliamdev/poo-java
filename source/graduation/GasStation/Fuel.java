package source.graduation.GasStation;

public class Fuel {
    String type;
    // price per liter 
    Double price;
    
    public Fuel(String type, Double price) {
        this.type = type;
        this.price = price;
    }    

    public Double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    
}
