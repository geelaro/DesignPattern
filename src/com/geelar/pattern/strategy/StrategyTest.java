package com.geelar.pattern.strategy;

/**
 * 演示Strategy Pattern
 */
public class StrategyTest {

    public static void main(String[] args) {

        RoleA roleA = new RoleA("RoleA");

        roleA.setAttackBehavior(new AttackJY())
                .setDisplayBehavior(new DisplayNS())
                .setDefendBehavior(new DefendTBS())
                .setRunBehavior(new RunLBWB());
        System.out.println(roleA.name + ":");
        roleA.attack();
        roleA.run();
        roleA.display();
        roleA.defend();

        RoleB roleB = new RoleB("RoleB");
        roleB.setFlyBehavior(new FlyGDY())
                .setAttackBehavior(new Attack18Z())
                .setRunBehavior(new RunLBWB())
                .setDefendBehavior(new DefendTBS());

        System.out.println(roleB.name + ":");
        roleB.run();
        roleB.attack();
        roleB.defend();
        roleB.fly();
    }
}
