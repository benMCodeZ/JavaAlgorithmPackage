/**

 * 

 * This file is just a test to test the collection algorithm package used in this class

 * 

 * */

package com.program;

// importing algorithm collection

import collection.algo.INTEGER;

import collection.algo.MATH;

import collection.algo.ARRAYS;

public class Test {

    

    public static void main(String[] args) {

        

        // collection algorithm INTEGER

        final INTEGER integer = new INTEGER();

        final MATH math = new MATH();

        

        int[] num = {17, 8, 10, 11, 90, 1};

        

        /*

          | This object has the ability to return the highest int of an array |

        */

        int highest = integer.highestNumberOf(num);

        System.out.println(highest);

        

        /*

          | This object has the ability to return the lowest int of an array |

        */

        int lowest = integer.lowestNumberOf(num);

        System.out.println(lowest);

        

        /*

          | Its object has the ability to return a string with the longest length |

        */

        String[] pl = {"Java","Python","C++","C"};

        String highestLength = integer.longestStringLength(pl);

        System.out.println(highestLength);

        

        /*

          | Its object has the ability to return a string with the shortest length |

        */

        String lowestLength = integer.shortestStringLength(pl);

        System.out.println(lowestLength);

        

        /*

          | It can reverse an integer (189) -> (981)

        */

        int x = 1289;

        System.out.println(integer.reverseInteger(x));

        

        /*

          | Using the math object you can calculate the factorial of an integer |

        */

        System.out.println(math.fact(5));

        

        /*

          | This object will return a string "palindrom" and "not palindrome" |

        */

        System.out.println(math.palin(128));

        

    

        /* 

          | This object will return the even number of give number |

        */

        System.out.println(math.evenNumberOf(5));

        

        /*

          | print each value of even number list you don't need to create a new object 

        */

        ARRAYS.printEach(math.evenNumberOf(5));

        

        

    }

}

