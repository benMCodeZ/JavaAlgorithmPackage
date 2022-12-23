/**

 * 

 * This object contains methods that can calculate an integer

 * and use it to create a unique algorithm

 * that can be used for something else

 * 

 * */

 

 

package collection.algo;

public class INTEGER {

    

    // highest int method

    public int highestNumberOf(int[] arr) {

        

        /* 

          How does this work?

          ----------------------------------

          index = index 0 of array

          i start at 0 get value of array index

          if index value < each index of array value

          index value = will be replaced by array value which is not lower than the index value

          this is repeated until the value of each 

          index of the array !< index 0

          ----------------------------------

        */

        

        int index = arr[0];

        

        for (int i = 0; i < arr.length; i++) {

            if (index < arr[i]) {

                index = arr[i];

            }

        }

        

        return index;

    }

    

    // lowest int method

    public int lowestNumberOf(int[] arr) {

        

        /* 

          How does this work?

          ----------------------------------

          index = index 0 of array

          i start at 0 get value of array index

          if index value > each index of array value

          index value = will be replaced by array value which is not higher than the index value

          this is repeated until the value of each 

          index of the array !> index 0

          ----------------------------------

        */

        

        int index = arr[0];

        

        for (int i = 0; i < arr.length; i++) {

            if (index > arr[i]) {

                index = arr[i];

            }

        }

        

        return index;

    }

    

    // highest length method

    public String longestStringLength(String[] arr) {

        

        /*

           How does this work?

           ----------------------------------

           index = length of index 0

           i start at 0 get the value of array each length of index

           if index > each length of array index

           str value = array value which has longest length

           ----------------------------------

        */

        

        String str = " ";

        int index = arr[0].length();

        

        for (int i = 0; i < arr.length; i++) {

            

            if (index < arr[i].length()) {

                

                str = arr[i];

            }

        }

        

        return str;

    }

    

    // lowest length method

    public String shortestStringLength(String[] arr) {

        

        /*

           How does this work?

           ----------------------------------

           index = length of index 0

           i start at 0 get the value of array each length of index

           if index < each length of array index

           str value = array value which has shortest length

           ----------------------------------

        */

        

        String str = " ";

        int index = arr[0].length();

        

        for (int i = 0; i < arr.length; i++) {

            

            if (index > arr[i].length()) {

                

                str = arr[i];

            }

        }

        

        return str;

    }

    

    public int reverseInteger(int n) {

        

        /*

           How does this work?

           ---------------------------------

            Repeat calculation until number = 0

            

            n = 578 <--- This is the given number

            r

            rev = 0

            

            | #1 calculate |

            r = n mod 10 = 8;

            rev = ((rev • 10) + r) = 8

            n = n ÷ 10 = 57

            

            ----------------

            now its value will change

            r = 8

            rev = 8

            n = 57

            ----------------

            

            | #2 calculate |

            r = n mod 10 = 7;

            rev = ((rev • 10) + r) = 87

            n = n ÷ 10 = 5

            

            ----------------

            now its value will change

            r = 7

            rev = 87

            n = 5

            ----------------

            

            | #3 calculate |

            r = n mod 10 = 5

            rev = ((rev • 10) + r) = 875

            n = n ÷ 10 = 0

            

            (now the value of n is 0, the loop will stop calculating)

        

        */

        

        int r, rev = 0;

        

        while (n > 0) {

            

            r = n % 10;

            rev = rev * 10 + r;

            n = n / 10;

            

        }

        

        return rev;

    }

    

}

