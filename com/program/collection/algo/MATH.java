/**

 * 

 * This object contains methods used in math

 * such as factorial, palidrome, and even number of the given number

 * you can use it to calculate difficult program problems

 * 

 * */

 

package collection.algo;

import java.util.List;

import java.util.ArrayList;

public class MATH {

    

    // factorial

    public int fact(int n) {

         

         /*

           How does this works?

           --------------------------

                          

            5 * 4 = 20

            20 * 3 = 60

            60 * 2 = 120

            120 * 1 = 120

            

            n = 5;

            f = 1;

            i = 1;

            

            repeat 5 times n value

            

            f = f * i = 1;

            

            i = 2

            f = f * i = 2;

            

            i = 3

            f = f * i = 6

            

            i = 4

            f = f * i = 24

            

            i = 5

            f = f * i = 120

            

         */

         int i, f = 1;

         for (i = 1; i <= n; i++) {

             f = f * i;

         }

         return f;

    }

    

    // palindrome

    public String palin(int n) {

        

        /*

           How does this work?

           --------------------------

           its calculation is just like the reverse integer

           please review the calculation of the reverse integer algorithm

           

           if temp value = sum value

           true --> print "palindrome"

           false --> print "not palindrome"

           

        */

        

        String check;

        int r, sum = 0, temp;

        temp = n;

        while (n > 0) {

            r = n % 10;

            sum = (sum * 10) + r;

            n = n / 10;

        }

        

        check = (temp == sum) ? "palindrome" : "not palindrome";

        

        return check;

    }

    

    // even number 

    public List<Integer> evenNumberOf(int n) {

        

        /*

           How does this work?

           --------------------------

           n = 10

           i = 1 repeat n value

           i + 1

           

           i = 1 mod 2 = 0 --> 2

           i = 2 mod 2 = 1 --> x

           i = 3 mod 2 = 1 --> x

           i = 4 mod 2 = 0 --> 4

           i = 5 mod 2 = 1 --> x

           i = 6 mod 2 = 0 --> 6

           i = 7 mod 2 = 1 --> x

           i = 8 mod 2 = 0 --> 8

           i = 9 mod 2 = 1 --> x

           i = 10 mod 2 = 0 --> 10

           

           so the even number of 10 is 2 4 6 8 10

           

        */

        

        

        int i;

        int k = 1;

        

        List<Integer> evenList = new ArrayList<Integer>();

        

        for (i = 1; i < n; i++) {

            

            if (i % 2 == 0) {

                

                evenList.add(i);

            }

            

            k++;

        }

        

        return evenList;

    }

}
