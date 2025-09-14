package bank;

public class App {
    public static void main(String[] args) {
        Account williamAccount = new Account(1001, "poupança", "William de Almeida");

        System.err.println(williamAccount.getOwner() + ": R$" + williamAccount.getBalance());
    }   
}
