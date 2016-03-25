//HackerRank Solutions

// Language       : Java                          
// Domain         : Java                 
// Sub Domain     : Introduction
// Challenge Name : Java Stdin and Stdout 2

// Solution Code follows

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            int x = sc.nextInt();
            double y = sc.nextDouble();
            sc.nextLine();
            String s = sc.nextLine();

            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
    }
}

