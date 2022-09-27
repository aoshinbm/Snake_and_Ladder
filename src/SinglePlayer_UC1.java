import java.util.Random;

public class SinglePlayer_UC1 {
    public static void main(String[] args) {
        int dice1,dice2,dice3,move;

        Random rand = new Random();
        System.out.println("Start the game");
        dice1= rand.nextInt(7)%10;
        System.out.println("Dice rolls "+dice1);
        if(dice1==6) {
            System.out.println("Start from 1st position i.e. START playing");
            dice2 = rand.nextInt(7)%10;
            System.out.println("Roll dice again "+dice2);
            if(dice2==6) {
                System.out.println("PLace next coin at the starting position");
                dice3 = rand.nextInt(7)%10;
                System.out.println("Roll dice again "+dice3);
                if(dice3==6) {
                    System.out.println("Triple 6 is equal to null.");
                    System.out.println("STOP..!!!");
                }
                else {
                    move=dice2+dice3;
                    System.out.println("Move forward "+move+" steps");
                }
            }
            else {
                System.out.println("Move forward "+dice2+" steps");
            }
        }
        else {
            System.out.println("Better luck next time");
        }
    }
}