import java.util.Scanner;

public class BankingApp {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String RESET = "\033[0m";
        
        final String DASHBOARD = "💰 Welcome to Smart Banking App"; 
        final String NEW_ACCOUNT = "➕ Open New Account";
        final String DEPOSIT_MONEY = "Deposit Money";
        final String WITHDRAW_MONEY = "Withdraw Money";
        final String TRANSFER_MONEY = "Trasnfer Money";
        final String ACCOUNT_BALANCE = "Check Account Balance";
        final String DELETE_ACCOUNT = "Drop Existing Account";
        final String EXIT = "Exit";

        final String ERR_MSG = String.format("\t%s%s%s", COLOR_RED_BOLD,"%S",RESET);
        
        String screen = DASHBOARD;

        do{
            System.out.println(CLEAR);
            final String APP_TITLE = String.format("%s%s%s", COLOR_BLUE_BOLD, screen, RESET);
            
            System.out.println("\t" + APP_TITLE + "\n");

            switch(screen){
                case DASHBOARD:
                    System.out.println("\t[1]. Open New Account");
                    System.out.println("\t[2]. Deposit Money");
                    System.out.println("\t[3]. Withdraw Money");
                    System.out.println("\t[4]. Trasfer Money");
                    System.out.println("\t[5]. Check Account Balance");
                    System.out.println("\t[6]. Drop Existing Account");
                    System.out.println("\t[7]. Exit");
                    System.out.println();
                    System.out.print("\tEnter an option to continue: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    switch(option){
                        case 1: screen = NEW_ACCOUNT; break;
                        case 2: screen = DEPOSIT_MONEY; break;
                        case 3: screen = WITHDRAW_MONEY; break;
                        case 4: screen = TRANSFER_MONEY; break;
                        case 5: screen = ACCOUNT_BALANCE; break;
                        case 6: screen = DELETE_ACCOUNT; break;
                        case 7: screen = EXIT; break;
                        default: continue;
                    }
                    break;
                
                case NEW_ACCOUNT:

                int random = (int)Math.floor(Math.random()*10000);
                    

                default: System.exit(0);
            }

        }while(true);


    }
}