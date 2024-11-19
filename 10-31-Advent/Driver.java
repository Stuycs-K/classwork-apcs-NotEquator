import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        try {
            String file = "C:\\Users\\motta\\OneDrive\\Desktop\\APCS\\classwork-apcs-NotEquator\\10-31-Advent\\inputA.txt";
            int triangleCountA = TriangleTester.countTrianglesA(file);
            System.out.println("Count of triangles (method A): " + triangleCountA);
        } catch (Exception ex) {
            System.out.println("File not found");
            return;
        }
        try {
            String file = "C:\\Users\\motta\\OneDrive\\Desktop\\APCS\\classwork-apcs-NotEquator\\10-31-Advent\\inputTri.txt";
            int triangleCountB = TriangleTester.countTrianglesB(file);
            System.out.println("Count of triangles (method B): " + triangleCountB);
        } catch (Exception ex) {
          System.out.println("File not found");
          return;
        }
        try {
          String file = "C:\\Users\\motta\\OneDrive\\Desktop\\APCS\\classwork-apcs-NotEquator\\10-31-Advent\\Advent2016input.txt";
          int triangleCountA = TriangleTester.countTrianglesA(file);
          System.out.println("Count of triangles (method A): " + triangleCountA);
      } catch (Exception ex) {
          System.out.println("File not found");
          return;
      }
      try {
          String file = "C:\\Users\\motta\\OneDrive\\Desktop\\APCS\\classwork-apcs-NotEquator\\10-31-Advent\\Advent2016input.txt";
          int triangleCountB = TriangleTester.countTrianglesB(file);
          System.out.println("Count of triangles (method B): " + triangleCountB);
      } catch (Exception ex) {
        System.out.println("File not found");
        return;
      }
    }
}
