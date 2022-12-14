package entities.assets;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract class for any animate asset in the game.
 * Created: 12.13.2022
 * Created: 12.13.2022
 *
 * @author MMachado05
 */
public abstract class GameCharacter {
    /* ********** *\
    *  Attributes  *
    \* ********** */
    protected final String name;
    protected String description;

    protected int maxHealth;
    protected int health;

    protected int level;

    protected final Item[] inventory;
    
    /* ************ *\
    *  Constructors  *
    \* ************ */
    /**
     * Constructs a default GameCharacter object
     * 
     * @param name This character's name
     * @param description This character's description
     * @param maxHealth This character's default max health
     * @param inventorySize This character's default inventory size
     */
    public GameCharacter(String name, String description, int maxHealth, int inventorySize) {
        this.name = name;
        this.description = description;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.level = 1;
        this.inventory = new Item[inventorySize];
    } 
}
