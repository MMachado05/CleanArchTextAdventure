package entities.world;

import entities.world.Habitable;

/**
 * An interface for any object that can move, be it automatically or by a user
 * Created: 12.11.2022
 * Last updated: 12.11.2022
 *
 * @author MMachado05
 */
public interface Moveable {

    /**
     * Have this Moveable enter the provided Habitable
     *
     * @param entering the Habitable object this Moveable is being moved into
     */
    void moveInto(Habitable entering);

    /**
     * Have this Moveable exit the provided Habitable
     * @param exiting
     */
    void moveOutOf(Habitable exiting);
}
