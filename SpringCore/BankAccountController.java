package org.padmini.springcore;

public class BankAccountController {
	private double accountBalance;
	public double withdraw(long accountId, double balance) {
		if(accountId==987654321)
		{
			double update=accountBalance-balance;
			accountBalance=update;
			return update;
		}
		return 0;
	}

	public double deposit(long accountId, double balance) {
		if(accountId==987654321)
		{
			double update=accountBalance+balance;
			accountBalance=update;
			return update;
		}
		return 0;
	}

	public double getBalance(long accountId) {
		if(accountId==987654321)
		{
			return accountBalance;
		}
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		if(fromAccount==987654321 && amount<accountBalance)
		{
			return true;
		}
		return false;
	}

}
