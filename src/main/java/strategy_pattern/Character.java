package strategy_pattern;

import strategy_pattern.behavior.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weapon;
    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior w){
        this.weapon = w;
    }
}
