/*  Author: Muktadul Islam
    Roll No: 1215
*/
package assignment_2;

public class Nagad extends MobileBank{
    public String accountNumber;

//    Constructor with pin
    public Nagad(String accountName, String mobileNumber, String pin){
        super(accountName,mobileNumber,pin);
        this.accountNumber = mobileNumber;
    }

//    Constructor without pin
    public Nagad(String accountName, String mobileNumber){
        super(accountName,mobileNumber);
        this.accountNumber = mobileNumber;
    }

//    Cash Out
    public void cashOut(double amount, String pin) {
        super.withdraw(amount,pin,10);
    }

//    User Information
    public void userInformation() {
        super.userInformation(accountNumber);
    }
}
