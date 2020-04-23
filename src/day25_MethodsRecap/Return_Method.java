package day25_MethodsRecap;

public class Return_Method {
    public static void main(String[] args) {
        System.out.println(max(10, 9));
    }

    public static int max(int a, int b){
        int max=0;
        if(a>=b){
            max=a;
        } else{
            max=b;
        }
        return max;
    }

    public static int max2(int a, int b){
        if (a>=b){
            return a;
        } else{
            return b;
        }
    }
}
