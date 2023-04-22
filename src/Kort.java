public abstract class Kort {
    int health;
    long damage;
    String name;

    public String playAgainst(Kort other){
        other.health -= damage;
        if (other.health <= 0) {
            return name + " won against " + other.name;
        }
        else if (other.health > 0) {
            health -= other.damage;
        }
        if (health <= 0) {
            return name + " lost to " + other.name;
        }
        else {
            return "It's a draw";
        }
    }
}
