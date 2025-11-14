//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        int plwins = 0;
        int cpuwins = 0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        Deck decky = new Deck();
        decky.popDeck();
        decky.shuffleDeck();
        System.out.println(decky);
        while(plwins < 3 & cpuwins < 3){
            System.out.println("Choose a card 1-51");
            int plchoice = scan.nextInt();
            System.out.println("Player choice is: \n" + decky.fetchCard(plchoice - 1));
            int cpuchoice = rand.nextInt(52 - plchoice + 1) + plchoice;
            System.out.println("CPU Choice is: \n" + decky.fetchCard(cpuchoice));
        }
    }
}