package strategy_pattern;

public class Knight extends Character{
    @Override
    public void fight() {
        System.out.println("Kinght is fighting: "+weapon.useWeapon());
    }
}
