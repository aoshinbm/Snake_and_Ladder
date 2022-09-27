import java.util.Random;

public class WinPosition_UC5 {
    public static void main(String[] args) {
        int dice1,position=0,reach=0,dice2;
        Random rand = new Random();
        System.out.println("Start the game");
        System.out.println("Dice rolls ");
        dice1 = rand.nextInt(6) ;
        System.out.println("Current position of the player is "+dice1);
        position=position+dice1;

        while(position!=100){
            dice1= rand.nextInt(6);
            position+=dice1;
            System.out.print(" "+position);

        }
        System.out.println("\n-----------YOU WINNNNNNN-------");
    }
}