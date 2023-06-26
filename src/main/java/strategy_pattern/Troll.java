package strategy_pattern;

public class Troll extends Character{
    @Override
    public void fight() {
        System.out.println("Troll is fighting: "+weapon.useWeapon());
    }
}
