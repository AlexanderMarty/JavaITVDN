package Lesson4.homeWork1;

public class Main {
    public static void main(String[] args) {
    AbstractHandler file1 = new XMLHandler();
    AbstractHandler file2 = new TXTHandler();
    AbstractHandler file3 = new DOCHandler();

    file1.open();
    file1.create();
    file1.change();
    file1.save();

        file2.open();
        file2.create();
        file2.change();
        file2.save();

        file3.open();
        file3.create();
        file3.change();
        file3.save();
    }
}
