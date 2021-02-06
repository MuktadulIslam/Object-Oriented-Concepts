/*  Author: Muktadul Islam
    Roll No: 1215
*/
package assignment_2;

public class Account {
    public void start_bKah_banking(){
        BKash Bindu = new BKash("Bindu","01405678059");
        String binduPin ="12345";

        Bindu.userInformation();
        Bindu.addMoney(2500);
        Bindu.cashOut(1000,binduPin);
        Bindu.setPin(binduPin);
        Bindu.cashOut(2500,binduPin);
        Bindu.cashOut(2000,binduPin);
    }

    public void start_rocket_banking(){
        System.out.println("\n");
        Rocket Rakibul = new Rocket("Rakibul Islam","01739963603", "54321");
        String rakibulPin ="54321";

        Rakibul.userInformation();
        Rakibul.addMoney(2500);
        Rakibul.cashOut(1000,rakibulPin);
        Rakibul.setPin(rakibulPin);
        Rakibul.cashOut(2500,rakibulPin);
        Rakibul.cashOut(2000,rakibulPin);
    }

    public void start_nagad_banking(){
        System.out.println("\n");
        Nagad Araf = new Nagad("Rakibul Islam","01739963603");
        String arafPin ="54321";

        Araf.userInformation();
        Araf.addMoney(2500);
        Araf.cashOut(1000,arafPin);
        Araf.setPin(arafPin);
        Araf.cashOut(2500,arafPin);
        Araf.cashOut(2000,arafPin);
    }
}
