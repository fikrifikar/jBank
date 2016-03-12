
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;

public class Customer
{
    // instance variables - replace the example below with your own
    private Account accounts =new Account();
    private String cityAddress;
    private int custId;
    private Date dateOfBirth;
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
    public Customer(String fname, String lname, Date dob){
        
    }
    public Customer(String firstName, String lastName, String dateOfBirth, int custId){
        
    }
    public Date getDate(){
        return dateOfBirth;
    }
    private String getAddress(){  //mengembalikan nilai secara berurutan
        return streetAddress+cityName+zipOrPostalCode;
    }
    private Account getAccount(){ //mengembalikan referensi objek dari kelas account
        return accounts;
    }
    public void setAccount (Account acc){ 
        accounts = acc;
    }
    private int getCustomerId(){ 
        return custId;
    }
    private String getEmail(){ 
        return email;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    
    private String getName(){  // mengembalikan lname dan fname
        return (lastName+"'"+firstName);
    }
    private String getCustomerName(){ 
        return custName;
    }
    public int getNumOfAccounts(){
        return numberOfCurrentAccounts;
    }
    private String getPhoneNumber(){
        return phoneNumber; 
    }
    private void setAddress(String street, String city, String code){ 
        
    } //set address akan menampilkan tiga informasi jalan
    private void setEmail(String emailAddress){ /**method*/
        this.email = email;
    } 
    private void setCustomerName(String lname, String fname){ /**method*/
        return;
    } /*dibuat menjadi setName*/
    
    private String setPhoneNumber(String phoneNum){ 
        this.phonenumber = phonenumber;
        return phonenumber;
    }
    private int setCustID (){
        return setCustID;
    }
}
