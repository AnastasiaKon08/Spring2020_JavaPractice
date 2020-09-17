package ExtraKnowledge;

public class NumberFnc<T extends Number> {
    T ob;

    NumberFnc(T ob){
        this.ob = ob;
    }

    double square(){
        return ob.intValue()*  ob.intValue();
    }
}
