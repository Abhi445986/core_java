package stringbuffer_builder;

public class Example2 {
    public static void main(String[] args) {

       StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//16

        sb.append("Hello");
        System.out.println(sb.capacity());//16

        sb.append("Hello World");
        System.out.println(sb.capacity());//16

        sb.append("z");
        System.out.println(sb.capacity());//32
    }
}
