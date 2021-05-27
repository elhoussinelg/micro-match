package com.Match.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.Match.demo.match.Match;
import com.Match.demo.repository.MatchRepository;

@SpringBootApplication
public class MicroserviceMatch1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceMatch1Application.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabaseH2(MatchRepository matchRepository) {
		return args->{
						//Date d1 =new Date();
		            	matchRepository.save(new Match(Long.parseLong("1") , "Rabat" ,"Match_officiel"));
                        matchRepository.save(new Match(Long.parseLong("2") , "Marrakech" ,"Match_amical"));
                        matchRepository.save(new Match(Long.parseLong("3") , "le grand stad de Rabat" ,"Match_tournoi"));
                        matchRepository.save(new Match(Long.parseLong("4") , "CasaBlanca" ,"Match_coupe"));
		} ;

	}
}
