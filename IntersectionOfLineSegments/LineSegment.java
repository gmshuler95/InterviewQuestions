import java.util.ArrayList;
import java.util.Collections;

public class LineSegment{
    private Point startPoint;
    private Point endPoint;

    public LineSegment(Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public LineSegment(){
        this(new Point(), new Point());
    }

    public double[] generateEquationCoefficients(){ //found by googling
        double A_x = endPoint.getX() - startPoint.getX();
        double B_y = endPoint.getY() - startPoint.getY();
        double C = A_x*startPoint.getX() + B_y*startPoint.getY();

        return new double[] {A_x, B_y, C};
    }

    public boolean withinLineSegment(Point point){

        boolean withinX = (point.getX() >= startPoint.getX() && point.getX()<=endPoint.getX()) || (point.getX() >= endPoint.getX() && point.getX()<=startPoint.getX());
        boolean withinY = (point.getY() >= startPoint.getY() && point.getY()<=endPoint.getY()) || (point.getY() >= endPoint.getY() && point.getY()<=startPoint.getY());

        if (withinX && withinY) return true;
        
        return false;
    }
    public static class Point{
        private double x;
        private double y;

        public Point(double x, double y){
            this.x = x; this.y = y;
        }
        public Point(){
            this(0.0,0.0);
        }

        public double getX(){return this.x;}
        public double getY(){return this.y;}

        public String toString(){return "("+x+", "+y+")";}
    }

    public Point findIntersection(LineSegment LS2){
        double[] eqCoeff1 = generateEquationCoefficients();
        double[] eqCoeff2 = LS2.generateEquationCoefficients();

        //found the below equations for calculating intersection point by googling
        double det = eqCoeff1[0] * eqCoeff2[1] - (eqCoeff2[0]*eqCoeff1[1]);
        if (det == 0) {
            //Lines are parallel
            return null;
        }
        //Lines are not parallel
        double x = (eqCoeff2[1]*eqCoeff1[2] - eqCoeff1[1]*eqCoeff2[2])/det;
        double y = (eqCoeff1[0]*eqCoeff2[2] - eqCoeff2[0]*eqCoeff1[2])/det;
        Point intersection = new Point(x,y);
        System.out.println(intersection);

        if (withinLineSegment(intersection)) return intersection; //test to make sure intersection point is within the finite line segments
        
        return null;


    }


}

