package com.hacker.rank.string.anagram;

import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      //Complete the function
       if(A.length() != B.length())
           return false;
       char[] arr = new char[0];
       char[] brr = new char[0];
       arr = A.toLowerCase().toCharArray();
       brr = B.toLowerCase().toCharArray();
       
       Arrays.sort(arr);
       Arrays.sort(brr);
       int len = arr.length;
       boolean result=true;
       for(int i=0 ; i<len; i++){
           if(arr[i] != brr[i]){
               result = false;
               break;
           }
       }
       return result;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
