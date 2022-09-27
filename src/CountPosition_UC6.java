import java.util.Random;

public class CountPosition_UC6 {
    public static void main(String[] args) {
        int dice1,position=0,reach=0,count=1;
        Random rand = new Random();
        System.out.println("Start the game");
        System.out.println("Current position of the player is at START");
        dice1 = rand.nextInt(6) ;
        System.out.println("Dice rolls "+dice1);
        position=position+dice1;

        while(position<=100){
            dice1= rand.nextInt(6);
            count++;
            position+=dice1;
            System.out.print(" "+position);
        }
        System.out.println("\nThe number of times "+count+"the dice was played to win the game");
    }
}