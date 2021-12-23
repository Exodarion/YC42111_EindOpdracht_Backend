package com.Eindopdracht.opdracht;

import com.Eindopdracht.opdracht.model.PoliticalGroup;
import com.Eindopdracht.opdracht.model.PoliticalGroupAlignment;
import com.Eindopdracht.opdracht.model.Voter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestMaarten{

    @Test
    void testFirstName() {
        Voter voter = new Voter();
        voter.setFirstName("Fred");
        assertEquals("Fred",voter.getFirstName());
    }

    @Test
    void testPga() {
        PoliticalGroup group = new PoliticalGroup();
        group.setPga(PoliticalGroupAlignment.MIDDEN);
        assertEquals(PoliticalGroupAlignment.MIDDEN, group.getPga());
    }
}
