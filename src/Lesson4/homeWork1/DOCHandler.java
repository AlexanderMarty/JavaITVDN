package Lesson4.homeWork1;

public class DOCHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println(".doc file opened");
    }

    @Override
    void create() {
        System.out.println(".doc file created");
    }

    @Override
    void change() {
        System.out.println(".doc file changed");
    }

    @Override
    void save() {
        System.out.println(".doc file saved");
    }
}

