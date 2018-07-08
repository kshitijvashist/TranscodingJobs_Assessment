package com.email.domain.counter;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.email.domain.utils.DomainRunnerConstants;

public class DomainRunner {

	/**
	 * getDomainName : To return the each element value by spliting their respective
	 * domains. getEmailInputs : input from the user about how many elements are
	 * there in the input list and entering each value one by one. isValid : To
	 * validate if the given emailId input is valid or not.
	 */

	public static String getDomainName(String emailId) {
		int len = 0;
		if (emailId != null)
			len = emailId.length();

		int domainIndex = emailId.indexOf("@");

		return emailId.substring(domainIndex + 1, len);

	}

	public static String[] getEmailInputs() {
		String[] emailInput = null;
		try {
			Scanner reader = new Scanner(System.in);
			Scanner size = new Scanner(System.in);
			System.out.println("Enter the size of Input elements");
			int sizeOfInput = size.nextInt();
			emailInput = new String[sizeOfInput];

			for (int i = 0; i < emailInput.length; i++) {
				System.out.println("Enter the " + (i + 1) + " Element i.e xxxx@domain");
				emailInput[i] = reader.nextLine();
				if (isValid(emailInput[i])) {
				} else {
					System.out.println("Please Enter the correct " + (i + 1) + " Element i.e xxxx@domain");
					emailInput[i] = reader.nextLine();

				}

			}

			size.close();
			reader.close();
		} catch (Exception e) {
			e.getMessage();
		}

		return emailInput;

	}

	public static boolean isValid(String email) {
		String emailRegex = DomainRunnerConstants.EMAIL_REGEX;
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

}
