package day42_Inheritance;



class A{

    int a = 100;
    public A (double b){
        System.out.println(this.a);
    }
}
public class SuperKeyword extends A{
   public SuperKeyword(){
       super(23.8);
       System.out.println(super.a);
    }

    public static void main(String[] args) {
        SuperKeyword keyword = new SuperKeyword();

    }
}
