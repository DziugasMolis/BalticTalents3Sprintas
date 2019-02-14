package java15.demo9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println("ArrayListas");
        for(Integer arrList: arrayList) {
            System.out.println(arrList);
        }

        System.out.println("LinkedListas");
        for(Integer linkedL: linkedList) {
            System.out.println(linkedL);
        }

        System.out.println(linkedList.peek());
    }
}
