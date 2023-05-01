package gameJungle;

import java.util.Scanner;

public class Player {


    private int damage;
    private int health;
    private int money;
    private String name;
    private String charNames;


    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {


        GameChar[] charListe= {new Samurai(),new Knight(),new Archer()};
        System.out.println("==============================");
        for (GameChar gameChar:charListe) {
            System.out.println("Karakter "+gameChar.getName()+
                    "\t Hasar: "+gameChar.getDamage()+
                    "\t  Sağlık: "+gameChar.getHealth()+
                    "\t  Para: "+gameChar.getMoney());
        }



    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharNames() {
        return charNames;
    }

    public void setCharNames(String charNames) {
        this.charNames = charNames;
    }
}
