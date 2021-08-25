package DSA.Sorting_Basic;

import java.util.Arrays;

public class Sorting_by_implementing_comparable {
    public static void main(String[] args) {
        Point arr[]={new Point(10, 20), new Point(3, 12), new Point(5, 7)};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].x +" "+arr[i].y);
        }
    }

    public static class Point implements Comparable<Point>{
        int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p) {
            // TODO Auto-generated method stub
            return this.x - p.x;
        }

    }
}