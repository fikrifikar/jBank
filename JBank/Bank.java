
/**
 * Write a description of class Bank here.
 * 
 * @author (Ahmad Fikri) 
 * @version (27-2-2016)
 */
public class Bank
{
    // instance variables - replace the example below with your own
    private static double creditInterestRate;
    private static String closeTime;
    private static double investmentInterestRate; 
    private static int lastCustID;
    private static int nextCustID;
    private static String phone;
    private static double premiumInterestRate;
    private static String startTime;
    private static int numOfCurrentCustomer;
    private static int nextID;
    public static String website;
    public static String bankAddress="1234 JavaStreet, Anycity, ThisState, 34567";
    public static int maxNumOfCustomers= 20;
    public static String bankName="JBANK";
    /**
     * Constructor for objects of class Bank
     */
    public static String getAddress(){ /**method*/
        
        return null;
    }
    public static int getNumOfCurrentCustomer() {
        return numOfCurrentCustomer;
    }
    public static double getCreditRate(){ /**method*/
        return 0;
    }
    public static double getInvestmentRate(){ /**method*/
        return 0;
    }
    public static String getHoursOfOperation(){ /**method*/
        return null;
    }
    public static int getLastID(){ /**method*/
        return 0;
    }
    public static int getMaxCustomers(){ /**method*/
        return 0;
    }
    public static String getName(){ /**method*/
        return null;
    }
    /**method*/
    public static int getNextID(){
        int var1, var2;
        if (nextCustID == 0){
            lastCustID = 1000;
            nextCustID = 1000;
        }
        numOfCurrentCustomer = numOfCurrentCustomer + 1;
        return nextID;
    }
    public static String getWebsite(){ /**method*/
        return null;
    }
    public static double getPremiumRate(){ /**method*/
        return 0;
    }
    public static String getPhone(){ /**method*/
        return null;
    }
    public static void setCreditRate(double rate){ /**method*/
    }
    public static void setInvestmentRate(double rate){ /**method*/
    }
    public static void setPremium(double rate){ /**method*/
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
