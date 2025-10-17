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

    private void hello() {
        makeNoise();
        System.out.println(this.name + "lhe dá as saudações!!");
    }

}