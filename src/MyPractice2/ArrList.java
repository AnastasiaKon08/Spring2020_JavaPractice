package MyPractice2;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrList {
        public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(Arrays.asList(4,-6,3,-8,0,4,3));
    System.out.println(appendPosSum(list));
}
    //create your method below
// Access-modifier specifier return-type methodName(){
    public static ArrayList appendPosSum(ArrayList arrlist){
        ArrayList<Integer> list2 = new ArrayList<>();
        int sum=0;
        for (int i=0; i< arrlist.size(); i++){
            int eachNum = (int) arrlist.get(i);  // unboxing
            if ( eachNum> 0){
                list2.add(eachNum);
                sum+=eachNum;
            }
        }

        list2.add(sum);
        return list2;
    }
}

