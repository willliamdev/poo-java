public class App {
    public static void main(String[] args) {
        // Dog dog1 = new Dog("Rex", 2, "amarelo", 'M', "caramelo");
        Dog dog1 = new Dog("Rex", 2, "caramelo", "viralata", 'F', "domesticado", true);
        
        dog1.eat();
        dog1.move();
        
        dog1.fetch("bolinha");
        dog1.fetch("bolinha");
        dog1.fetch("bolinha");

        System.out.println(dog1.getEnergy());

       
    }
}
