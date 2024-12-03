public class ColorDemo {
  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      for(int r = 64; r < 256; r+=16){
          System.out.print("\u001b[38;2;"+r+";0;0;7m ");
        }
      }
    System.out.println();
  }
}
