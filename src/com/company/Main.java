package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(45);
        boss.setTypeOfProtection("Атака");
        System.out.println("Health = " + boss.getHealth() + "\n" + "Damage = " + boss.getDamage() + "\n" + "TypeOfProtection = " + boss.getTypeOfProtection());

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_" +  "\n"+ "-_-_-_-_-_-_-_-_-_-_-_-_");

        Hero[] hero = createHeroes();
        for (Hero h : hero){
            System.out.println("Health = " + h.getHealth() + "\n" + "Damage = "+ h.getDamage() + "\n" +"Superpower = " + h.getSuperpower() + "\n"+
            "------------");
        }
    }

    public static Hero[] createHeroes() {
        Hero h1 = new Hero(150, 25, "может летать");

        Hero h2 = new Hero(155, 20, "защита");

        Hero h3 = new Hero(15, 200);

        Hero heros[] = new Hero[]{h1, h2, h3};

        return heros;
    }
}
