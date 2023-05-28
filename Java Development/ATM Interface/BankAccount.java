import java.util.*;

public class BankAccount {

    String name;
    String userName;
    String password;
    String accountNo;
    float balance = 100000f;
    int transactions = 0;
    String transactionHistory = "   ";
   

    public void register() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter your Name --- ");
        this.name = sc.nextLine();   // name 

        System.out.println("\n Enter your userName --- ");
        this.userName = sc.nextLine();   // username 

        System.out.println("\n Enter your password --- ");
        this.password = sc.nextLine();   // password 

        System.out.println("\n Enter your account number --- ");
        this.accountNo = sc.nextLine();   // account number 
        System.out.println("\n Regestration completed .. kindly login");
    }

     public boolean login()
    {
        boolean isLogin = false ;
        Scanner sc = new Scanner (System.in);
        while(!isLogin) {
            System.out.print("\n Enter your username --");
            String userName = sc.nextLine();
            if (userName.equals(userName)){
                while(!isLogin) {
                    System.out.print("\n Enter your password --");
                    String password = sc.nextLine();
                    if(password.equals(password)){
                        System.out.print("\n Login sucessful !!");
                        isLogin = true ;
                    }else{
                        System.out.println("\n Incorrect password ");
                    }
                }
            }
            else{
                System.out.println("\n username not found ");
            }
        }
        return isLogin;
    }
            
    public void withdraw()  
    {

        System.out.print("\n Enter amount to withdraw --");
        Scanner sc = new Scanner (System.in);
        float amount = sc.nextFloat();
        try {

            if (balance >= amount ) {
                transactions++;
                balance -= amount ;
                System.out.println("\n withdraw successfully --");
                String str = amount + "Rs withdrawed\n";
                transactionHistory = transactionHistory.concat(str);
            }
            else{
                    System.out.println("\n Insufficient Balance ");
            }
        } 
        catch (Exception e) { 
        }
                
    }

    public void deposit()  
    {

        System.out.print("\n Enter amount to deposit ---");
        Scanner sc = new Scanner ( System.in);
    
        float amount = sc.nextFloat();
        try {
            if (amount <= 100000f){
                transactions++;
                balance += amount;
                System.out.println("\n Successfully deposited");
                String str = amount + " Rs deposited \n";
                transactionHistory = transactionHistory.concat(str);

            }else{
                    System.out.println("\n Sorry... Limit is 100000.00");
            }
        }
        catch(Exception e){
        }
    }

    public void transfer () 
    {
        Scanner sc = new Scanner ( System.in);
        System.out.print("\n Enter Receipent's name ---");
        String receipent = sc.nextLine();
        System.out.print("\n Enter amount to transfer --");
        float amount = sc.nextFloat();
        try {
            if (balance >= amount ){
                if(amount <= 50000f){
                    transactions++ ;
                    balance -= amount;
                    System.out.println("\n Successfully transfered to  " + receipent);
                    String str = amount +" Rs transfered to" + receipent + "\n";
                    transactionHistory = transactionHistory.concat(str);
                }
                else{
                    System.out.println("\n Sorry...Limit is 50000.00");
                }
            }else{
                    System.out.println(" \n Insufficient Balance ");
            }
        }
        catch (Exception e){
        }
    }

    public void checkBalance()
    {
        System.out.println("\n " + balance + "Rs");
    }

    public void transactionHistory()
    {
        if ( transactions == 0 ){
            System.out.println("\nEmpty");
        }else{
                System.out.println("\n" + transactionHistory);
        }
    }

    public class  ATMinterface 
    {

         public static int  takeInput (int limit)
        {
            int input = 0;
            boolean flag = false ; 
            

            while ( ! flag ){
            try {
                Scanner sc = new Scanner (System.in);
                input = sc.nextInt ();
                flag = true ;
                if ( flag && input > limit || input < 1){
                    System.out.println("Choose the number between 1 to " + limit);
                    flag = false ;
                }
            }
            catch ( Exception e){
                    System.out.println("Enter only integer value");
                    flag = false ;
                }
            }
            return input;
        }
    



    public static void main (String args[])
    {
        System.out.println ("\n *************** WELCOME TO BOI ATM SYSTEM ****************\n");
        System.out.println("1.Register \n 2.Exit");
        System.out.println("Enter Your Choice ---");
        int choice = takeInput(2);

        if ( choice == 1) 
        {
            BankAccount b = new BankAccount () ;
            b.register();
            while(true) 
            {
                System.out.println("\n1.Login \n 2.Exit");
                System.out.println("Enter Your Choice --");
                int ch = takeInput(2);
                    if (ch == 1)    {
                         if (b.login()) {
                            System.out.println("\n\n************ WELCOME BACK " + b.name + "***********\n");
                            boolean isFinished = false;
                            while ( ! isFinished)   {
                                System.out.println("\n 1.Withdraw \n 2.Deposit \n 3.Transfer \n 4.Check Balance \n 5.Transaction History" );
                                System.out.println (" \n Enter Your Choice --");
                                int c =  takeInput(6);

                                switch (c){
                                case 1 :
                                b.withdraw();
                                break;

                                case 2 :
                                b.deposit();
                                break;

                                case 3 :
                                b.transfer();
                                break;

                                case 4 :
                                b.checkBalance();
                                break;

                                case 5 :
                                b.transactionHistory();
                                break;

                                case 6 :
                                isFinished = true ;
                                break;
                                }
                            }
                        }
                    }
                    else{
                        System.exit (0);
                    }
                }
            }
        }
    };
}