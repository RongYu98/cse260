import java.util.Date;
public class Account{

    /**
- A method named withDraw(double amount) that withdraws a specified amount from the account. If there are not enough funds to withdraw an amount of money, print a statement saying that there are not enough money and leave the same balance in the account.
- A method named deposit that deposits a specified amount to the account.


     */


    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public Account( int id, int balance ){
	this.id = id;
	this.balance = balance;
	annualInterestRate = 4.50;
	dateCreated = new java.util.Date();
    }
    public Account(){
	this(0, 1000 );
    }

    public int getID(){
	return id;
    }
    public void setID( int newID ){
	id = newID;
    }

    public double getBalance(){
	return balance;
    }
    public void setBalance( double newBalance ){
	balance = newBalance;
    }
    
    public double getAnnualInterestRate(){
	return annualInterestRate;
    }
    public void setAnnualInterestRate( double newAnnualInterestRate ){
	annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterestRate(){
	return annualInterestRate/12;
    }


    public java.util.Date getDateCreated(){
	return dateCreated;
    }

    public void deposit( double money ){
	setBalance( getBalance()+money );
    }
    public void withMoney( double amount ){
	if (getBalance() < amount){
	    System.out.println("Not enough money.");
	    return;
	}
	setBalance( getBalance()-amount );
    
    }
    
}
