import java.util.Scanner;
public class ATM_Interface
{
    public static void main(String args[] )
    {
        int bal = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("   WELCOME\n "+
                    "To our ATM Service\n");
            System.out.println("Choose 1 for Withdraw from your xxxx current account");
            System.out.println("Choose 2 for Deposit from your xxxx current account");
            System.out.println("Choose 3 for Check Balance of xxxx");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose among the  following operation you want to perform:");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();
                    if(bal >= withdraw)
                    {
                        bal = bal - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money you want to deposited:");
                    deposit = sc.nextInt();
                    bal = bal + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : "+bal);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}