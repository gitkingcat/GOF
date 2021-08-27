package com.GOFpattrns.GOFpattrns;
import com.GOFpattrns.GOFpattrns.adapter_structural.BankAccount;
import com.GOFpattrns.GOFpattrns.state_behavioral.Business;
import com.GOFpattrns.GOFpattrns.state_behavioral.Businessman;
import com.GOFpattrns.GOFpattrns.state_behavioral.RunExcursion;

public class GoFpattrnsApplication {

	public static void main(String[] args) {

		Businessman businessman = new Businessman();
		Business business = new RunExcursion();
		businessman.setBusiness(business);
		int lambaPrice = 500;
		while (new BankAccount().getBalance()<lambaPrice){
		businessman.runBusiness();}

		System.out.println("                      ___..............._\n" +
				"             __.. ' _'.\"\"\"\"\"\"\\\\\"\"\"\"\"\"\"\"- .`-._\n" +
				" ______.-'         (_) |      \\\\           ` \\\\`-. _\n" +
				"/_       --------------'-------\\\\---....______\\\\__`.`  -..___\n" +
				"| T      _.----._           Xxx|x...           |          _.._`--. _\n" +
				"| |    .' ..--.. `.         XXX|XXXXXXXXXxx==  |       .'.---..`.     -._\n" +
				"\\_j   /  /  __  \\  \\        XXX|XXXXXXXXXXX==  |      / /  __  \\ \\        `-.\n" +
				" _|  |  |  /  \\  |  |       XXX|\"\"'            |     / |  /  \\  | |          |\n" +
				"|__\\_j  |  \\__/  |  L__________|_______________|_____j |  \\__/  | L__________J\n" +
				"     `'\\ \\      / ./__________________________________\\ \\      / /___________\\\n" +
				"        `.`----'.'   dp                                `.`----'.'\n" +
				"          `\"\"\"\"'                                         `\"\"\"\"'");
	}

}
