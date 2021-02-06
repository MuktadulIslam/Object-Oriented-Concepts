/*  Author: Muktadul Islam
    Roll No: 1215
*/
package assignment_2;

public class Rocket extends MobileBank{
    public String accountNumber;

//    Constructor with pin
    public Rocket(String accountName, String mobileNumber, String pin){
        super(accountName,mobileNumber,pin);
        this.accountNumber = mobileNumber + "7";
    }

//    Constructor without pin
    public Rocket(String accountName, String mobileNumber){
        super(accountName,mobileNumber);
        this.accountNumber = mobileNumber + "7";
    }

//    Cash Out
    public void cashOut(double amount, String pin) {
        super.withdraw(amount, pin,18);
    }

//    User Information
    public void userInformation() {
        super.userInformation(accountNumber);
    }
}
