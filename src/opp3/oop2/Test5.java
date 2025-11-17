package opp3.oop2;

public class Test5 {
    int a = 100;
}

class Test6 extends Test5{

     int a = 200;
    public static void main(String[] args) {
        Test6 t1 = new Test6();
        System.out.println(t1.a); //100
    }
}