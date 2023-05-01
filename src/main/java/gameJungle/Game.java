package gameJungle;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Game {






    public void location(){

    }

    public  void start (){
        Scanner input = new Scanner(System.in);
        System.out.println("Macera oyununa hosgeldiniz");
        System.out.println("Lütfen bir isim giriniz");
       // String playerName = input.nextLine();
        Player player = new Player("playerName");

        System.out.println("Sayin " + player.getName() + "bu karanlik ve sisli adaya hosgeldiniz !!");
        System.out.println("Burada yasananların hepsi gercek !!");
        System.out.println("Lutfen bir karakter seciniz");
        player.selectChar();

    }


}
