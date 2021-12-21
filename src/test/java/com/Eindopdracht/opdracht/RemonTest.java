package com.Eindopdracht.opdracht;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.Eindopdracht.opdracht.model.Voter;
import com.Eindopdracht.opdracht.repository.VoterRepository;

@SpringBootTest
public class RemonTest {
	
	@MockBean
	VoterRepository voterRepository;
	
	@Test
	 void testEmail() 
	 {
		Voter voter = new Voter();
		 voter.setEmail("Setup");
		 assertEquals("placeholder@email.com", voter.getEmail(), "Email Failed");
	 }
	
	@Test
	void anotherTest() {
		Voter voter = new Voter();
		voter.setId(23L);
		 assertEquals(23, voter.getId());
	}
}
