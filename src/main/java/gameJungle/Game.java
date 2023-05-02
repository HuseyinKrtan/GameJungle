package gameJungle;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Game {






    public void location(){

    }

    public  void start () {
        Scanner input = new Scanner(System.in);
        System.out.println("Macera oyununa hosgeldiniz");
        System.out.println("Lütfen bir isim giriniz");
        // String playerName = input.nextLine();
        Player player = new Player("playerName");

        System.out.println("Sayin " + player.getName() + " bu karanlik ve sisli adaya hosgeldiniz !!");
        System.out.println("Burada yasananların hepsi gercek !!");
        System.out.println("Lutfen bir karakter seciniz");
        player.selectChar();

        Location location =null;
        while (true) {
            System.out.println();
            System.out.println("===========  Bolgeler  ================>");
            System.out.println();
            System.out.println("1 - Guvenli Ev -->Burada düsman bulunmamaktadir ");
            System.out.println("2 - Magaza --> Silah ve Zırh satın alabilirisniz");
            System.out.println("Lutfen gıtmek istediginiz bolgeyi seciniz :");
            int selectLoc=input.nextInt();
            switch (selectLoc){
                case 1:
                    location=new SafeHouse(player);
                    break;
                case 2:
                    location=new ToolStore(player);
                    break;
                default:
                    location=new SafeHouse(player);

            }
            System.out.println(location.getName());
            if(!location.onLocation()){
                System.out.println("GAME OVER!");
                break;
            }

        }
    }

}
