package day33_CustomClass;

import org.w3c.dom.ls.LSOutput;

public class Cat {
    String name;
    String breed ;
    String color;
    int age;

      public void setCatInfo(String catBreed, String catName,String catColor, int catAge ) {
           name = catName;
          breed = catBreed;
        color = catColor;
           age = catAge;

      }

      public String toString (){
          return name+", breed is "+ breed + ", color "+ color +", "+ age + " years old";
      }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void eat(String catfood){
        System.out.println(name+ " is eating  " + catfood);
    }

    public void drink (String drinks){
        System.out.println(name+ " is drinking " + drinks);
    }



}
