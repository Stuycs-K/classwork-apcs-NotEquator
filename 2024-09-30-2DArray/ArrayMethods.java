public class ArrayMethods {
    //1. Write both your names + emails at the top of the document as a comment.
    // Mottaqi Abedin - mottaqia2789@nycstudents.net
    // Max Abraham - maxa39@nycstudents.net
    //2. Copy your arrToString method from before.
    /**Return a String that represets the array in the format:
    * "[2, 3, 4, 9]"
    * Note the comma+space between values, and between values
    */
    public static void main (String[] args) {
      int[][] r = new int[][]{{2,3,4},{5,6,7},{2,4,9}};
      System.out.println("ArrToString");
      System.out.println("Expected output: [[2, 3, 4], [5, 6, 7], [2, 4, 9]]\n actual output; " + arrToString(r));
      r = new int[][]{{},{},{},{}};
      System.out.println("Expected output: [[], [], [], []]\n actual output; " + arrToString(r));
      r = new int[][]{{-2,-3,-4},{-5,-6,-7}};
      System.out.println("Expected output: [[-2, -3, -4], [-5, -6, -7]]\n actual output; " + arrToString(r));
      r = new int[][]{{0}};
      System.out.println("Expected output: [[0]]\n actual output; " + arrToString(r));
      System.out.println("Arr2DSum");
      r = new int[][]{{2,3,4},{5,6,7},{2,4,9}};
      System.out.println("Expected output: 42 \n actual output; " + arr2DSum(r));
      r = new int[][]{{},{},{},{}};
      System.out.println("Expected output: 0 \n actual output; " + arr2DSum(r));
      r = new int[][]{{-2,-3,-4},{-5,-6,-7}};
      System.out.println("Expected output: -27 \n actual output; " + arr2DSum(r));
      r = new int[][]{{0}};
      System.out.println("Expected output: 0\n actual output; " + arr2DSum(r));
      System.out.println("SwapRC");
      r = new int[][]{{2,3,4},{5,6,7},{2,4,9}};
      System.out.println("Expected output: [[2, 5, 2], [3, 6, 2], [4, 7, 9]] \n actual output; " + arrToString(swapRC(r)));
      r = new int[][]{{},{},{},{}};
      System.out.println("Expected output: [] \n actual output; " + arrToString(swapRC(r)));
      r = new int[][]{{-2,-3,-4},{-5,-6,-7}};
      System.out.println("Expected output: [[-2, -5], [-3, -6], [-4, -7]] \n actual output; " + arrToString(swapRC(r)));
      r = new int[][]{{0}};
      System.out.println("Expected output: [[0]]\n actual output; " + arrToString(swapRC(r)));
      System.out.println("ReplaceNegative");
      r = new int[][]{{-2,3,-4},{5,6,7},{-2,4,-9}};
      replaceNegative(r);
      System.out.println("Expected output: [[1, 3, 0], [5, 6, 7], [0, 4, 1]] \n actual output; " + arrToString(r));
      r = new int[][]{{},{},{},{}};
      replaceNegative(r);
      System.out.println("Expected output: [[], [], [], []] \n actual output; " + arrToString(r));
      r = new int[][]{{-2,-3,-4},{-5,-6,-7}};
      replaceNegative(r);
      System.out.println("Expected output: [[1, 0, 0],[0, 1, 0]] \n actual output; " + arrToString(r));
      r = new int[][]{{-0}};
      replaceNegative(r);
      System.out.println("Expected output: [[0]]\n actual output; " + arrToString(r));
      System.out.println("Copy");
      r = new int[][]{{-2,-3,-4},{-5,-6,-7}};
      System.out.println("Expected output: false \n actual output; " + (r == copy(r)));
      r = new int[][]{{2,3,4},{5,6,7},{2,4,9}};
      int[][] copy = copy(r);
      System.out.println("Expected output: true \n actual output; " + (r[0][0] == copy[0][0]));
      r[0][0] = 123;
      System.out.println("Expected output: false \n actual output; " + (r[0][0] == copy[0][0]));
    }

    public static String arrToString(int[]ary){
      String result = "[";
        for (int i=0; i < ary.length; i++) {
          if (i < ary.length - 1) {
            result += ary[i] + ", ";
          }
          else {
            result += ary[i];
          }
        }
        return result + "]";
      }

    //3. Write arrToString, with a 2D array parameter.
    //Note: Different parameters are allowed with the same function name.
    /**Return a String that represets the 2D array in the format:
      * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
      * Note the comma+space between values, and between arrays
      * You are encouraged to notice that you may want to re-use
      * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
      */
    public static String arrToString(int[][]ary){
        //this should use arrToString(int[])
        String result = "[";
            for (int i = 0; i < ary.length; i++) {
            result += arrToString(ary[i]);
            if (i < ary.length - 1) {
                result += ", ";
            }
        }
      return result + "]";
    }

    /*Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][]nums){
      //use a nested loop to solve this
      int result = 0;
      for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums[i].length; j++) {
            result += nums[i][j];
        }
      }
      return result;//place holder return value so it compiles.
    }

    /**Rotate an array by returning a new array with the rows and columns swapped.
      * You may assume the array is rectangular and neither rows nor cols is 0.
      * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
      */
    public static int[][] swapRC(int[][]nums){
      int row = nums.length;
      int column = nums[0].length;
      int[][] result = new int[column][row];
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            result[j][i] = nums[i][j];
        }
      }
      return result;
    }
    //3. Modify a given 2D array of integer as follows:
    //Replace all the negative values:
    //-When the row number is the same as the column number replace
    //that negative with the value 1
    //-All other negatives replace with 0
    public static void replaceNegative(int[][] vals){
      for (int row = 0; row < vals.length; row++) {
        for (int column = 0; column < vals[row].length; column++) {
          if (vals[row][column] < 0) {
            if  (row == column) {
              vals[row][column] = 1;
            }
            else {
              vals[row][column] = 0;
            }
          }
        }
      }
    }

    //4. Make a copy of the given 2d array.
    //When testing : make sure that changing the original does NOT change the copy.
    //DO NOT use any built in methods that "copy" an array.
    //You SHOULD write a helper method for this.
    //If you don't see a good way to do that, you should stop and look at prior methods.
    public static int[][] copy(int[][] nums){
      int[][] result = new int[nums.length][];
      for (int row = 0; row < nums.length; row++) {
        result[row] = copyrow(nums[row]);
      }
      return result;
    }
    public static int[] copyrow(int[] row) {
      int[] result = new int[row.length];
      for (int i = 0; i < row.length; i++) {
        result[i] = row[i];
      }
      return result;
    }
}
