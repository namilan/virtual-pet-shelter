import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class VirtualPetShelterTest {

	@Test
	public void shouldReturnPetName() {
		VirtualPet underTest = new VirtualPet("", "", 50);
		String userPetName = underTest.getUserPetName();
		assertEquals("", userPetName);
	}
	
	@Test
	public void shouldReturnPetType() {
		VirtualPet underTest = new VirtualPet("", "", 50);
		String userPetId = underTest.getUserPetId();
		assertEquals("", userPetId);
	}
	
	@Test
	public void shouldReturnPetHealth() {
		VirtualPet underTest = new VirtualPet("", "", 50);
		int userPetHealth = underTest.getUserPetHealth();
		assertEquals(50, userPetHealth);
	}
	
	@Test
	public void isPetGettingAdopted_ShouldReturnTrue() {
		VirtualPet underTest = new VirtualPet("","", 50);
		int isAdopted = underTest.adopt = 1;
		assertTrue(underTest.isAdopted());
	}
	
	@Test
	public void isPetGettingAdmitted_ShouldReturnTrue() {
		VirtualPet underTest = new VirtualPet ("", "", 50);
		int isAdmit = underTest.admit = 1;
		assertTrue(underTest.isAdmit());
		
	}
	
}
