package com.company;

public class PowerOf4 {
    public String checkPowerOf4(int num){
        if(num!=0 ) {
            if (((num & (num - 1)) == 0 ) && (num & 0xAAAAAAAA)==0){
                return "It's a power of 4";
            }
            else return "No not a power of 4";
            }
        else return "No not a power of 4";

    }
}
