package day42_Inheritance;


class Test{
    public Test(int a){
        System.out.println("A");
    }
}
public class Constructor2 extends Test{
    public Constructor2(){
        super(10);
    }

}
