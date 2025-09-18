package source.guanabara;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = 100;
        this.tampada = true;
    }

    public void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.carga);
    }

    // Getters ----
    public void getModelo() {
        System.out.println("Modelo: " + this.modelo);
    }

    public void getPonta() {
        System.out.println("Ponta: " + this.ponta);
    }

    public void getCor() {
        System.out.println("Cor: " + this.cor);
    }

    // Setters ----
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void rabiscar() {
        if (tampada) {
            System.err.println("A caneta esá tampada");
        } else if (carga > 0) {
            System.err.println("Rabiscando");
            this.carga -= 1;
        } else {
            System.err.println("A caneta está sem carga");
        }
    }

    public void Tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
