public class Main {

    public static void main(String[] args) {
        Zebra zebra = new Zebra("Марти", AnimalType.HERBIVOROUS);
        System.out.println(zebra);
        zebra.letsDance();
        someNoise(zebra);
        Tiger tiger = new Tiger("Tigra",
                AnimalType.PREDATOR,
                "Я тигра, я так вижу");
        someNoise(tiger);
        System.out.println(tiger);

        Lion lion = new Lion("Alex", AnimalType.PREDATOR);
        someNoise(lion);
        System.out.println(lion);
    }

    public static void someNoise(INoiseable animal){
        animal.makeSomeNoise();
    }
}
