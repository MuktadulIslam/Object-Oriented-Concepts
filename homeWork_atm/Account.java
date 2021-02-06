/*  Author: Muktadul Islam
    Roll No: 1215
*/
package homeWork_atm;

public class Account {
    private String userName = "Muktadul Islam";
    private int userID = 1215;
    private int balance = 200;

    public void userInformation(){
        System.out.println("User name: "+ userName);
        System.out.println("User ID: "+userID);
        System.out.println("Balance: "+balance +"\n");
    }

    public int getBalance(){
        return balance;
    }

    public void cashOut(int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Your " + amount + " TK cash out is successfully done.");
        }
        else{
            System.out.println("Your account doesn't have sufficient balance");
        }
    }

    public void addMoney(int amount){
        balance += amount;
        System.out.println(amount + " TK is successfully added in account balance.");
    }

}
