package feb_12_Builder;

public class Main {
    public static void main(String[] args){
        Student s = new StudentBuilder()
                .age(19.5)
                .name("Vasya")
                .fathersname("Vasylich")
                .height(175.4)
                .surename("Petrov")
                .weight(70)
                .build();
        System.out.println(s);
        StudentBuilder sb = new StudentBuilder();
        StudentBuilder sbAge = sb.age(15);
        sbAge.name("Sergey").fathersname("Petrovich");
        System.out.println(sbAge);
        new StudentBuilder()
                .age(19.5)
                .name("Kolya")
                .fathersname("Vasylich")
                .height(175.4)
                .surename("Petrov")
                .weight(70)
                .build()
                .iAmFromStudent();
    }

}
