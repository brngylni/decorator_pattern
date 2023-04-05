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
public class Assasin extends PlayerCharacter{

    public Assasin() {
        health = 300.0;
        damage = 400.0;
        mana = 350.0;
        gold = 200;
        level = 1;
        armor = 60.0;
        x = 0.0;
        y = 0.0;
    }

    @Override
    public String getDescription() {
        return "AssasinCharacter";
    }

    @Override
    public void duel(Entity target) {
        while(target.getHealth() > 0){
            attack(target);
            try{
                    Thread.sleep(650);
                }catch(InterruptedException e){
                }
        }
    }
    
    
    
}
