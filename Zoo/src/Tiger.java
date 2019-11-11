public class Tiger extends Animal {

    String voice;

    public Tiger(String name, AnimalType type, String voice){
        super(name, type);
        this.voice = voice;
    }

    @Override
    public void makeSomeNoise(){
        System.out.printf("%s: %s", name, voice);
        System.out.println();
    }

    public void getColor(){
        System.out.println("Я тигр, я в полоску");
    }

//    @Override
//    public String toString(){
//        return "name = " + name + "\n" +
//                "voice = Arrrrh";
//    }
}
