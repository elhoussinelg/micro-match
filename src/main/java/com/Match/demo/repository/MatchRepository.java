package com.Match.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Match.demo.match.Match;
@Repository
public interface MatchRepository extends JpaRepository<Match,Long>{

}
