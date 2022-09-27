import java.util.Random;

public class SnakeLadder_UC3 {
    public static void main(String[] args) {
        int dice1;
        int position = 0;
        Random rand = new Random();
        System.out.println("Start the game");
        dice1 = rand.nextInt(6) + 1;
        System.out.println("Dice rolls "+dice1);

        int choose = (int) (Math.random() * 10) % 3;
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
}