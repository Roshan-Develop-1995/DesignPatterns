package strategy_pattern;

public class Queen extends Character{
    @Override
    public void fight() {
        System.out.println("Queen is fighting: "+weapon.useWeapon());
    }
}
