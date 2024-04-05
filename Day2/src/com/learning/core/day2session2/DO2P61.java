package com.learning.core.day2session2;
class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;
 
    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (accType.equalsIgnoreCase("Saving") && initialBalance < 1000) {
            throw new LowBalanceException("LowBalance");
        } else if (accType.equalsIgnoreCase("Current") && initialBalance < 5000) {
            throw new LowBalanceException("LowBalance");
        } else if (initialBalance < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }
        this.balance = initialBalance;
    }
 
    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }
        balance += amt;
    }
 
    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equalsIgnoreCase("Saving")) {
            throw new LowBalanceException("LowBalance");
        } else if (balance < 5000 && accType.equalsIgnoreCase("Current")) {
            throw new LowBalanceException("LowBalance");
        }
        return balance;
    }
}




public class DO2P61 {

	
	    public static void main(String[] args) {
	        try {
	            BankAccount account1 = new BankAccount(123, "John", "Saving", 900);
	            System.out.println("Output 1: No Exception");
	            account1.deposit(-900);
	        } catch (LowBalanceException e) {
	            System.out.println("Output 1: " + e.getMessage());
	        } catch (NegativeAmountException e) {
	            System.out.println("Output 1: " + e.getMessage());
	        }
	 
	        try {
	            BankAccount account2 = new BankAccount(123, "John", "Saving", -900);
	            System.out.println("Output 2: No Exception");
	        } catch (LowBalanceException e) {
	            System.out.println("Output 2: " + e.getMessage());
	        } catch (NegativeAmountException e) {
	            System.out.println("Output 2: " + e.getMessage());
	        }
	    }
}
