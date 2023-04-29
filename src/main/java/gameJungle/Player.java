package gameJungle;

public class Player {

   Inverntory inverntory = new Inverntory();

    public  int damage = 0;

    public  int healty = 0 ;

    public int money = 0 ;

    String name ="";


    public void selectChar(){

    }

    public Player(Inverntory inverntory, int damage, int healty, int money, String name) {
        this.inverntory = inverntory;
        this.damage = damage;
        this.healty = healty;
        this.money = money;
        this.name = name;
    }

    public Player() {
    }

    public Inverntory getInverntory() {
        return inverntory;
    }

    public void setInverntory(Inverntory inverntory) {
        this.inverntory = inverntory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
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
}
