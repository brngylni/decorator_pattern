/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_hw3.concrete;
import ceng431_hw3.abstract_layer.Entity;
import ceng431_hw3.abstract_layer.PlayerCharacter;
import ceng431_hw3.abstract_layer.Itemiser;
/**
 *
 * @author hp
 */
public class Jeweliser extends Itemiser{

    public Jeweliser(PlayerCharacter character) {
        super(character);
    }
    
    
    @Override
    public double calculateBonusMana(){
        return items.stream().mapToDouble(a -> a.bonuses[2]).sum();
    }
    @Override
    public double calculateBonusHealth(){
        return items.stream().mapToDouble(a -> a.bonuses[3]).sum();
    }

    @Override
    public double calculateBonusDamage() {
        return 0;
    }

    @Override
    public double calculateBonusArmor() {
        return 0;
    }

    @Override
    public String getDescription() {
        return character.getDescription();
    }

    @Override
    public void duel(Entity target) {
        character.duel(target);
    }
    
}
