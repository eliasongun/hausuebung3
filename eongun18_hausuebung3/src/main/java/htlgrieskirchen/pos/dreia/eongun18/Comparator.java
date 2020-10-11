/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlgrieskirchen.pos.dreia.eongun18;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author eongu
 */
public class Comparator implements Comparable<CombatType>{

    List<Weapon> list = new LinkedList<>();

    // sortiert nach damage absteigend
    public void sortByDamage() {

        list.add(new Weapon("Varscona", CombatType.MELEE, DamageType.SLASHING, 11, 3, 5, 4250));
        list.add(new Weapon("Tuigan Bow", CombatType.RANGED, DamageType.MISSILE, 1, 5, 6, 3500));

        list.sort((Weapon o1, Weapon o2) -> Integer.compare(o1.getDamage(), o2.getDamage()));
    }

    public void sortByCombatType() {

        list.add(new Weapon("Varscona", CombatType.MELEE, DamageType.SLASHING, 11, 3, 5, 4250));
        list.add(new Weapon("Tuigan Bow", CombatType.RANGED, DamageType.MISSILE, 1, 5, 6, 3500));
        
       
        
    }

  


    @Override
    public int compareTo(CombatType o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
