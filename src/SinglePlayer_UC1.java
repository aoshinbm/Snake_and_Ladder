public class SinglePlayer_UC1 {
    public static void main(String[] args) {
        System.out.println("Snake & Ladder Game");
        System.out.println("Starting position of the player is at 0");
        int dice = (int)Math.floor(Math.random()*10)%7;
        System.out.println("Dice roll: "+dice);
        if(dice==6)
        {
            System.out.println("Start the game from START position");
        }
        else
        {
            System.out.println("Better luck next time");
        }
    }
}