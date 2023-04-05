/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw3.concrete;
import ceng431_hw3.abstract_layer.Monster;
/**
 *
 * @author hp
 */
public class Bear extends Monster{

    public Bear() {
        health = 1000;
        damage = 200;
        armor = 200;
    }

    @Override
    public double getHealth() {
        return health;
    }
    
    
    
}
