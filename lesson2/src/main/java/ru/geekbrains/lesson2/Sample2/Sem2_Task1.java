public class Sem2_Task1 {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("В тарелке: " + food);
    }
    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("ХАВЧИКА НЕТУ!");
        }
    }
}