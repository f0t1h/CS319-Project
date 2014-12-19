package com.group1.game;

import java.util.List;

//import static com.group1.game.Direction.*;

/**
 * Created by Fatih on 27/11/2014.
 */
public class Player extends Character {
    String seed;
    int fullness;
    int heat;
    int strength;
    int sanity;


    /**
     * Constructor for Player, Designed to work both when initialization and loading the game
     *
         * @param name      String name to assign to Player
         * @param inventory List of Items Player has
         * @param x         Location of the Player
         * @param y         Location of the Player
     */

    public Player(String name, List<Item> inventory, int x, int y) {
        super(name, inventory, x, y);
    }

    /**
     * Player moves according to given direction if it is possible,
     * result given with an appropriate string message
     * This method designed to be called from Player object inside Game object inside Parser object
     * game.player.move(Direction.d);
     *
     * @param direction to move
     * @return resulting boolean or string message depending on the implementation
     */
    public String go(Direction direction) {
        switch( direction){
            case North:
                break;
            case East:
                break;
            case South:
                break;
            case West:
                break;
            default:
                break;
        }
        return "Message";
    }

    /**
     * Player interacts with given Thing if it is possible,
     * result given with an appropriate string message
     * This method designed to be called from Player object inside Game object inside Parser object
     * game.player.interact(thing);
     *
     * @param thing to interact
     * @return resulting boolean or string message depending on the implementation
     */
    public String interact(Thing thing) {
        return thing.getMessage();
    }

    /**
     * Player uses given Item if it is possible,
     * result given with an appropriate string message
     * This method designed to be called from Player object inside Game object inside Parser object
     * game.player.use(item);
     *
     * @param item to interact
     * @return resulting boolean or string message depending on the implementation
     */
    public String use(Item item) {
        
        return "Message";
    }

    /**
     * Player takes given Item if it is possible,
     * result given with an appropriate string message
     * Item will be added to players inventory
     * This method designed to be called from Player object inside Game object inside Parser object
     * game.player.take(item);
     *
     * @param item to take
     * @return resulting boolean or string message depending on the implementation
     */
    public String take(Item item) {
        super.getInventory().add(item);
        return "Message";
    }

    /**
     * Player looks to given direction if it is possible,
     * result given with an appropriate string message
     * This method designed to be called from Player object inside Game object inside Parser object
     * game.player.look(Direction.d);
     *
     * @param direction to look
     * @return resulting boolean or string message depending on the implementation
     */
    public String look(Direction direction) {
        return "Message";
    }

    /**
     * Player inspects given thing if it is possible,
     * result given with an appropriate string message
     * This method designed to be called from Player object inside Game object inside Parser object
     * game.player.inspect(item);
     * Reader will understand look Thing, as inspect Thing
     *
     * @param thing to take
     * @return resulting boolean or string message depending on the implementation
     */
    public String inspect(Thing thing) {

        return thing.getMessage();
    }

    public String getSeed() {
        return seed;
    }

    public int getFullness() {

        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSanity() {
        return sanity;
    }

    public void setSanity(int sanity) {
        this.sanity = sanity;
    }
}
