package DesignPattern;

import java.math.BigDecimal;
import java.util.Hashtable;

//this is exmplelary code for facade design Pattern.
public class Customer {
    
    public static void main(String[] args) {
        BankService myBankService = new BankService();
        int mysaving = myBankService.createNewAccount("saving", 500);
        int investment = myBankService.createNewAccount("investment", 1000);
        myBankService.transfer(investment, mysaving, 500);
    }

    public static class BankService{
        private Hashtable<Integer,IAccount> bankAccounts;

        public BankService(){
            this.bankAccounts = new Hashtable<Integer,IAccount>();
        }

        public int createNewAccount(String type,int initAmount){
            IAccount newAccount = null;
            switch (type) {
                case "chequing":
                    newAccount = new Chequing(initAmount);
                    break;
                case "saving":
                newAccount = new Saving(initAmount);
                break;
                case "investment":
                newAccount = new Investment(initAmount);
                break;
                default:
                System.out.println("Invalid account type");
                    break;
            }
            
            if (newAccount != null) {
                this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
                return newAccount.getAccountNumber();
            }
            return -1;
        }

        //this function will transfer money from one account to the other
        public void transfer(int to,int from, int amount){
            IAccount toAccount = this.bankAccounts.get(to);
            IAccount fromAccount = this.bankAccounts.get(from);
            fromAccount.transfer(toAccount,amount);
        }

    }
    
    public static class Chequing implements IAccount{

        int Accountnumber = 333;
        int balance;

         Chequing(int initAmount){
            this.balance = initAmount;
        }
        
        //this function will deposite money into the specified account
        public void deposit(int amount){

        }

        //this function will withdraw money from the specified account
        public void withdraw(int amount){
            this.balance -= amount;

        }

        //this function will transfer money from the specified account to another account
        public void transfer(IAccount toAccount,int amount){
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println(amount+" has been credited to "+toAccount.getAccountNumber()+" from "+ this.getAccountNumber());
        }

        //this function will return the account number
        public int getAccountNumber(){
            return Accountnumber;
        }
    }

    public static class Saving implements IAccount{

        int Accountnumber = 111;
        int balance;

        Saving(int initAmount){
            this.balance = initAmount;
        }
        
        //this function will deposite money into the specified account
        public void deposit(int amount){

        }

        //this function will withdraw money from the specified account
        public void withdraw(int amount){
            this.balance -= amount;
        }

        //this function will transfer money from the specified account to another account
        public void transfer(IAccount toAccount,int amount){
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println(amount+" has been credited to "+toAccount.getAccountNumber()+" from "+ this.getAccountNumber());
        }

        //this function will return the account number
        public int getAccountNumber(){
            return Accountnumber;
        }
    }

    public static class Investment implements IAccount{

        int Accountnumber = 222;
        int balance;

        Investment(int initAmount){
            this.balance = initAmount;
        }
        
        //this function will deposite money into the specified account
        public void deposit(int amount){

        }

        //this function will withdraw money from the specified account
        public void withdraw(int amount){
                this.balance -= amount;
        }

        //this function will transfer money from the specified account to another account
        public void transfer(IAccount toAccount,int amount){
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println(amount+" has been credited to "+toAccount.getAccountNumber()+" from "+ this.getAccountNumber());
        }

        //this function will return the account number
        public int getAccountNumber(){
            return Accountnumber;
        }
    }

    public static interface IAccount {
    
    //this function will deposite money into the specified account
    public void deposit(int amount);


    //this function will withdraw money from the specified account
    public void withdraw(int amount);

    //this function will transfer money from one account to another
    public void transfer(IAccount toAccount,int amount);

    //this function will return the account number
    public int getAccountNumber();
    }
}

