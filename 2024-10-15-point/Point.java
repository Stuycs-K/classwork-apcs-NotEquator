public class Point{
<<<<<<< HEAD
    private double x,y;
  
    public String toString(){
      return("(" + getX() + ", " + getY() + ")");
    }
  
    //Initialize this Point to have the same values as the other Point.
    public Point(Point other){
      this.x = other.getX();
      this.y = other.getY();
    }
  
    //Initialize this Point to have the provided values
    public Point(double x, double y){
      this.x=x;
      this.y=y;
    }
    public double getX(){
      return x;
    }
    public double getY(){
      return y;
    }
  
    /*
    Write this method FOURTH, go to the main and do that one first.
    */
    public double distanceTo(Point other){
      double x1 = getX();
      double y1 = getY();
      double x2 = other.getX();
      double y2 = other.getY();
      return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
  
    /*
    Write this method last. Re-use (NOT COPY/PASTE) prior work and
    do not write redundant code.
    */
    public static double distance(Point a, Point b){
      double x1 = a.getX();
      double y1 = a.getY();
      double x2 = b.getX();
      double y2 = b.getY();
      return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
  }
=======
  private double x,y;

  public String toString(){
    return("(" + getX() + ", " + getY() + ")");
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    this.x = other.getX();
    this.y = other.getY();
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  /*
  Write this method FOURTH, go to the main and do that one first.
  */
  public double distanceTo(Point other){
    double x1 = getX();
    double y1 = getY();
    double x2 = other.getX();
    double y2 = other.getY();
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }

  /*
  Write this method last. Re-use (NOT COPY/PASTE) prior work and
  do not write redundant code.
  */
  public static double distance(Point a, Point b){
    double x1 = a.getX();
    double y1 = a.getY();
    double x2 = b.getX();
    double y2 = b.getY();
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }
}
>>>>>>> 1c0909044346f0e4ba0c44134d4c227df5c3fcb3
