package dicegame.servlets;

import dicegame.Player;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DiceGame")
public class GameController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Player[] players = null;

    @Override
    public void init() throws ServletException {
        players = new Player[10];
    }

    /**
     * doGet
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    /**
     * doPost
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}