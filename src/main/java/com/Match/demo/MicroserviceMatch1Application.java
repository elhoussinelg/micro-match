package com.Match.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.Match.demo.match.Match;
import com.Match.demo.repository.MatchRepository;

import java.time.LocalDate;

@SpringBootApplication
public class MicroserviceMatch1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceMatch1Application.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabaseH2(MatchRepository matchRepository) {
		return args->{
						//Date d1 =new Date();
		            	matchRepository.save(new Match(LocalDate.of(2021,1,1), "Rabat" , Match.Type.amical , Match.Categorie.U8, "KACM"));
		            	//matchRepository.save(new Match("22/01/2021", "Marrakech" , Match.Type.Coupe , Match.Categirie.U10));
		            	//matchRepository.save(new Match("22/01/2021", "Casablanca" , Match.Type.Ligue , Match.Categirie.U12));
		            	// matchRepository.save(new Match("22/01/2021", "safi" , Match.Type.amical , Match.Categirie.U8));
		            	//matchRepository.save(new Match("22/01/2021", "tanger" , Match.Type.amical , Match.Categirie.U6));
		} ;

	}
}
