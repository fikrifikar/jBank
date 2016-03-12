import java.util.*;
import java.text.DecimalFormat;
import java.lang.*;
import javax.swing.JTextArea.*;
import java.math.BigDecimal;
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{
     // instance variables - replace the example below with your own
    private static double creditInterestRate;
    private static double investmentInterestRate; 
    private static int lastCustID;
    private static int nextCustID;
    private static String phone;
    private static double premiumInterestRate;
    private static int numOfCurrentCustomer;
    private static int nextID;
    private double interestRate=3.0;
    private double transactionFees=10;
    private Customer[] customers;
    private static Date startTime, closeTime;
    public static double investmentAccount;
    public static String website;
    public static String bankAddress="1234 JavaStreet, Anycity, ThisState, 34567";
    public static int maxNumOfCustomers= 20;
    public static String bankName="JBANK";
    public static int Round_Unnecessary;
    /**
     * Constructor for objects of class Bank
     */
    /**method untuk mendapatkan alamat
     * 
     */
    

    public static String getAddress(){ 
        
        return null;
    }
    public static int getNumOfCurrentCustomer() {
        return numOfCurrentCustomer;
    }
    /**method untuk mendapatkan nilai kredit
     * 
     */
    public static double getCreditRate(){ 
        return 0;
    }
    /**method untuk rate investment
     * 
     */
    public static double getInvestmentRate(){ 
        return 0;
    }
    /**method untuk menentukan waktu operasi
     * 
     */
    public static String getHoursOfOperation(){ 
        return null;
    }
    /**method untuk mendapat ID terakhir
     * 
     */
    public static int getLastID(){ 
        return 0;
    }
    private double interestRate(){
        int balance;
        BigDecimal bal = new BigDecimal(balance);
        BigDecimal n = new BigDecimal (360.0);
        BigDecimal t = new BigDecimal (1.0);
        BigDecimal r = new BigDecimal (.03);
        
        BigDecimal f1 = r.divide (n, BigDecimal.Round_Unnecessary).add(1.0);
        
        BigDecimal f2 = bal.multiply(f1, BigDecimal.Round_Unnecessary);
        
        BigDecimal f3 = n.multiply(t, BigDecimal.Round_Unnecessary);
        
        double balance = Math.pow(f2.doubleValue(), f3.doubleValue());
    }
        
    /**method untuk mendapat maks customer data
     * 
     */
    public static int getMaxCustomers(){ 
        return 0;
    }
    /**method untuk mendapatkan nama 
     * 
     */
    public static String getName(){ 
        return null;
    }
    /**method mendapatkan nextID
     * @param menentukan lastCustID dan nextCustID
     * 
     */
    public static int getNextID(){
        return nextID;
    }
    /**method mendapatkan website
     * 
     */
    public static String getWebsite(){ 
        return null;
    }
    /**method untuk mendapatkan rata2 premium
     * 
     */
    public static double getPremiumRate(){ 
        return 0;
    }
    
    public static String getPhone(){ 
        return null;
    }
    
    public static void setCreditRate(double rate){ 
    }
    
    public static void setInvestmentRate(double rate){ 
    }
    
    public static void setPremium(double rate){ 
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
}
