import java.util.Random;
public class Berserker extends Adventurer{
    private int Bloodlust;
    private int BloodlustMax;

    public Berserker (String name) {
      this(name, 100);
    }
    public Berserker(String name, int hp, int specialmax) {
      super(name, hp);
      this.Bloodlust = 0;
      this.BloodlustMax = specialmax;
    }


}
