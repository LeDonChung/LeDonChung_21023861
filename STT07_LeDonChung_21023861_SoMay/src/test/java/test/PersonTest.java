package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ledonchung.server.dao.PersonDAO;
import com.ledonchung.server.dao.impl.PersonDAOImpl;

public class PersonTest {
	private PersonDAO personDAO;
	@BeforeEach
	public void setUp() {
		personDAO = new PersonDAOImpl();
	}
	
	// Test case 1
	@Test
	public void testGetAllPersons() {
		System.out.println(personDAO.findAll());
	}
	
}
