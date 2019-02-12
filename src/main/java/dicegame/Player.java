package dicegame;

/**
 * Player class.
 * 
 * @author Sebastian Berge
 * @version 1.0.0
 */
public class Player {
    private String name;
    private int value;

    public Player(String name, int value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
}