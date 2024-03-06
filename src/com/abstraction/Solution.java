package com.abstraction;

public class Solution
{
  public static void main(String[] args) 
  {
	Atm a = new Atm();
	a.deposit(100000);
	a.withdrow(400000);
	a.checkbal();
	// step 4 upcasting 
	Bank b = new Atm();
	b.deposit(200000);
	b.withdrow(300000);
	b.checkbal();
  }
}
