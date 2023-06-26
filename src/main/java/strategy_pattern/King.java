package strategy_pattern;

import strategy_pattern.behavior.SwordBehavior;
import strategy_pattern.behavior.WeaponBehavior;

public class King extends Character{
    @Override
    public void fight() {
        System.out.println("King is fighting: "+weapon.useWeapon());
    }
}
