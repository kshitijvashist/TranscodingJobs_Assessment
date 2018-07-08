package com.email.domain.executer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.email.domain.counter.DomainRunner;

public class DomainRunnerExecuter {
	/**
	 * DomainExecuter describes and calculate the number of domains occur in the
	 * input element list and shows the occurence for each domain in the input list.
	 */
	public static void main(String args[]) {

		String[] emailInput = DomainRunner.getEmailInputs(); // Function to get the input elements as Email ID for
																// distinguish domains.

		List<String> emailId = Arrays.asList(emailInput);

		Map<String, Integer> domainList = emailId // Java Streams to calculate the Re-occurence of the different domains
													// count and their appearance
				.stream().map(DomainRunner::getDomainName)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));

		for (Map.Entry<String, Integer> entry : domainList.entrySet()) {

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
