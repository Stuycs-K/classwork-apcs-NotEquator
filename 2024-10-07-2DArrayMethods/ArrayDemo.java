import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    System.out.println("--countZeros2D--");
    int[][] arr = new int[][]{{1, 0, 0}, {2, 3}, {0}};
    System.out.println("Expected Ouput: 3; Actual Output: " + countZeros2D(arr));
    arr = new int[][]{{}, {}, {}};
    System.out.println("Expected Ouput: 0; Actual Output: " + countZeros2D(arr));
    arr = new int[][]{{-1, -2}, {0, 0}, {}};
    System.out.println("Expected Ouput: 2; Actual Output: " + countZeros2D(arr));
    System.out.println("--htmlTable--");
    System.out.println("Expected Output: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>; Actual Output: " + htmlTable(new int[][]{{1, 2}, {3}}));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
        for (int i = 0; i < ary.length; i++) {
        result += arrToString(ary[i]);
        if (i < ary.length - 1) {
            result += ", ";
        }
    }
    return result + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int row = 0; row < nums.length; row++) {
      for (int column = 0; column < nums[row].length; column++) {
        if (nums[row][column] == 0) {
          count ++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int result = 0;
    for (int row = 0; row < nums.length; i++) {
      for (int column = 0; column < nums[row].length; j++) {
          result += nums[row][column];
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
  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int row = 0; row < nums.length; row++) {
      for (int column = 0; column < nums[0].length; column++) {
          result[column][row] = nums[row][column];
      }
    }
    return result;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int row = 0; row < nums.length; row++) {
      result += "<tr>";
      for (int column = 0; column < nums[row].length; column++) {
        result += "<td>" + nums[row][column] + "</td>";
      }
      result += "</tr>";
    }
    result += "</table>";
    return result;
  }
}
