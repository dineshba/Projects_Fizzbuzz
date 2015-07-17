package com.fizz;

import java.util.Scanner;

public class FizzBuzzClass {

    public String isChecking(int i) {
        if (i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";
        else {
            if (i % 3 == 0)
                return "Fizz";
            else if (i % 5 == 0)
                return "Buzz";
            return "ZzzZ";
        }
    }
}