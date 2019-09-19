package com.company;

import jdk.jfr.Unsigned;

import java.util.Vector;

public class FIbonacciNumbers {

    public void solve() {
        int limit=Integer.MAX_VALUE;
        //Long fac2=2;
        int fac1=1;
        int fac2=2;
       // int fac2=2;

        Vector<Integer> v=new Vector<Integer>();
                v.add(1);
        int i=1;
        while (i<20) {
            int n=v.get(i-1);
            int res=i*n;
             if(res<v.get(i-1))
                 break;
              v.add(res);
            System.out.println(v.get(i)+ " " + i);
           i++;
        }
        long n1=1;
        long n2=2;
        System.out.println(n1+ "1");
        System.out.println(n2+ "2");
        long j=3;
        while(true && j<24){
           // long temp=3*n2;

            n1=n2;
            n2=j*n2;

            if(n2<n1)
                break;

            System.out.println(n2+ " " + j);
            j++;
        }
       // longj=1;

    }
}
