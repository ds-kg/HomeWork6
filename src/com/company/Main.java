package com.company;

//Создать базовый класс игрока (Player)
//        Унаследовать класс Boss от базового класса
//        Унаследовать класс Warrior от базового класса
//        Унаследовать класс Magical от базового класса
//        Унаследовать класс Mental от базового класса

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setName("BOSS");
        boss.setHealth(850);
        boss.setDamage(70);
        boss.setDefence(30);
        System.out.println(boss.getName() + " " + boss.getHealth() + " " +
                boss.getDamage() + " " + boss.getDefence());

        Warrior warrior = new Warrior();
        warrior.setName("Das1");
        warrior.setHealth(260);
        warrior.setDamage(50);
        warrior.setSuperDamage(80);
        System.out.println(warrior.getName() + " " + warrior.getHealth() + " " +
                warrior.getDamage() + " " + warrior.getSuperDamage());

        Magical magical = new Magical();
        magical.setName("Das2");
        magical.setHealth(270);
        magical.setDamage(60);
        magical.setMagicDamage(90);
        System.out.println(magical.getName() + " " + magical.getHealth() + " " +
                magical.getDamage() + " " + magical.getMagicDamage());

        Mental mental = new Mental();
        mental.setName("Das3");
        mental.setHealth(280);
        mental.setDamage(100);
        mental.setMentalDamage(120);
        System.out.println(mental.getName() + " " + mental.getHealth() + " " +
                mental.getDamage() + " " + mental.getMentalDamage());

    }
}
