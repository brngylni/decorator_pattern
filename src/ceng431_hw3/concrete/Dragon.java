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
public class Dragon extends Monster {

    public Dragon() {
        health = 10000;
        damage = 1000;
        armor = 1000;
    }

    @Override
    public double getHealth() {
        return health;
    }
    
    
    
}
