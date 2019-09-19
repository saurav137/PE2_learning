package com.company;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student_Records {
    private int max;
    private int min;
    private double avg;

    Student_Records(List<Integer> array) {
        this.max = findMax(array);
        System.out.println(max);
        this.min= findMin(array);
        System.out.println(min);
        this.avg= findAvg(array);
        System.out.println(avg);

    }
     public int findMax(List<Integer> array){
      return   Collections.max(array);
     }
    public int findMin(List<Integer> array){
        return Collections.min(array);
    }

    public double findAvg(List<Integer> array) {
        double Average=0;
        for(int i=0;i<array.size();i++){
            Average+=array.get(i);
        }
        Average/=array.size();
        return Average;
    }
}
