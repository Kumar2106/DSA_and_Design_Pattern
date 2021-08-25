package DSA.Sorting_Basic;

import java.util.*;

public class Sorting_using_Collection_sort_and_comparator {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5, 10));
        list.add(new Point(2, 20));
        list.add(new Point(10, 30));
        Collections.sort(list,new MyCmp());

        for(Point p: list){
            System.out.println(p.x +" "+p.y);
        }

    }

    public static class Point{
        int x,y;
        Point(int x, int y){
            this.x =x;
            this.y =y;
        }
    }

    public static class MyCmp implements Comparator<Point>{

        @Override
        public int compare(Point p1, Point p2) {
            // TODO Auto-generated method stub
            return p1.x - p2.x;
        }
        
    }
}
