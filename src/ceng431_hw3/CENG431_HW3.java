/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw3;
import ceng431_hw3.abstract_layer.PlayerCharacter;
import ceng431_hw3.abstract_layer.Itemiser;
import ceng431_hw3.concrete.*;

/**
 *
 * @author hp
 */
public class CENG431_HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Core characters with no items.
        PlayerCharacter warrior = new Warrior();
        PlayerCharacter mage = new Mage();
        PlayerCharacter assasin = new Assasin();
        
        
        
        // Give a weapon to the warrior
        Itemiser warriorWeaponiser = new Weaponiser(warrior);
        warriorWeaponiser.addItem(new Weapon(100));
        
        
        // Give a jewelery to the mage
        Itemiser mageJeweliser = new Jeweliser(mage);
        mageJeweliser.addItem(new Jewelery(100, 100));
        
        // Give an armor to the assasin
        Itemiser assasinArmoriser = new Armoriser(assasin);
        assasinArmoriser.addItem(new Armor(100));
        
        // Give an additional armor to warrior
        Itemiser warriorArmoriser = new Armoriser(warriorWeaponiser);
        warriorArmoriser.addItem(new Armor(100));
        
        
        System.out.println(warriorArmoriser);
        System.out.println(mageJeweliser);
        System.out.println(assasinArmoriser);
        
        
        Thread th1 = new Thread(() -> warriorArmoriser.duel(assasinArmoriser));
        Thread th2 = new Thread(() -> assasinArmoriser.duel(warriorArmoriser));
        th1.start();
        th2.start();
        
        System.out.println("A duel Started between Warrior and Assasin!");
        while(true){
            if(th1.isAlive() && !th2.isAlive()){
                th1.interrupt();
                System.out.println("Winner is the assasin");
                break;
            }else if(!th1.isAlive() && th2.isAlive()){
                th2.interrupt();
                System.out.println("Winner is the warrior");
                break;
            }else if(!th1.isAlive() && !th2.isAlive()){
                System.out.println("DRAW!");
                break;
            }
            else{
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    System.out.println("There's been an error");
                }
            }
        }
        
        
        
        
        
    }
    
}
