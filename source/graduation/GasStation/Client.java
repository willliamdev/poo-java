package source.graduation.GasStation;

public class Client { 
    double amount;
    double cost;
    Fuel fuel_type;

    public Client(Fuel fuel_type, double amount){
        this.fuel_type = fuel_type;
        this.amount = amount;
        this.cost = amount * fuel_type.getPrice();   
    }
    
    public String getFuel_type() {
        return fuel_type.getType();
    }
}
