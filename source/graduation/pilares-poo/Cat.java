public class Cat extends Animal {

    private int lives;

    public Cat(String name, int age, String color, char sex, String habitat) {
        super(name, age, color, sex, "Miau", habitat);
        this.lives = 9;
    }

    @Override
    public void makeNoise() {
        System.out.print("O gato " + this.name + " está miando: ");
        super.makeNoise();
    }

    public void sleep() {
        int currentEnergy = getEnergy();

        if (currentEnergy >= 100) {
            System.out.println(this.name + " Já esta cheio de energia e não precisa dormir agr.");
            return;
        }

        System.out.println(this.name + " ta tirando um cochilo e recuperando forças");

        setEnergy(currentEnergy + 30);
    }

    public void jump() {
        int currentEnergy = getEnergy();

        if (currentEnergy < 15) {
            System.out.println(this.name + " está muito sonolento para pular.");
            return;
        }

        System.out.println(this.name + " salta sobre o armário da cozinha!");
        setEnergy(currentEnergy - 15);
    }

    public void lostLife() {
        if (this.lives > 0) {
            this.lives--;
            System.out.println(this.name + " perdeu uma vida! Restam apenas: " + this.lives);
        } else {
            System.out.println(this.name + " infelizmente não tem mais vidas :( ");
        }
    }

    public int getLives() {
        return lives;
    }
}