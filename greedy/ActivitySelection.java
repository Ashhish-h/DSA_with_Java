package greedy;

import java.util.ArrayList;

public class ActivitySelection{

    public static void main(String[] args){
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int maxAct = 0;
        ArrayList<Integer> res = new ArrayList<>();

        maxAct = 1;
        res.add(0);
        int lastEnd = end[0];
        for(int i = 0; i < end.length; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                res.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(maxAct);
        for(int i = 0; i < res.size(); i++){
            System.out.print("A"+res.get(i) + " ");
        }
        System.out.println();
    }
}