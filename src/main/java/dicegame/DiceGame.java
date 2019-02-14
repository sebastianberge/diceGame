package dicegame;

public class DiceGame {
    private Player[] players;
    private int count = 0;

    public DiceGame() {
        this.players = new Player[10];
    }

    /**
     * Method for adding a new player to the game. Maximum two players each game.
     * 
     * @param newPlayer
     */
    public void addPlayer(Player newPlayer) {
        players[count] = newPlayer;
        count++;
    }
}