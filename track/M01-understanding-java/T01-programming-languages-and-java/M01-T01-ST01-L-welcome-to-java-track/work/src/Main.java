    class Player {
    String name;
    int health;
    int score;
    Player(String name, int health, int score) {
        this.name = name;
        this.health = health;
        this.score = score;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Score: " + this.score);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Alex", 100, 50);
        player.display();
    }
}

