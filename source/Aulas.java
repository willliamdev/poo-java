package source;

public class Aulas {
    public static void main(String[] agrs){
        Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        c1.setCor("Azul");
        c1.setPonta(0.7f);;


        c1.getModelo();
        c1.getPonta();
        c1.getCor();

        c1.rabiscar();
    }


}
