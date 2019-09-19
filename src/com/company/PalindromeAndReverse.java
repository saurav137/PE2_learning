package com.company;

public class PalindromeAndReverse {
    public String Palindrome(String queryString){
     //   System.out.println(queryString.substring(2));
        String reverse= reverseStr(queryString);
       if(reverse.equals(queryString))
           return "Given input is palindrome so the reversed string is "+reverse;
       else{
           return "Given input is not palindrome and the reversed string is"+ reverse;
       }
    }



    public String reverseStr(String str) {
        if (str.length() <= 1) {
            return str;
        }

        return reverseStr(str.substring(1)) + str.charAt(0);

    }


}
