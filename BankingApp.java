import java.util.Scanner;

public class BankingApp {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String RESET = "\033[0m";
        
        final String DASHBOARD = "💰 Welcome to Smart Banking App"; 
        final String NEW_ACCOUNT = "+ Open New Account";
        final String DEPOSIT_MONEY = "Deposit Money";
        final String TRANSFER_MONEY = "Trasnfer Money";
        final String ACCOUNT_BALANCE = "Check Account Balance";
        final String DELETE_ACCOUNT = "Drop Existing Account";
        final String EXIT = "Exit";

        final String ERR_MSG = String.format("\t%s%s%s", COLOR_RED_BOLD,"%S",RESET);
        
        String screen = DASHBOARD;

        do{
            System.out.println(CLEAR);
            final String APP_TITLE = String.format("%s%s%s", COLOR_BLUE_BOLD, screen, RESET);
            
        }while(true);


    }
}