package Lesson3.example2;

public class Main {
    Main(){
        System.out.println("Main");
    }
    public static void main(String[] args) {
    Fourth fourth = new Fourth();
    }
}

class Second extends Main{
    Second(){
        System.out.println("Second");
    }
}

class Third extends Second{
    Third(){
        System.out.println("Third");
    }
}

class Fourth extends Third{
   Fourth(){
       System.out.println("Fourth");
   }
}
