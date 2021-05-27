package com.Match.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Match.demo.match.Match;
import com.Match.demo.repository.MatchRepository;

@RestController
public class MatchController {
	@Autowired
	MatchRepository matchRepository ;
	
	@GetMapping("/Match")
	public List<Match> findAll(){
		return this.matchRepository.findAll();
	}
	@GetMapping("/Match/{id}")
	public Match findById(@PathVariable Long id) throws Exception{    // ndowso fl URL
		return this.matchRepository.findById(id).orElseThrow(()-> new Exception("Match n'existe pas"));
	}
	
	@PostMapping("/Match")
	public Match saveMatch(@RequestBody Match match) {    // ndowso fl body
		return this.matchRepository.save(match);
	}
	
	@PutMapping("/Match/{id}")
	Match UpdateOrSaveMatch(@RequestBody Match match ,@PathVariable Long id) {
		return this.matchRepository.findById(id).map(x->{
				x.setLieu(match.getLieu());
				x.setType(match.getType());
				return matchRepository.save(match);
		}).orElseGet(()->{
			match.setId(id);
			return matchRepository.save(match);
		});
	}
	@DeleteMapping("/Match/{id}")
	void deleteMatch (@PathVariable Long id) {
		this.matchRepository.deleteById(id);
	
	}
}
