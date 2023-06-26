package strategy_pattern.behavior;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public String useWeapon() {
        return "Killing via bow & arrow.";
    }
}
