public class makewordstest {
  public static void makeWords(int remainingletters, String result, String alphabet) {
    if (remainingLetters == 0) {
        System.out.println(result);
        return;
    }
    for (int i = 0; i < alphabet.length(); i++) {
        makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
    }
  }
  public static void main(String[] args) {
    makeWords(2, "", "abc");
  }
}
