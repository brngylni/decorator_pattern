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
public abstract class Monster implements Entity{
    protected double damage;
    protected double armor;
    protected double health;
    protected double x, y;
    
    
    @Override
    public void attack(Entity target) {
        target.takeDamage(damage);
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
    
    
}
