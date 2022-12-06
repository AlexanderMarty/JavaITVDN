package Lesson1.Package1;

public class ExampleInPackage1 {
    private String name1 = "private";
    //Виден в рамках текущего класса
    String name2 = "package";
    //Виден в рамках пакета
    protected String name3 = "protected";
    //Виден в рамках текущего класса и в классах-наследниках
    public String name4 = "public";
    //Виден отовсюду
}
