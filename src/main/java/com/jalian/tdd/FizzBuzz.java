package com.jalian.tdd;

public class FizzBuzz {

    public static String compute(int a) {
        StringBuilder result = new StringBuilder();

        if(a % 3 == 0)
            result.append("Fizz");

        if(a % 5 == 0)
            result.append("Buzz");

        if(result.length() == 0) {
            result.append(a);
        }
        return result.toString();
    }

    /*public static String compute(int a) {

        if (a % 3 == 0 && a % 5 == 0)
            return "FizzBuzz";

        else if(a % 3 == 0)
            return "Fizz";

        else if (a % 5 == 0)
            return "Buzz";

        else
            return String.valueOf(a);

    }*/
}
