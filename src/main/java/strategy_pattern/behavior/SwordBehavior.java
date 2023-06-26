package strategy_pattern.behavior;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public String useWeapon() {
        return "Killing via sword.";
    }
}
