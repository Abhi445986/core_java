package cfs;

public class Example8 {
    public static void main(String[] args) {

        int a = 10;
        int b =  100;


        switch (a+90){//byte + int = int

            case 10:
                System.out.println("Hello");
            case b:
                System.out.println("Hi");//Hii
            case 1000:
                System.out.println("Bye");// Bye

        }
    }
}
