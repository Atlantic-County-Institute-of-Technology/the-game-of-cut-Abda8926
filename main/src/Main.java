//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        // Declaring RESET so that we can reset the color
        final String RESET = "\u001B[0m";

        // colors and such
        final String CPUCOLOR = "\033[0;31m"; // RED
        final String PLRCOLOR = "\033[0;35m"; // PURPLE
        final String SYSTEMCOLOR = "\033[0;32m"; // GREEN
        int max = 51;
        int min;
        int plwins = 0;
        int cpuwins = 0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        Deck decky = new Deck();
        decky.popDeck();
        decky.shuffleDeck();
        int plchoice;
        int cpuchoice;
        int i = 1;
        System.out.println(SYSTEMCOLOR + "WELCOME TO THE GAME OF CUT! THESE ARE THE RULES: \n" +
                "1. A DECK OF 52 CARDS WILL BE SHUFFLED. \n" +
                "2. YOU WILL CHOOSE ANY CARD EXCEPT FOR THE VERY LAST IN THE STACK, CARDS BELOW YOUR SELECTION WILL BE DISCARDED. \n" +
                "3. THE CPU WILL CHOOSE FROM THE REMAINING CARDS. \n" +
                "4. THE HIGHEST VALUE CARD WINS. IN CASE OF IDENTICAL FACES, SUIT PRIORITY IS AS FOLLOWS: ♠ < ♥ < ♣ < ♦ \n" +
                "ENJOY THE GAME!");
        while(plwins < 3 & cpuwins < 3){
            System.out.println(SYSTEMCOLOR + "ROUND " + i + RESET);
            decky.shuffleDeck();
            System.out.println(SYSTEMCOLOR + "Choose a card 1-51:" + RESET);
            plchoice = scan.nextInt() - 1;
            min = plchoice + 1;
            System.out.println(PLRCOLOR + "Player choice is: \n" + decky.fetchCard(plchoice) + RESET);
            System.out.println(SYSTEMCOLOR + "CPU is choosing.." + RESET);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            cpuchoice = (rand.nextInt(max + 1 - min) + min);
            System.out.println(CPUCOLOR + "CPU Choice is: \n" + decky.fetchCard(cpuchoice) + RESET);
            System.out.println(SYSTEMCOLOR + "Comparing cards..." + RESET);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(decky.fetchCard(plchoice).getFace() == decky.fetchCard(cpuchoice).getFace()){
                if(decky.fetchCard(plchoice).getSuit() > decky.fetchCard(cpuchoice).getSuit()){
                    plwins ++;
                    System.out.println(PLRCOLOR + "Player wins." + RESET);
                }
                else{
                    cpuwins ++;
                    System.out.println(CPUCOLOR + "CPU Wins." + RESET);
                }
            }
            if(decky.fetchCard(plchoice).getFace() > decky.fetchCard(cpuchoice).getFace()){
                plwins ++;
                System.out.println(PLRCOLOR + "Player wins." + RESET);
            }
            if(decky.fetchCard(plchoice).getFace() < decky.fetchCard(cpuchoice).getFace()){
                cpuwins ++;
                System.out.println(CPUCOLOR + "CPU Wins." + RESET);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("SCOREBOARD: \n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println( "CPU SCORE: \n" + cpuwins + "\n");
            System.out.println("PLAYER SCORE: \n" + plwins + "\n");
            i ++;
        }
        if(plwins > cpuwins){
            System.out.println("Player won!!!!!!!!!!!");
        }
        else{
            System.out.println("Player lost!!!!!!!!!!!!!");
        }
    }
}