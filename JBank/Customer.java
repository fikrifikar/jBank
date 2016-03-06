
/**
 * Write a description of class Customer here
 * 
 * @author (Ahmad Fikri) 
 * @version (27-2-2016)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private Account accounts =new Account();
    private String cityAddress;
    private int custId;
    private String dateOfBirth;
    private String email;
    private String firstName;
    private String lastName;
    private int numberOfCurrentAccounts;
    private String streetAddress;
    private String phoneNumber;
    private String zipOrPostalCode;
    private String cityName;
    private String phonenumber;
    private String custName;
    private String setName;
    private int accountNumber;
    private int balance;
    public final double X_REFERENCE = 1.234;
    private int setCustID;
    /**
     * Constructor for objects of class Customer
     */
    public class teller{
    }
    public Customer()
    {
        // initialise instance variables
    }
    public Customer(String fname, String lname, String dob){
        
    }
    public Customer(String firstName, String lastName, String dateOfBirth, int custId){
        
    }
    
    private String getAddress(){ /**method*/ //mengembalikan nilai secara berurutan
        return streetAddress+cityName+zipOrPostalCode;
    }
    private Account getAccount(){ /**method*/ //mengembalikan referensi objek dari kelas account
        return accounts;
    }
    public void setAccount (Account acc){ /**method*/
        accounts = acc;
    }
    private int getCustomerId(){ /**method*/
        return custId;
    }
    private String getEmail(){ /**method*/
        return email;
    }
    
    
    private String getName(){ /**method*/ // mengembalikan lname dan fname
        return (lastName+"'"+firstName);
    }
    private String getCustomerName(){ /**method*/
        return custName;
    }
    public int getNumOfAccounts(){ /**method*/
        this.accountNumber = accountNumber;
        balance = 50000;
        return numberOfCurrentAccounts;
    }
    private String getPhoneNumber(){ /**method*/
        return phoneNumber; 
    }
    private void setAddress(String street, String city, String code){ /**method*/
        
        this.streetAddress = street;
        this.cityName = city;
        this.zipOrPostalCode = code;
    } //set address akan menampilkan tiga informasi jalan
    private void setEmail(String emailAddress){ /**method*/
        this.email = email;
    } 
    public static boolean isValidEmail(String emailAddress) {
    return emailAddress.contains(" ") == false && emailAddress.matches(".+@.+\\.[a-z]+");
    } 
    private void setCustomerName(String lname, String fname){ /**method*/
        this.lastName = lname;
        this.firstName = fname;
        return;
    } /*dibuat menjadi setName*/
    
    /**
       * Method untuk mendapatkan nomor telepon
     * 
     * @param String phoneNum  
     * @return phonenumber nomor 
     * 
     */
    private String setPhoneNumber(String phoneNum){ 
        this.phonenumber = phonenumber;
        return phonenumber;
    }
    private int setCustID (){
        return setCustID;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param      getAddress adalah parameter awalan dari setAddress
     * @return     mengembalikan semua nilai ke awal setAddress
     */

}
/**
 * 
 * 
 * abdcd
   zcsfasf
   sagasg
   */ 

//mkmo
