package com.abstraction;

public class Atm implements Bank //step 2 is a relation
{
	 double bal = 1000000.00;
  @Override// step 3 method overriding
  public void deposit(int amount)
  {
	if(amount > 0)
	{
		bal = bal+amount;
		System.out.println(amount+ " deposited sucessesfully");
		System.out.println("deposited amount " +amount+ " total balance " +bal );
	}
  }

@Override
public void withdrow(int amt) 
{
	if(amt <= bal)
	{
		bal = bal-amt;
		System.out.println(amt+ " withdrow successfully");
		System.out.println("withdrow Rs " +amt+ " remaining balance " +bal );
	}
}

@Override
public void checkbal()
{
	System.out.println(" remaining balance " +bal );	
}

}


