/*  Author: Muktadul Islam
    Roll No: 1215
*/
package assignment_1;

public class Account {
    private String userName;
    private String userID;
    private String pin = "Pin didn't set";
    private int balance = 0;

//    User Information
    public void userInformation(){
        System.out.println("User name: " + userName);
        System.out.println("User ID: " +userID);
        System.out.println("Balance: " +balance +"\n");
    }

    public int getBalance(){
        return balance;
    }

//    With pin
    public Account(String userName, String userID, String pin){
        this.userName = userName;
        this.userID = userID;
        this.pin = pin;
    }

//    Without pin
    public Account(String userName, String userID){
        this.userName = userName;
        this.userID = userID;
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
    public void cashOut(int amount,String pin){
        if(this.pin == "Pin didn't set")
            System.out.println("Please set pin before Cash out");
        else if(pin != this.pin)
            System.out.println("Cash out failed due to invalid pin.");
        else if(balance < amount){
                System.out.println("Cash out failed due to insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println("Your " + amount + " TK cash out is successfully done.");
        }

    }

//    Add money
    public void addMoney(int amount){
        balance += amount;
        System.out.println(amount + " TK is successfully added in your account balance.");
    }
}
