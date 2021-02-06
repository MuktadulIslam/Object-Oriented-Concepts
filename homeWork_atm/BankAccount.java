/*  Author: Muktadul Islam
    Roll No: 1215
*/
package homeWork_atm;

public class BankAccount {
    public void userAccount(){
        Account Muktadul = new Account();

        Muktadul.userInformation();
        Muktadul.addMoney(1000);
        Muktadul.cashOut(500);
        Muktadul.cashOut(1000);

        System.out.println("Balance: " + Muktadul.getBalance());
    }
}
