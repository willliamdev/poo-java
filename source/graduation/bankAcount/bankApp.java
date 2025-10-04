public class bankApp {
    public static void main(String[] args) {
        Account conta1 = new Account();
        Account conta2 = new Account();

        conta1.titular = "William aka creator";
        conta1.saldo = 7.76;

        conta2.titular = "Jhon Doe";
        conta2.saldo = -19.90;

        conta1.depositar(1518);
        conta1.sacar(500);

        
        conta2.depositar(100);
        conta2.sacar(100);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

    }
}
