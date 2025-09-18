package source.bank;

public class App {
    public static void main(String[] args) {
        Account williamAccount = new Account(1001, "poupança", "William de Almeida");

        System.out.println(williamAccount.getOwner() + ": Rgit $" + williamAccount.getBalance());
    }   
}
