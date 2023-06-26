package strategy_pattern.behavior;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public String useWeapon() {
        return "Killing via axe.";
    }
}
