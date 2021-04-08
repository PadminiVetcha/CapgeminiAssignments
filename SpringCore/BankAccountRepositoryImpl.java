package org.padmini.springcore;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	private double accountBalance; 
	public double getBalance(long accountId) {
		if(accountId==987654321)
		{
			return accountBalance;
		}
		return 0;
	}

	public double updateBalance(long accountId, double newBalance) {
		if(accountId==987654321)
		{
			double update = accountBalance + newBalance;
			accountBalance=update;
			return update;
		}
		return 0;
	}

}
