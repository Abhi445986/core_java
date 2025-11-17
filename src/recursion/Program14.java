package recursion;

public class Program14 {

    Program14() {
        System.out.println("Hello");
    }

    Program14(int a){
        System.out.println("hi");
    }

    public static void main(String[] args) {
       Program14 P = new Program14();
       Program14 P2= new Program14(10);
    }

}
