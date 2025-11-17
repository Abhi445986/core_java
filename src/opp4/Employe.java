package opp4;

public interface Employe {

    void show();
}

 interface boss {

    void display();// (ex 2 show)
}

class Manager implements boss ,Employe{

    @Override
    public void show() {
        System.out.println("Implemenataion of () method in manager");
    }

    @Override
    public void display() {
        System.out.println("Implemenataion of () method in manager");
    }

//    public static void main(String[] args) {
//        Employe m1 = new Manager();
//    }
}
class Test8{
    public static void main(String[] args) {
       Employe m1 = new Manager();
       boss m2 = new Manager();
       m2.display();
  }
}



