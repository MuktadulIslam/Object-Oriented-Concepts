/*  Author: Muktadul Islam
    Roll No: 1215
*/
package assignment_2;

public class MobileBank {
    private String accountName;
    private String mobileNumber;
    private String pin = "Pin didn't set";
    private double balance = 0;

//    User Information
    public void userInformation(String accountNumber){
        System.out.println("Account name: " + accountName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Mobile number: " + mobileNumber);
        System.out.println("Balance: " + balance + "\n");
    }

//    Get Balance
    public double getBalance(){
        return balance;
    }

//    Constructor with pin
    public MobileBank(String accountName,String mobileNumber, String pin){
        this.accountName = accountName;
        this.mobileNumber = mobileNumber;
        this.pin = pin;
    }

//    Constructor Without pin
    public MobileBank(String accountName, String mobileNumber){
        this.accountName = accountName;
        this.mobileNumber = mobileNumber;
    }

//    Set pin
    public void setPin(String pin){
        if(this.pin == "Pin didn't set"){
            this.pin = pin;
            System.out.println("Your pin is updated");
        }

        else
            System.out.println("Pin already set");
    }

//    pin update
    public void pinUpdate(String newPin, String oldPin){
        if(oldPin == this.pin){
            this.pin = newPin;
            System.out.println("Your pin is updated.");
        }
        else
            System.out.println("Pin update failed due to invalid old pin");
    }

//    Cash out with pin
    public void withdraw(double amount,String pin, double charge){
        if(this.pin == "Pin didn't set")
            System.out.println("Please set pin before Cash out");
        else if(pin != this.pin)
            System.out.println("Cash out failed due to invalid pin.");
        else if(balance < amount+amount*charge/1000) {
            System.out.println("Cash out failed due to insufficient balance");
        }
        else{
            balance = balance - amount - amount*charge/1000;
            System.out.println("Your " + amount + " TK cash out is successfully done." +
                    "\nNow your balance is " + balance + " TK");
        }

    }

//    Add money
    public void addMoney(double amount){
        balance += amount;
        System.out.println(amount + " TK is successfully added in your account balance.");
    }
}
