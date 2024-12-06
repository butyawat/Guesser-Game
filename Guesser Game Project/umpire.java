import java.util.Scanner;

class Guesser{
    int GuesserNum;
    public int GuessNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser guess your number ");
        GuesserNum = sc.nextInt();
        return GuesserNum; 
    }
}
class player{
    int playerNum;
    public int GuessNum(){
        Scanner sc = new Scanner(System.in);
        playerNum = sc.nextInt();
        return playerNum;
    }
}
public class umpire {

    
}



public class GuesserGame {
    public static void main(String[] args) {
        
    }
}
