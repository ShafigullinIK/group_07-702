public class Lion extends Animal {

//    String voice = "Rrrrrrrr";

    public Lion(String name, AnimalType type){
        super(name, type);
    }

    public void getColor(){
        System.out.println("Я лев, я рыженький");
    }

    public void makeSomeNoise(){
        System.out.printf("%s: %s", name, "Rrrrrrrr");
    }

//    @Override
//    public String toString(){
//        String result;
//        result = "name = " + name + "\n" +
//                "voice = " + "Rrrrrrrr";
//        return result;
//    }
}
