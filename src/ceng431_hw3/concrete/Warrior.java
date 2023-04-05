/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw3.concrete;
import ceng431_hw3.abstract_layer.Entity;
import ceng431_hw3.abstract_layer.PlayerCharacter;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author hp
 */
public class Warrior extends PlayerCharacter{

    public Warrior() {
        health = 400.0;
        damage = 350.0;
        mana = 400.0;
        gold = 200;
        level = 1;
        armor = 100.0;
        x = 0.0;
        y = 0.0;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        return "WarriorCharacter";
    }

    @Override
    public void duel(Entity target) {
        while(target.getHealth() > 0){
            attack(target);
            try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    
                }
        }
    }

    
    
    
    
    
    
    
}
