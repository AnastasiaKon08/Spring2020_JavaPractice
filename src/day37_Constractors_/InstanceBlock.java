package day37_Constractors_;

public class InstanceBlock {

    static{
        System.out.println("Static block");
    }

    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock(); // instance block gets executed for the second time
    }
}
