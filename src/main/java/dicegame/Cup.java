package dicegame;

import java.util.Random;

/**
 * Cup class.
 * 
 * @author Sebastian Berge
 * @version 1.0.0
 */
public class Cup {
    private int id;
    private int sum;

    /**
     * Empty constructor for the class Cup.
     */
    public Cup() {

    }

    /**
     * Method for rolling the cup.
     */
    public String rollDices() {
        Dice diceOne = new Dice();
        Dice diceTwo = new Dice();
        Random random = new Random();

        diceOne.setValue(random.nextInt(6) + 1);
        diceTwo.setValue(random.nextInt(6) + 1);

        return diceOne.getValue() + "" + diceTwo.getValue() + "";
    }

    /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    public void setSum(int sum) {
        this.sum = sum;
    }
}