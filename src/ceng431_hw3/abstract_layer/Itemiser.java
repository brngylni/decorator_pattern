/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw3.abstract_layer;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public abstract class Itemiser extends PlayerCharacter{
    protected PlayerCharacter character;
    protected List<Item> items = new ArrayList<>();

    public Itemiser(PlayerCharacter character) {
        this.character = character;
    }
    
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public void removeItem(Item item){
        items.remove(item);
    }

    @Override
    public void takeDamage(double damage) {
        character.takeDamage(damage);
    }

    
    
    public abstract double calculateBonusDamage();
    public abstract double calculateBonusHealth();
    public abstract double calculateBonusArmor();
    public abstract double calculateBonusMana();

    @Override
    public double getDamage() {
        return character.getDamage() + calculateBonusDamage();
    }

    @Override
    public double getMana() {
        return character.getMana() + calculateBonusMana(); 
    }

    @Override
    public double getArmor() {
        return character.getArmor() + calculateBonusArmor();
    }

    @Override
    public double getHealth() {
        return character.getHealth() + calculateBonusHealth(); 
    }

    @Override
    public int getLevel() {
        return character.getLevel();
    }
    
    
    
    
    
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
