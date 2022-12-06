package Lesson3.Example1;

public class BaseClass {
    public String publicField = "BaseClass.PublicField";
    private String privateField = "BaseClass.PrivateField";
    protected String protectedField = "BaseClass.ProtectedField";

    public void show(){
        System.out.println(privateField);
    }
}
