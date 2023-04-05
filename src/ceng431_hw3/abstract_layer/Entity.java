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
public interface Entity {
    public void attack(Entity target);
    public void move(double x, double y);
    public void takeDamage(double damage);
    public double getHealth();
}
