import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Berserker berserker = new Berserker("Thing1", 20);
    CodeWarrior codewarrior = new CodeWarrior("Thing2", 12);
    boolean done = true;
    Scanner userInput = new Scanner(System.in);
    while (done) {
      System.out.println("Berserker (You): " + berserker.getName() + ", " + berserker.getHP() + "/" + berserker.getmaxHP() + ", " + berserker.getSpecial() + "/" + berserker.getSpecialMax());
      System.out.println("CodeWarrior (Enemy): " + codewarrior.getName() + ", " + codewarrior.getHP() + "/" + codewarrior.getmaxHP() + ", " + codewarrior.getSpecial() + "/" + codewarrior.getSpecialMax());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String choice = userInput.nextLine();
      if (choice.equals("a") || choice.equals("attack")) {
        berserker.attack(codewarrior);
      }
      if (choice.equals("sp") || choice.equals("special")) {
        System.out.println(choice);
      }
      if (choice.equals("su") || choice.equals("support")) {
        System.out.println(choice);
      }
      if (choice.equals("quit")) {
        done = false;
      }
      done = false;
    }
  }
}
