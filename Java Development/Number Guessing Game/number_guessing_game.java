import java.util.*;
import javax.swing.JOptionPane;
public class number_guessing_game
{
    public static void main(String args[])
    {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userNumber = 0;
        int count = 1;
        try{
            while(userNumber != computerNumber){
                String response = JOptionPane.showInputDialog(null,"Enter a guess between 1-100");
                userNumber = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + determineGuess(userNumber , computerNumber,count));
                count ++;
            }
        } catch (Exception e ){
            //to : handle exception 
        }
    }
    public static String determineGuess (int userNumber , int computerNumber , int count){
        if (userNumber <=0 || userNumber >100){
            return "YOUR GUESS IS INVALID ";
        }else if(userNumber == computerNumber){
            return "CORRECT \n TOTAL GUESSES : " + count ; 
        }else if(userNumber > computerNumber){
            return "YOUR GUESS IS TOO HIGH , TRY AGAIN \n TRY NUMBER :" + count;
        }else if(userNumber < computerNumber){
            return "YOUR GUESS IS TOO LOW  , TRY AGAIN \n TRY NUMBER :" + count;
        }else {
            return " YOUR GUESS IS INCORRECT \n TRY NUMBER :" +count;
        }
    }
}