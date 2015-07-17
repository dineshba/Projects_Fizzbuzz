package com.fizz;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            int controlVaraiable,limit;
            String s1;
            FizzBuzzClass obj=new FizzBuzzClass();
            Scanner in = new Scanner(System.in);
            limit=in.nextInt();

            for(controlVaraiable=1;controlVaraiable<=limit;controlVaraiable++) {
                s1 = obj.isChecking(controlVaraiable);
                System.out.println(s1);
            }
        }
    }
