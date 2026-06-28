import java.util.HashMap;
import java.util.Map;

public class ExceptionHandling13{
public static void main(String args[]){
 BankingSystem bankingSystem = new BankingSystem();

        try {
            // Valid operations
            bankingSystem.deposit("12345", 2000.00);
            bankingSystem.withdraw("12345", 1000.00, "John Doe");
            bankingSystem.tramsfer("12345", "67890", 500.00, "John Doe");

            // Unauthorized access
            bankingSystem.withdraw("12345", 1000.00, "Jane Smith");
        } catch (InvalidAccountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UnauthorizedAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Invalid account number
            bankingSystem.deposit("99999", 1000.00);
        } catch (InvalidAccountException e) {
            System.out.println("Error: " + e.getMessage());
        }
}

}
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message){
		super(message);
		
	}
	
	
}

class InvalidAccountException extends Exception{
	public InvalidAccountException(String message){
		super(message);
	}
	
}
class UnauthorizedAccessException extends Exception{
	public UnauthorizedAccessException(String message){
		super(message);
		
	}
	
}


class BankingSystem{
private final Map<String,Account> accounts = new HashMap<>();	
public BankingSystem(){
//Adding some sample account
accounts.put("12345",new Account("12345","John Doe",5000.00));
accounts.put("67890", new Account("67890","Jane Smith",100000.00));

}	
public Account getAccount(String accountNumber) throws InvalidAccountException{
if(!accounts.containsKey(accountNumber)){
	throw new InvalidAccountException("Account number :"+accountNumber+" does not exist.");
	
}
return accounts.get(accountNumber);
}
public void withdraw(String accountNumber, double amount , String authorizedUser)    throws InsufficientFundsException , InvalidAccountException , UnauthorizedAccessException {
Account account = getAccount(accountNumber);

//Authorization check
if(!account.getAccountHolder().equals(authorizedUser)){
	throw new UnauthorizedAccessException("Access denied for user "+authorizedUser + " on account "+accountNumber);
	
}
if(account.getBalance() < amount){
	throw new InsufficientFundsException("Insufficient funds in  account "+accountNumber);
	
}
account.setBalance(account.getBalance() - amount);
System.out.println("Withdrawal successful ! New Balance : "+account.getBalance());
}

public void deposit(String accountNumber , double amount) throws InvalidAccountException{
Account account = getAccount(accountNumber);
account.setBalance(account.getBalance() + amount);
System.out.println("Deposit successful! New balance : "+account.getBalance());

}
public void tramsfer(String fromAccount , String toAccount , double amount , String authorizedUser) throws InvalidAccountException,InsufficientFundsException,UnauthorizedAccessException{
withdraw(fromAccount , amount , authorizedUser);
deposit(toAccount,amount);
System.out.println("Transfer successful! Amount :"+amount+" from "+fromAccount+"  to "+toAccount);
}	
}
public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}