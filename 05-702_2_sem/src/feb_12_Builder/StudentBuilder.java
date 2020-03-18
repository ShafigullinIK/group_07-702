package feb_12_Builder;

public class StudentBuilder {
    private String name;
    private String surename;
    private String fathersname;
    private double age;
    private double weight;
    private double height;

    public StudentBuilder(){

    }

    public StudentBuilder name(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder fathersname(String fathersname){
        this.fathersname = fathersname;
        return this;
    }

    public StudentBuilder surename(String surename){
        this.surename = surename;
        return this;
    }

    public StudentBuilder age(double age){
        this.age = age;
        return this;
    }

    public StudentBuilder weight(double weight){
        this.weight = weight;
        return this;
    }

    public StudentBuilder height(double height){
        this.height = height;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public String getFathersname() {
        return fathersname;
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public Student build(){
        return new Student(this);
    }

    public void iAmFromBuilder(){
        System.out.println(":(");
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", fathersname='" + fathersname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
