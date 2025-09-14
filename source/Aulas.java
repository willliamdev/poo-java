package source;

public class Aulas {
    public static void main(String[] agrs){
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }


}
