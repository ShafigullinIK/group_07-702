package feb_12_Builder;

public class Student {
    String name;
    String surename;
    String fathersname;
    double age;
    double weight;
    double height;

    public Student(StudentBuilder builder){
        this.name = builder.getName();
        this.surename = builder.getSurename();
        this.fathersname = builder.getFathersname();
        this.age = builder.getAge();
        this.weight = builder.getWeight();
        this.height = builder.getHeight();
    }

    public void iAmFromStudent(){
        System.out.println(name + " :-p");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", fathersname='" + fathersname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
