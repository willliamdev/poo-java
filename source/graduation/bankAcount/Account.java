public class Account {
    String titular;
    double saldo;

    void exibirSaldo() {
        System.out.print("Titular: " + this.titular );
        System.out.println(" - Saldo: R$" + this.saldo );

    }
    
    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Não pode depositar valor negativos!");
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Você não possui saldo suficiente");
        } else {
            this.saldo -= valor;
        }
    }
}
