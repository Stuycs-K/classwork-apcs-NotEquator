import java.util.Random;
public class Berserker extends Adventurer{
    private int Bloodlust;
    private int BloodlustMax;

    public Berserker (String name) {
      this(name, 100);
    }
    public Berserker(String name, int hp) {
      super(name, hp);
      this.Bloodlust = 0;
      this.BloodlustMax = 100;
    }

    public String getSpecialName() {
      return "Bloodlust";
    }
    public int getSpecial() {
      return Bloodlust;
    }
    public void setSpecial(int n) {
      Bloodlust = n;
    }
    public int getSpecialMax() {
      return BloodlustMax;
    }

    public String attack(Adventurer other) {
      Random rng = new Random();
      int damage = rng.nextInt(10) + 10;
      other.applyDamage(damage);
      setSpecial(getSpecial() + damage);
      return super.getName() + " did " + damage + " to " + other.getName() + "!";
    }
    public String support(Adventurer other) {
      other.setHP(other.getHP() + 10);
      return super.getName() + " healed " + other.getName() + " for 10 HP!";
    }
    public String support() {
      super.setHP(super.getHP() + 15);
      return super.getName() + " healed themselves for 15 HP!";
    }
    public String specialAttack(Adventurer other) {
      if (Bloodlust != 100) {
        return super.getName() + " does NOT lust for enough blood!";
      }
      Random rng = new Random();
      int damage = rng.nextInt(20) + 15;
      other.applyDamage(damage);
      setSpecial(0);
      super.setHP(super.getHP() + 20);
      return super.getName() + " used their Bloodlust to heal 20 HP and do " + damage + " to " + other.getName() + "!";
    }
}
