package opp4;

public abstract class Test3 {
     abstract void show ();{

    }
   void display() {
       System.out.println("Display");
   }
   class Test4 extends Test3{


       @Override
       void show() {
           System.out.println("show Method");
       }
   }

        public static void main(String[] args) {
            Test3 t1 = new Test4();
            t1.display();
            t1.show();
        }
}
