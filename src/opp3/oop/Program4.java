
package opp3.oop;

public class Program4 {
    void show (){
        System.out.println("hi");
    }

    static  void display (){
        System.out.println("hello");//1 (JVM) Call
    }
    public static void main(String[] args) {

        System.out.println("bye");//1 (JVM) Call (bye)
       // Program4.display();// 2 (Hello)

       // Program4 obj1 = new Program4();
       // obj1.show();

        new Program4().show();

    }




}
