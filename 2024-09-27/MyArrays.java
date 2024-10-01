public class MyArrays{
  public static void main(String[]args){
    int[] test = {3, 4, 5};
    System.out.println(arrayToString(new int[] {9, 8, 2}));
    System.out.println(test == returnCopy(test));
    System.out.println(arrayToString(test) == arrayToString(returnCopy(test)));
    System.out.println(arrayToString(concatArray(new int[] {8, 7, 6}, new int[] {5, 4, 3})));
  }
  public static String arrayToString(int[] nums) {
    String result = "[";
    for (int i=0; i < nums.length; i++) {
      if (i < nums.length - 1) {
        result += nums[i] + ", ";
      }
      else {
        result += nums[i] + "]";
      }
    }
    return result;
  }
  public static int[] returnCopy(int[]ary) {
    int[] result = new int[ary.length];
    for (int i=0; i < ary.length; i++) {
      result[i] = ary[i];
    }
    return result;
  }
  public static int[] concatArray(int[]ary1,int[]ary2) {
    int[] result = new int[ary1.length + ary2.length];
    int i = 0;
    while (i < ary1.length) {
      result[i] = ary1[i];
      i++;
    }
    for (int j = 0; j < ary2.length; j++) {
      result[i] = ary2[j];
      i++;
    }
    return result;
  }
}
