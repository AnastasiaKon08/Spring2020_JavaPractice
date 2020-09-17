package ExtraKnowledge;

public class MainGenerics {
    public static void main(String[] args) {
        Generics<Integer, Integer> obj = new Generics<>(10, 65);
        Generics<String, String> obj2 = new Generics<>("Ana", "Bear");

        obj.showType();
        obj2.showType();

        NumberFnc<Integer> iOb = new NumberFnc<>(4);
        System.out.println(iOb.square());

    }
}
