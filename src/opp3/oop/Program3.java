
package opp3.oop;

public class Program3 {
    void show (){
        System.out.println("hi");
    }

    static  void display (){
        System.out.println("hello");//1 (JVM) Call
    }
    public static void main(String[] args) {

        System.out.println("bye");//1 (JVM) Call (bye)
        Program3.display();// 2 (Hello)

    }




}
