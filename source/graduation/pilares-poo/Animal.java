public class Animal {
    public String name;
    public int age;
    public String color;
    
    private String sex;
    private String noise;
    private String habitat;
    private int energy;

    public Animal(String name, int age, String color, String sex, String noise, String habitat) {
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

    public void eat(){
        if (energy <= 100){
            System.out.println(this.name + " já está com 100% de energia");
        }
        energy+= 10;
    }

    private void move(){
        System.out.println(this.name + "está se movendo..");
        energy-= 10;
    }

    private void hello() {
        makeNoise();
        System.out.println(this.name + "lhe dá as saudações!!");
    }

}