package Lesson3.bird;

public class Main {
    public static void main(String[] args) {
        Bird strauss = new Strauss();
        Bird penguin = new Penguin();
        Bird swallow = new Swallow();

        Bird [] birds = {strauss, penguin, swallow};

        for (Bird temp : birds){
            temp.move();
        }
    }
}
