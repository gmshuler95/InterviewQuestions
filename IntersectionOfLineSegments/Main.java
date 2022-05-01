public class Main {
    public static void main(String[] args) {
        LineSegment LS1 = new LineSegment(new LineSegment.Point(0,0), new LineSegment.Point(10, 10.0));
        LineSegment LS2 = new LineSegment(new LineSegment.Point(10,0), new LineSegment.Point(0,10));

        LineSegment.Point thePoint = LS1.findIntersection(LS2);

        System.out.println(thePoint);
    }
        
     
}