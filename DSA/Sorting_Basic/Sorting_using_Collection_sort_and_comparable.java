package DSA.Sorting_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_using_Collection_sort_and_comparable {
    
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5, 10));
        list.add(new Point(2, 20));
        list.add(new Point(10, 30));
        Collections.sort(list);

        for(Point P: list){
            System.out.println(P.x +" "+P.y);
        }
    }

    public static class Point implements Comparable<Point>{
        int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point P) {
          
            return this.x - P.x;
        }
        
    }
}
