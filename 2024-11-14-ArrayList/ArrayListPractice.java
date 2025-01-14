import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String> x = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      x.add("" + (int)(11 * Math.random()));
      if (x.get(i).equals("0")) {
        x.set(i, "");
      }
    }
    return x;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++){
      if (original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> result = new ArrayList<String>(original.size());
     for (int i = original.size() - 1; i >= 0; i--){
        result.add(original.get(i));
        }
    return result;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
    ArrayList<String> result = new ArrayList<>(a.size() + b.size());
    int i = 0;
    while (i < a.size() || i < b.size()) {
      if (i < a.size()) {
          result.add(a.get(i));
      }
      if (i < b.size()) {
          result.add(b.get(i));
      }
      i++;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(createRandomArray(5));

    ArrayList<String> ar1 = createRandomArray(20);
    ArrayList<String> ar2 = createRandomArray(30);
    replaceEmpty(ar1);
    System.out.println(ar1);
    System.out.println(makeReversedList(ar1));
    System.out.println(ar1);
    System.out.println(ar2);
    System.out.println(mixLists(ar1, ar2));
  }
}
