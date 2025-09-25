package source.graduation.GasStation;

public class Fuel {
    private String type;
    private int salesCounter = 0;
    // price per liter 
    private Double price;
    
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

    public void saleCounter() {
        this.salesCounter++;
    }
    
    public int getSalesCounter() {
        return salesCounter;
    }
}
