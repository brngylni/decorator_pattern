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
public class Armoriser extends Itemiser{

    public Armoriser(PlayerCharacter character) {
        super(character);
    }
    
    
    
    @Override
    public double calculateBonusArmor(){
        return items.stream().mapToDouble(a -> a.bonuses[1]).sum();
    }

    @Override
    public double calculateBonusDamage() {
        return 0;
    }

    @Override
    public double calculateBonusHealth() {
        return 0;
    }

    @Override
    public double calculateBonusMana() {
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
