package dicegame;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DiceGameServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Player[] players;
    private int count = 0;

    /**
     * Constructor
     */
    public DiceGameServlet() {
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

    /**
     * doGet
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    /**
     * doPost
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}