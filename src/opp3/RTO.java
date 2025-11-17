package opp3;

public class RTO {
    void numberPlate(){
        System.out.println("White in colur");
    }
}

class Army extends RTO {

    void numberPlate(){
        System.out.println("black in colur");
    }
    public static void main(String[] args) {
         RTO a1 = new  Army();
         a1.numberPlate();
    }
}

//class Army extends RTO {
//
//    public static void main(String[] args) {
//
//    }
//}
