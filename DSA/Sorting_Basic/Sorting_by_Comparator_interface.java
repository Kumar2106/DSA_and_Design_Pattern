package DSA.Sorting_Basic;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting_by_Comparator_interface {
    public static void main(String[] args) {
        Point arr[]={new Point(10, 20), new Point(3, 12), new Point(5, 7)};
        Arrays.sort(arr,new MyCmp());
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].x +" "+ arr[i].y);
        }
    }

    public static class Point{
        int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
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
