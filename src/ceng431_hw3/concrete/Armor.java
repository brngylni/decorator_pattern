/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw3.concrete;
import ceng431_hw3.abstract_layer.Item;
/**
 *
 * @author hp
 */
public class Armor extends Item{
    
    public Armor(double armor) {
        bonuses[1] = armor;
    }
}
