
/**
 * Write a description of class Teller here.
 * 
 * @author (Ahmad Fikri) 
 * @version (24-2-16)
 */
 
import java.util.*;
import java.io.*; 
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class Teller
{
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;
   private String setName;
    // instance variable - menentukan variabel untuk setName
    public static void main(String[] args){
    
    }
    public Teller(){
        
    }
    public class CustID {
        int custID;
    }
    private void showAccType(){
        headerLabel.setText ("Control in action: Choice");
        final Choice accType = new Choice();
        
        accType.add("savings");
        accType.add("overdraft");
        accType.add("infestment");
        accType.add("credit checking");
        accType.add("cancel");
        Button showButton = new Button("show");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {     
            String data = "Account Selected: " 
            + accType.getItem(accType.getSelectedIndex());
            statusLabel.setText(data);
         }
      }); 
      controlPanel.add(accType);
      controlPanel.add(showButton);

      mainFrame.setVisible(true);  
   }

    /**double merupakan method dari setName
     * @param c1 sebagai variabel customer
     */
    public class Customer{
        Customer c1 = new Customer();
        double setName = setName;}
 public class CustomerName {
     public void CustName (String[] args) {
         Scanner user_input = new Scanner (System.in);
         String fname;
         System.out.print ("masukkan fname:");
         fname = user_input.next();
         String lname;
         System.out.print ("masukkan lname:");
         lname = user_input.next();
         String nama_lengkap;
         nama_lengkap = fname + " " + lname;
         System.out.println ("You are" + nama_lengkap);
         }
         
  public void data(String args[]){
      String yes;
      System.out.print("Apakah ingin membuat customer ?");
      Scanner scan = new Scanner(System.in);
      if (scan.equals("yes")){
      do{
         System.out.print("masukkan lname");
         Scanner in = new Scanner(System.in);
         String fname;
         String lname;
         int dateOfBirth;
         int DOB;
         fname = new String();
         lname = new String();
         Scanner sc = new Scanner (System.in);
         int DoB = sc.nextInt();
         int phoneNum = sc.nextInt();
      }while(scan.equals("yes"));
    }
      if (scan.equals("no")){
          System.exit(0);
          System.out.println("keluar dari program");
        }
}
}
}

    /**method System.out.println merupakan sebuah method
     * @param menampilkan nama "sanadhi sutandi"
     */
   /**
     * Constructor for objects of class Teller
     */
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */


