import java.math.*;
import java.util.*;
/**
 * Write a description of class Teller here.
 * 
 * @author (Ahmad Fikri) 
 * @version (12-maret-2016)
 */
public class Teller
{
   private String newCustomer;
   public String Customer;
   public String createNewCustomer;
   public static String fname;
   public static String lname;
   private static Date startTime, closeTime;
   private double creditLine;
   public String DOB;
   public int customerID;
   private String setName;
    // instance variable - menentukan variabel untuk setName
    public static void main(String[] args){
        Customer c = new Customer (fname, lname, (new GregorianCalendar(2016, 03, 10).getTime()));
        System.out.println(c.getDateOfBirth());
        Account saving = new Account (1000.0);
        Account invest = new Account (1000.0);
        Account creditline = new Account (500.0);
        BigDecimal bd = new BigDecimal ("tabungan*sukubunga");
        double futureinvestment = investment * Math.pow(1+ interest,years*12);
        DecimalFormat f = new DecimalFormat("$,###.00");
        System.out.println("Amount: " + f.format(amount));
        }
    //mengembalikan creditline
    public double getCreditLine(){
        return creditLine;
    }
    /**set credit line*/
    public void setCreditLine(double creditLine){
        this.creditLine = creditLine;
    }
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
        (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;    
    }

  /** Menghitung total pembayaran */
    public double getTotalAmount() {
        double totalAmount = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;    
    }

  /** kembali ke tanggal credit */
    public java.util.Date creditLine() {
        return creditLine;
    }
    private String newCustomer()
    {
        return null;
    }
    public Teller(){
        
    }
    public String createNewCustomer()
    {
        return null;
    }
    public String fname()
    {
        return null;
    }
    public String lname()
    {
        return null;
    }
    public int DOB()
    {
        return 0;
    }
    public int getCustomer ()
    {
        return 0;
    }
    public int customerID()
    {
        return 0;
    }
     public static void setStartTime (int hour, int minute){
        startTime = new GregorianCalendar (2016, 03, 10, hour, minute).getTime();
    }
    public static void getStartTime (int hour, int minute){
        startTime = new GregorianCalendar (2016, 03, 10, hour, minute).getTime();
    }
    public static void setCloseTime (int hour, int minute){
        closeTime = new GregorianCalendar (2016, 03, 10, hour, minute).getTime();
    }
    public static void getCloseTime (int hour, int minute){
        closeTime = new GregorianCalendar (2016, 03, 10, hour, minute).getTime();
    }
    
    private void showAccType(){
        
   }
   public void CustName (String[] args) {
        
         }
        }
         