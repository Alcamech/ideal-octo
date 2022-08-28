package com.lmizell.interview.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.lmizell.interview.app.model.Candidate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lmizell.interview.app.util.CandidatesUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1")
public class ApiRestController {

	static List<Candidate> candidateList = new ArrayList<>();

	static {
		candidateList.addAll(CandidatesUtil.getCandidates());
	}

	@GetMapping(value = "/candidates")
	public ResponseEntity<?> fetchCandidates(@RequestParam(value = "skill", required = false) String skill) {
		log.info("Response received. Params: skill {}", skill);
		// fetch candidates by skill
		return ResponseEntity.ok(candidateList);
	}

	// POST mapping - addCandidates

	// DELETE mapping - removeCandidate

	// PUT mapping - updateCandidate
}
