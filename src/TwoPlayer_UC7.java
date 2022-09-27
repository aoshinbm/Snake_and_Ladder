import java.util.Random;

public class TwoPlayer_UC7 {
    static int dice1,dice2,dice3,move=0,position=0;

    static void SnakeLadder() {
        Random rand = new Random();
        System.out.println("Start the game");
        int choose = rand.nextInt(3);
        switch (choose) {
            case 1: System.out.println("Whooo Ladder..!!");
                position += dice1;
                dice1= rand.nextInt(7)%10;
                System.out.println("Dice rolls "+dice1);
                position += dice1;
                System.out.println("Position " +position);
                break;
            case 2: System.out.println("Ohhhh Nooo Snake..!!");
                while ((position-dice1) != 0) {
                    position= position-dice1;
                }
                System.out.println("Position " +position);
                break;
            default: System.out.println("Invalid choice..!!!!");
                break;
        }
    }

    static void WinPosition(){
        while(position!=100){
            position+=dice1;
            System.out.print(" "+position);

        }
        System.out.println("\n-----------YOU WINNNNNNN-------");
    }
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Start the game");
        dice1= rand.nextInt(7)%10;
        System.out.println("Dice rolls "+dice1);
        if(dice1==6) {
            System.out.println(" START playing from Start Position");
            dice2 = rand.nextInt(7)%10;
            System.out.println("Roll dice again "+dice2);
            SnakeLadder();
            WinPosition();
            if(dice2==6) {
                System.out.println("Place next coin at START position");
                dice3 = rand.nextInt(7)%10;
                System.out.println("Roll dice again "+dice3);
                SnakeLadder();
                WinPosition();
                if(dice3==6) {
                    System.out.println("Triple 6 is equal to null.");
                    System.out.println("NEXT PLAYER");
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