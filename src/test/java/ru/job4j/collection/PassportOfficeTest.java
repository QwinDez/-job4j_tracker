package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsemtev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addDuplicate() {
        Citizen citizenPetr = new Citizen("2f44a", "Petr Arsemtev");
        Citizen citizenPetrDublicate = new Citizen("2f44a", "Petr Arsemtev");
        PassportOffice office = new PassportOffice();
        office.add(citizenPetr);
        assertFalse(office.add(citizenPetrDublicate));
    }

}