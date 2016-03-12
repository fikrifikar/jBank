import java.text.DecimalFormat;
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
   // instance variables - replace the example below with your own
    private char acctType;
    private static double balance;
    private int accountNumber;
    private static int deposit;
    private static boolean trueNumber;
    private String id;
    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
      
    }
    public Account(char type, double amount){
    }
    public static void deposit(double amount){
       
   }
    
    public char getAcctType(){ 
        return acctType;
    }
    /**method*/
    private double getBalance(){ 
        return balance;
    }
    /**method*/
    public String getId(){ 
        return id;
    }
    /**method*/
    public int getAccountNumber(int accountNumber){ 
        return acctType;
    }
    /**method*/
    private void setBalance(int amount){ 
        this.balance = amount;
    }
    /**method*/
    public void setID(String acctId){ 
        this.id = acctId;
    }
    /**method*/
    public void setAcctType(char type){ 
        this.acctType = type;
    }
}