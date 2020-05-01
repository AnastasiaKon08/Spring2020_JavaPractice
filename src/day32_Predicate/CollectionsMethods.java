package day32_Predicate;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4));
        Integer maxNum = Collections.max(numbers); //4
        numbers.removeAll(Arrays.asList(maxNum));
        System.out.println(numbers);

        int secondMax=Collections.max(numbers);
        System.out.println(secondMax);
        int secondMin =0;

        System.out.println("====================================");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1, 2, 3, 4, 5, 6, 7,8));
        Integer minNum = Collections.min(nums);
        nums.removeAll(Arrays.asList(minNum));
        System.out.println(nums);

        secondMin = Collections.min(nums);
        System.out.println(secondMin);

    }
}
