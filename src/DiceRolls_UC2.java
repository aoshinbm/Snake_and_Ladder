import java.util.Random;

public class DiceRolls_UC2 {
    public static void main(String[] args) {
        System.out.println("Snake & Ladder Game");
        Random rand = new Random();
        int dice = rand. nextInt(7)%10;
        System.out.println("Dice rolls "+dice);
    }
}