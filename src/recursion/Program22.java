package recursion;

public class Program22 {

    Program22() {
        this(100);
        System.out.println("con1");
    }
    Program22(int a)

    {    this(10,"Abc");
        System.out.println("con2");

    }
    Program22(int a,String b){
        System.out.println("con3");
    }



    public static void main(String[] args) {
       Program22 P1 = new Program22();




    }

}
