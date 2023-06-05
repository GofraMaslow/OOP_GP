public class Sem2_Task2 {
    private String name;
    private int appetite;
    private boolean fullness;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            fullness = true;
        }
    }
    public boolean isFull() {
        return fullness;
    }
}