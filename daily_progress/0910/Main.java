public class Door {
	public void open ()
	{
		push();
	}
}

class BankVaultDoor extends Door {    // The "extends" keyword used to tell java that BankVaultDoor inherits the functionality of Door.
	public void open () {
		enterCombination();
		pull;
	}
}
