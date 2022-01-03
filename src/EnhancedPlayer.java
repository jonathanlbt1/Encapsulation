public class EnhancedPlayer {

    private String name;
    private int htiPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if(health > 0 && health <= 100) {
            this.htiPoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.htiPoints = this.htiPoints - damage;
        if (this.htiPoints <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return htiPoints;
    }
}
