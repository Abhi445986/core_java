package cfs;

public class Example7 {
    public static void main(String[] args) {

        byte a = 10;

        switch (a+90){//byte + int = int

            case 10:
                System.out.println("Hello");
            case 100:
                System.out.println("Hi");//Hii
            case 1000:
                System.out.println("Bye");// Bye

        }
    }
}
