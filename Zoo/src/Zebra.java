public class Zebra extends Animal {

    public Zebra(String name, AnimalType type){
        super(name, type);
    }

    public void letsDance(){
        System.out.printf("%s: тыц, тыц, тыц, тыц", name);
        System.out.println();
    }

    @Override
    public void makeSomeNoise() {
        System.out.printf("%s: И-го-го", name);
        System.out.println();
    }
}
