package simplecrm;

public class Accounts {
    
    private String customerNumber;
    private String customerName;
    private String customerAdress;
    private double customerBalance;
    
    public Accounts(String cNumber, String cName, String cAdress, double cBalance){
    
        this.customerNumber = cNumber;
        this.customerName = cName;
        this.customerAdress = cAdress;
        this.customerBalance = cBalance;
    }
    
    public void withdraw(double amount){
        this.customerBalance = this.customerBalance - amount;
    }
    
    public void deposit(double amount){
        this.customerBalance = this.customerBalance + amount;
    }
    
    public void transfer(Accounts a, double amount){
        this.withdraw(amount);
        a.deposit(amount);
    }
    
    public String getAccountNumber(){
        return this.customerNumber;
    }
    
    public String getAccountName(){
        return this.customerName;
    }
    
    public String getAccountAdress(){
        return this.customerAdress;
    }
    
    public double getAccountBalance(){
        return this.customerBalance;
    }
    
    @Override
    public String toString(){
        return this.customerNumber;
    }
}
