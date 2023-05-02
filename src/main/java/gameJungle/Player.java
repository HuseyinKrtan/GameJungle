package gameJungle;

import java.util.Scanner;

public class Player {


    private int damage;
    private int health;
    private int money;
    private String charNames;
    private String name;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {


        GameChar[] charListe= {new Samurai(),new Archer(),new Knight()};
        System.out.println("Karakterler");
        System.out.println("==========================================================");
        for (GameChar gameChar:charListe) {
            System.out.println("ID : "+ gameChar.getId()+
                    " Karakter "+gameChar.getName()+
                    "\t Hasar: "+gameChar.getDamage()+
                    "\t  Sağlık: "+gameChar.getHealth()+
                    "\t  Para: "+gameChar.getMoney());
        }
        System.out.println("===============================================================");
        System.out.println("Lutfen bir character seciniz...");
        int selecttChar=input.nextInt();
        switch (selecttChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter : "+this.getCharNames()+
                " , Hasar : "+this.getDamage()+
                " , Saglik : "+this.health+
                " , Para : "+this.getMoney());
    }



    public void initPlayer(GameChar gameChar){
            this.setDamage(gameChar.getDamage());
            this.setHealth(gameChar.getHealth());
            this.setMoney(gameChar.getMoney());
            this.setCharNames(gameChar.getName());

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
