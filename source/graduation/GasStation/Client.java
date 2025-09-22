package source.graduation.GasStation;

public class Client {
    private double amount;
    private double cost;
    Fuel fuel_type;

    public Client(Fuel fuel_type, double amount) {
        this.fuel_type = fuel_type;
        this.amount = amount;
        this.cost = amount * fuel_type.getPrice();
    }

    public double getCost() {
        return cost;
    }

    public double getAmount() {
        return amount;
    }

    public String getFuelType() {
        return fuel_type.getType();
    }
}
