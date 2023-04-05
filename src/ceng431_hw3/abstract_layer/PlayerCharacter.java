        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw3.abstract_layer;

/**
 *
 * @author hp
 */
public abstract class PlayerCharacter implements Entity{
    protected double health;
    protected double armor;
    protected double damage;
    protected double mana;
    protected double gold;
    protected int level;
    protected double x, y;  
    protected String description;
    
    @Override
    public void attack(Entity target) {
        target.takeDamage(getDamage());
    }

    @Override
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void takeDamage(double damage) {
        health -= damage;
    }
    
    
    // Could have implemented a distance based on x and y of two characters and have a range. If that range is bigger than the distance, attack is possible.
    public abstract void duel(Entity target);

    
    @Override
    public double getHealth() {
        return health;
    }

    public double getArmor() {
        return armor;
    }

    public double getDamage() {
        return damage;
    }

    public double getMana() {
        return mana;
    }

    public double getGold() {
        return gold;
    }

    public int getLevel() {
        return level;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription() + " {" + "health=" + getHealth() + ", armor=" + getArmor() + ", damage=" + getDamage() + ", mana=" + getMana() + ", gold=" + getGold() + ", level=" + getLevel() + '}';
    }
    
    
    
    
    
}
