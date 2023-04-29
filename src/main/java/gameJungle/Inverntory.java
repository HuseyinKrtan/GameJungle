package gameJungle;

public class Inverntory {

    public  boolean water= false;

    public boolean food = false;

    public boolean firewoord = false ;

    public String weaponName ="";

    public String armorName ="";

    public int weaponDamage =0;

    public int armorDamage =0;

    public Inverntory() {
    }

    public Inverntory(boolean water, boolean food, boolean firewoord, String weaponName, String armorName, int weaponDamage, int armorDamage) {
        this.water = water;
        this.food = food;
        this.firewoord = firewoord;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.weaponDamage = weaponDamage;
        this.armorDamage = armorDamage;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewoord() {
        return firewoord;
    }

    public void setFirewoord(boolean firewoord) {
        this.firewoord = firewoord;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDamage() {
        return armorDamage;
    }

    public void setArmorDamage(int armorDamage) {
        this.armorDamage = armorDamage;
    }
}
