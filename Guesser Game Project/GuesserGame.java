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
class umpire {
    int Guesser_num;
    int player1;
    int player2; 
    int player3; 
    public void collectNumberGuesser(){
        Guesser gu = new Guesser();
        Guesser_num = gu.GuessNum();
    }
    public void collectPlayernum(){
        player pl = new player();
        System.out.println("Player1 guess your number ");
        player1 = pl.GuessNum(); 
        System.out.println("Player2 guess your number");
        player2 = pl.GuessNum();
        System.out.println("Player2 guess your number");
        player3 = pl.GuessNum();
        
    }
    void compare(){
        if(Guesser_num == player1){
            if(Guesser_num == player2 && Guesser_num == player3){
                System.out.println("All players won the game ");
            }
            else if(Guesser_num == player2){
                System.out.println("Player1 and Player2 won the game");
            }
            else if(Guesser_num == player3){
                System.out.println("Player1 and Player3 won the game");
            }
            else{
                System.out.println("Player1 won the game");
            }
        }
        else if(Guesser_num == player2){
            if (Guesser_num==player3) {
                System.out.println("Player1 and Player2 won the game");    
            }
            else{
                System.out.println("Player2 won the game ");
            }
        }
        else if(Guesser_num== player3){
            System.out.println("Player3 won the game");
        }
        else{
            System.out.println("All player lost the game ");
        }
    }
}
public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("---------Start the game---------");
        umpire u = new umpire();
        u.collectNumberGuesser();
        u.collectPlayernum();
        u.compare();
        System.out.println("---------Game over---------");
    }
}
