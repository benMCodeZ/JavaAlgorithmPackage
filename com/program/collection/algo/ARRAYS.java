package collection.algo;

import java.util.List;

public class ARRAYS {
    
    public static void printEach(List<Integer> list) {
    
        for (int i = 0; i < list.size(); i++) {
            
            System.out.print(list.get(i));
            
        }
    }
    
    public static void printEachLine(List<Integer> list) {
    
        for (int i = 0; i < list.size(); i++) {
            
            System.out.println(list.get(i));
            
        }
    }
}

