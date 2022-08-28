package com.lmizell.interview.app.util;

import java.util.List;
import java.util.Set;

import com.lmizell.interview.app.model.Candidate;

public final class CandidatesUtil {

	private CandidatesUtil() {
	}

	/**
	 * 
	 * Method to help us get dummy data
	 * 
	 * @return list of candidates
	 */
	public static List<Candidate> getCandidates() {
		return List.of(
				new Candidate(1,"John", 2, Set.of("java", "c#", "c++", "golang")),
				new Candidate(2,"David", 1, Set.of("javascript", "c++")),
				new Candidate(3,"Diana", 4, Set.of("java", "python")),
				new Candidate(4,"June", 2, Set.of("ruby", "aws", "docker")),
				new Candidate(5,"April", 3, Set.of("python", "Erlang", "docker")));
	}
}
