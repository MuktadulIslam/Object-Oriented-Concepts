/*  Author: Muktadul Islam
    Roll No: 1215
*/
package assignment_1;

public class BankAccount {
    public void startBanking(){
        String muktadulPin = "12345";
        String rakibulPin = "54321";

        Account Muktadul =new Account("Muktadul Islam","01739963603","12345");
        Account Rakibul = new Account("Rakibul Islma","01658642387");

        Muktadul.userInformation();
        Muktadul.addMoney(2000);
        Muktadul.cashOut(500,"12344");
        Muktadul.setPin(muktadulPin);
        Muktadul.pinUpdate("20012",muktadulPin);
        Muktadul.cashOut(1000,"20012");
        Muktadul.userInformation();

        Rakibul.userInformation();
        Rakibul.addMoney(2000);
        Rakibul.cashOut(500,"54321");
        Rakibul.setPin(rakibulPin);
        Rakibul.cashOut(500,rakibulPin);
        Rakibul.pinUpdate("12345",rakibulPin);
        Rakibul.cashOut(1000,"12345");
        Rakibul.userInformation();
    }
}
