package strategy_pattern;

import strategy_pattern.behavior.AxeBehavior;
import strategy_pattern.behavior.BowAndArrowBehavior;
import strategy_pattern.behavior.KnifeBehavior;
import strategy_pattern.behavior.SwordBehavior;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();

        Character queen = new Queen();
        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.fight();

        Character knight = new Knight();
        knight.setWeaponBehavior(new AxeBehavior());
        knight.fight();

        Character troll = new Troll();
        troll.setWeaponBehavior(new KnifeBehavior());
        troll.fight();
    }
}
