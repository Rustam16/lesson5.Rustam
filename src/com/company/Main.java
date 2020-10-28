package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(23, 45, "защита от лазеров");
        System.out.println("Атака " + boss.getDamage());

        boss.setDamage(30);
        System.out.println("Атака " + boss.getDamage());

    }
}
