public class Animal implements INoiseable {

    String name = "Default name";
    AnimalType type = AnimalType.PREDATOR;

//    public Animal(){
//
//    }

    public Animal(String name, AnimalType type){
        this.name = name;
        this.type = type;
    }


    @Override
    public void makeSomeNoise() {
        System.out.println("Animal noise");
    }

    @Override
    public String toString(){
        return "name = " + name + "\n" +
                "type = " + type + "\n";
    }
}
