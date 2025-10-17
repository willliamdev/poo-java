public class Animal {
    public String name;
    public int age;
    public String color;

    private char sex;
    private String noise;
    private String habitat;
    private int energy;

    public Animal(String name, int age, String color, char sex, String noise, String habitat) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.noise = noise;
        this.habitat = habitat;
        this.energy = 100;
        hello();
    }

    public void makeNoise() {
        System.out.println(this.noise + "!" + this.noise + "!" + this.noise + "!");
    }

    public void eat() {
        if (energy <= 100) {
            System.out.println(this.name + " já está com 100% de energia");
        }
        energy += 10;
    }

    private void move() {
        System.out.println(this.name + "está se movendo..");
        energy -= 10;
    }

    private void hello() {
        makeNoise();
        System.out.println(this.name + "lhe dá as saudações!!");
    }

    // Getters e Setter pros atributos privados

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex != 'M' && sex != 'F') {
            System.out.println("Valor de sexo inválido: " + sex + ". Deve ser 'M' ou 'F'.");
            return;
        }
        this.sex = sex;
        System.out.println("Sexo alterado para: " + this.sex);
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (this.energy >= 100) {
            System.out.println("Energia já está em " + 100 + "%");
            return;
        }

        this.energy += energy;

        // limitar em 100%
        if (this.energy > 100) {
            this.energy = 100;
        }

    }

}