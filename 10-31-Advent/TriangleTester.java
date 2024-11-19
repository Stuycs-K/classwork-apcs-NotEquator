import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
class TriangleTester {
  public static boolean checkTriangle(int[] ary) {
    return (ary[0] + ary[1] > ary[2] && ary[0] + ary[2] > ary[1] && ary[1] + ary[2] > ary[0]);
  }




  public static int countTrianglesA(String filename) {
    try {
    File file = new File(filename);
    int triangleCount = 0;
    int[] intList = new int[3];
    int triangleNumberChecker = 0;
    Scanner scannerForAdvent = new Scanner(file);
    while (scannerForAdvent.hasNextInt()) {
    intList[triangleNumberChecker] = scannerForAdvent.nextInt();
    triangleNumberChecker += 1;
      if (triangleNumberChecker == 3) {
        if (checkTriangle(intList)) {
          triangleCount += 1;
        }
        triangleNumberChecker = 0;
      }
    }
    scannerForAdvent.close();
    return triangleCount;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 1000000;
    }

  }
 
 
    public static int countTrianglesB(String filename) {
        try {
            ArrayList<int[]> twoDintForRows = new ArrayList<>();
            File file = new File(filename);
            Scanner scannerForAdvent = new Scanner(file);
            while (scannerForAdvent.hasNextLine()) {
                int[] rowValues = new int[3];
                for (int i = 0; i < 3; i++) {
                    if (scannerForAdvent.hasNextInt()) {
                        rowValues[i] = scannerForAdvent.nextInt();
                    }
            }
            twoDintForRows.add(rowValues);
            }
            scannerForAdvent.close();
            int triangleCount = 0;
             for (int i = 0; i < twoDintForRows.size(); i += 3) {
                for (int c = 0; c < 3; c++) {
                    int[] intList = new int[3];
                    intList[0] = twoDintForRows.get(i)[c];    
                    intList[1] = twoDintForRows.get(i + 1)[c];  
                    intList[2] = twoDintForRows.get(i + 2)[c];
                    if (checkTriangle(intList)) {
                        triangleCount++;
                    }
                }
            }

            return triangleCount;
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return 100000000;
        }
    }
 
}