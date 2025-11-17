package opp3;

public class Test3 {

  int add (int a,int b){

      return a+b;
  }
    int add (int a ,int b, int c){
      return a+b+c;
    }
    int add (int a,int b,int c,int d){
      return a+b+c+d;
    }

    public static void main(String[] args) {
        Test3 t1 = new Test3();
        System.out.println(t1.add(10,20));
        System.out.println(t1.add(10,20,30));
        System.out.println(t1.add(10,20,30,40));
    }
}
