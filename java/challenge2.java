//HackerRank Solutions

// Language       : Java                          
// Domain         : Java                 
// Sub Domain     : Introduction
// Challenge Name : Java If-Else 

// Solution Code follows

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1){
            ans = "Weird";
            }
        else{
  			if(n>=2&&n<=5)
                System.out.println("Not Weird");
            else if(n<=20)
                System.out.println("Weird");
                else
                System.out.println("Not Weird");            
            	
            }
            System.out.println(ans);       
        }
    }