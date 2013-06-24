package com.rll.renewal;

public class Renewal {
	private static void printUsage() {
		System.out.println("Renewal program takes in one of the 4 parameters: \n" +
				"pull	-- Pull and Assign\n" +
				"email	-- Send promotion emails\n" +
				"renew	-- auto renewal (place order and add credit)\n" +
				"all	-- do all of the above"
		);
	}
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Invalid parameters!");
			printUsage();
			System.exit(1);
		}
		
		String param = args[0];
		if (param.equals("pull")) {
			// call into Pull.java
			System.out.println("pull was called");
		} else if (param.equals("email")) {
			// call into Email.java
			System.out.println("email was called");
		} else if (param.equals("renew")) {
			// call into Renew.java
			System.out.println("renew was called");
		} else if (param.equals("all")) {
			// call to do everything
			System.out.println("all was called");
		} else {
			System.out.println("Invalid parameters!");
			printUsage();
			System.exit(1);
		}
	}
}
