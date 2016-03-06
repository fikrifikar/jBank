
/**
 * Write a description of class Account here.
 * 
 * @author (Ahmad Fikri) 
 * @version (27-2-2016)
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
        this.acctType = 'S';
        this.balance = 10.00 ;
    }
    public Account(char type, double amount){
    }
    public static void deposit(double amount){
        //sekarang deposit dapat diakses oleh semua class
    }
    /**method deposit menggunakan variabel amount
     * @param jika amount negatif maka akan kembali ke false
     * @param jika positif maka menambah nilai dari balance
     * @return mengembalikan "false jika tidak positif
     * @return mengembalikan ke nilai sebenarnya
     */
    public static boolean deposit(int amount) 
    { 
        if (amount < 0) 
             return false;
        else 
            balance = balance + amount;
            return trueNumber;
    }
     public boolean withdraw(double amount)
        {
        boolean result = false;
        System.out.println ("withdraw dari account" + deposit);
        System.out.println ("amount:" + amount);
            if (amount > balance) 
             System.out.println ("dana tidak cukup");
        else {
            balance -= amount;
            System.out.println ("new Balance: " + balance);
        }
        System.out.println();
            return result;
        } 
        /**method*/
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
        this.accountNumber = accountNumber;
        balance = 40000;
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
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
