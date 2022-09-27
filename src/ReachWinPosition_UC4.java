import java.util.Random;

public class ReachWinPosition_UC4 {
    public static void main(String[] args) {
        System.out.println("Snake & Ladder Game");
        System.out.println("Position of the player is at START");
        Random rand = new Random();
        int dice1, position = 0,count=1;
        int dice = rand.nextInt(7);
        System.out.println("Dice roll: " + dice);
        if (dice == 6) {
            System.out.println("Start the game");
            while (position != 100) {
                int choose = rand.nextInt(3);
                switch (choose) {
                    case 1:
                        System.out.println("Whooo Ladder..!!");
                        position += dice;
                        dice1 = rand.nextInt(7) % 10;
                        System.out.println("Dice rolls " + dice1);
                        position += dice1;
                        count++;
                        System.out.println("Position " + position);
                        break;
                    case 2:
                        System.out.println("Ohhhh Nooo Snake..!!");
                        while ((position - dice) != 0) {
                            position = position - dice;
                        }
                        System.out.println("Position " + position);
                        break;
                    default:
                        System.out.println("Invalid choice..!!!!");
                        break;
                }
            }
            System.out.println("\nThe number of times "+count+"the dice was played to win the game");
        }
        else
            {
                System.out.println("Better luck next time");
            }
        }
    }