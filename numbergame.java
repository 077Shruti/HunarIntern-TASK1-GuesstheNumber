import java.util.Random;
import java.util.Scanner;
class game{
    int comp;
    public game(){
        Random rand=new Random();
        comp= rand.nextInt(100);
        System.out.println("Guess the Number from 1 to 100");

    }
    public int Compno(){
        return comp;
    }

}
public class numbergame {
    static int UserInput(){
        int user;
        System.out.println("Enter");
        Scanner sc=new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }
    static void IsCorrect(int i ,int j){
        if(i==j){
            System.out.println("You Guess the Correct Number");
        }
        else if(i>j){
            System.out.println("You Guess the BIG Number than Computer's Number");
        }
        else{
            System.out.println("You Guess the SMALL Number than Computer's Number");
        }
    }
    public static void main(String[] args) {
        int user=0;
        int itteration=0;
        int comp=0;
        game g=new game();
        do{
            user=UserInput();
            comp=g.Compno();
            IsCorrect(user, comp);
            itteration++;
        }while(user!=comp);
        System.out.println("You Guess Number "+itteration+" Itteration");

    }


    
}


