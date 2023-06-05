public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Вася", 5);
        cats[1] = new Cat("Мусик", 7);
        cats[2] = new Cat("Герман", 10);
        Plate plate = new Plate(15);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            if (cat.isFull()) {
                System.out.println(cat.getName() + " Я обожрался!");
            } else {
                System.out.println(cat.getName() + " Я хочу еще!");
            }
        }
    }
}