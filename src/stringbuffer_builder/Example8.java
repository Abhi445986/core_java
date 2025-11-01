package stringbuffer_builder;

public class Example8 {
    public static void main(String[] args) {

       StringBuffer sb = new StringBuffer("Hello");
       sb.replace(1,3, "WORLD");
        System.out.println(sb);//HWORLDlo


    }
}
