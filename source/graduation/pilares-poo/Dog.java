public class Dog extends Animal {

    private boolean isTrained;
    private String breed;

    public Dog(String name, int age, String color, String breed, char sex, String habitat, boolean isTrained) {
        super(name, age, color, sex, "Woof", habitat);
        this.isTrained = isTrained;
        this.breed = breed;

        if (breed == "viralata" && color == "caramelo") {
            System.out.println("Acaba de surgir mais uma lenda!!!");
        }
    }

    @Override
    public void makeNoise() {
        System.out.print("O cão " + this.name + " está latindo: ");
        super.makeNoise();
    }

    public void fetch(String item) {
        int currentEnergy = getEnergy();

        if (isTrained) {
            if (currentEnergy <= 0) {
                System.out.println(this.name + " Está sem energia..");
                return;
            }
            System.out.println(this.name + " está buscando o " + item + "! (-20 Energia)");
            setEnergy(currentEnergy -= 20);
        } else {
            System.out.println(this.name + " não é treinado e não entende o comando.");
        }
    }

    public String getBreed() {
        return breed;
    }

    public boolean isTrained() {
        return isTrained;
    }
}