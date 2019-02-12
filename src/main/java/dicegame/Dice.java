package dicegame;

/**
 * @author Sebastian Berge
 * @version 1.0.0
 */
public class Dice {
    private int id;
    private int value;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
}