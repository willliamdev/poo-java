package source;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.err.println("-------------------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        System.err.println("-------------------------");
    }

    public void rabiscar() {
        if (tampada) {
            System.err.println("Ops!! A caneta esá tampada!!");
        } else if (carga > 0) {
            System.err.println("Rabiscando");
            this.carga -= 1;
        } else {
            System.err.println("Ops! A caneta est sem carga!!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
