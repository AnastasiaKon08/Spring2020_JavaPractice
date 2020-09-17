package ExtraKnowledge;

import java.util.HashMap;

public class Generics<T, V> {
    T ob;
    V ob2;

    HashMap<T, V> map = new HashMap<>();


    Generics(T ob, V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

}

//Generics allows us to create a class that can take different kinds of variables
// Allows to increase code reusability