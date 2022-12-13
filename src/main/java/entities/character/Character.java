package entities.character;

import entities.world.Moveable;
import entities.world.WorldDirections;

/**
 * An abstract class that dictates the functionalities behind a live, movable Character object.
 * Created: 12/10/2022
 * Last updated: 12.13.2022
 *
 * @author MMachado05
 */
public abstract class Character implements Moveable {

    /* ********** *\
    *  Attributes  *
    \* ********** */
    private String name;

    private WorldDirections facing;
}
