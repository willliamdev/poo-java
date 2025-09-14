package bank;

public class Account {
    public int id;
    protected String category;
    private String owner;
    private Double balance;
    private Boolean isActive;


    


    public Account(int id, String category, String owner) {
        this.id = id;
        this.owner = owner;
        this.category = category;
        if (category == "corrente") {
            setBalance(50.0);
        } else if (category == "poupança") {
            setBalance(150.0);
            
        } else {
            System.err.println("Tipo de conta inesperado.");
        }
        
        setIsActive(true);
    }

    // getters
    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getOwner() {
        return owner;
    }

    public Double getBalance() {
        return balance;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        if (category != "corrente" || category != "poupança") {
            System.err.println("Sua conta deve ser do tipo corrente ou poupança");
        }

        this.category = category;

    }

    public void setOwner(String owner) {
        owner.toLowerCase();
        System.err.println("setter test owner:  " + owner);
        this.owner = owner;
    }


    // both should not be public 
    private void setBalance(Double balance) {
        this.balance = balance;
    }

    private void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }


    // createAccount(){} Constructor??
    public void disableAccount(){
        if (balance == 0) {
            setIsActive(false);
        }
    }


    public void deposit(double amount){
        // only the setter shuld be able to change the
        setBalance(this.balance += amount);
    }
    public void withdraw(double amount){
        double currentBalance =  getBalance();
        if (amount < currentBalance) {
            System.out.println("Saldo insuficente!!");
        } else {
            currentBalance -= amount;
            setBalance(currentBalance);
        }
    }
}
