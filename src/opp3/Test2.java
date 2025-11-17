package opp3;

public class Test2 {

    void show(){
        System.out.println("Met-1");
    }
    // If retun type is chang, no matter is the  overloading
    int show(int a){
        System.out.println("met-2");
        return a = 100;
    }

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.show();
        t1.show(100);
    }
}
