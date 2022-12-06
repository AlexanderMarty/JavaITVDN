package Lesson4.homeWork1;

public class XMLHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println(".xml file opened");
    }

    @Override
    void create() {
        System.out.println(".xml file created");
    }

    @Override
    void change() {
        System.out.println(".xml file changed");
    }

    @Override
    void save() {
        System.out.println(".xml file saved");
    }
}

