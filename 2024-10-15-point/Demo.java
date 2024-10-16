import java.lang.Math;
public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double x1 = a.getX();
    double y1 = a.getY();
    double x2 = b.getX();
    double y2 = b.getY();
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point pO = new Point(0,0);
    Point p6 = new Point(p3);
    Point equilateral1 = new Point(-.5,0);
    Point equilateral2 = new Point(.5,0);
    Point equilateral3 = new Point(0,Math.sqrt(3) / 2);

    System.out.println(p6);
    System.out.println(p3);
    System.out.println(distance(p1,p2));
    System.out.println(Point.distance(p1,p2));
    System.out.println(p1.distanceTo(p2));
    System.out.println(Point.distance(pO,p3));
    System.out.println(distance(pO,p3));
    System.out.println(pO.distanceTo(p3));
    System.out.println(Point.distance(p6,p3));
    System.out.println(distance(p6,p3));
    System.out.println(p6.distanceTo(p3));
    System.out.println(Point.distance(equilateral1,equilateral2));
    System.out.println(distance(equilateral2,equilateral3));
    System.out.println(equilateral2.distanceTo(equilateral3));


  }
}