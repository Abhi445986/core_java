package stringbuffer_builder;

public class Example1 {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a);// Hello

        StringBuffer b = new StringBuffer(a);
        System.out.println(b);// Hello

        // How to convert stringbuffer object to string

        String c = b.toString();// tostring() method is used to convert sb to string
        System.out.println(c);//


    }
}
