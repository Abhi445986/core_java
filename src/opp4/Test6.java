package opp4;

public abstract class Test6 {
     abstract void show ();{

    }
   void display() {
       System.out.println("Display");
   }
   class Test4 extends Test6 {


       @Override
       void show() {
           System.out.println("show Method");
       }
   }

        public static void main(String[] args) {
            Test6 t1 = new Test4();
            t1.display();
            t1.show();
        }
}
