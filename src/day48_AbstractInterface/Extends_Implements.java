package day48_AbstractInterface;

interface I1{
    void method1();
}

interface I2 extends I1 {
    void method2();
}

abstract class AC implements I2{
    abstract void method3();
}

public class Extends_Implements extends AC{
    @Override
 public void method3(){}

    @Override
  public void method2(){}

    @Override
    public void method1(){}

}
