import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class VirtualPetShelter {
	
	List<VirtualPet> virtualPets = new ArrayList<>();
	
	public Collection<VirtualPet> virtualPets(){
		return virtualPets;
	}
	
	public VirtualPet getUserPetName(int name) {
		return virtualPets.get(name);	
	}
	
	public void isAdopted(VirtualPet pet) {
		virtualPets.remove(pet.name);
	}
	
	public void isAdmit(VirtualPet pet) {
		virtualPets.add(pet);
	}
	
	public void isHungry(VirtualPet pet) {
		for (VirtualPet currentPet: virtualPets()) {
			currentPet.isHungry();
		}
	}
		
	public void isThirsty(VirtualPet pet) {
		for (VirtualPet currentPet: virtualPets()) {
			currentPet.isThirsty();
		}
	}
	
	public void isNeedingPlay(VirtualPet pet) {
		for (VirtualPet currentPet: virtualPets()) {
			currentPet.isNeedingPlay();
		}
		
	}
	
	public void isClean(VirtualPet pet) {
		for (VirtualPet currentPet: virtualPets()) {
			currentPet.isClean();
		}
	}
	
	public void isBored(VirtualPet pet) {
		for (VirtualPet currentPet: virtualPets ()) {
			currentPet.isVeryBored();
		}
	}
	
	public void isPetClean(VirtualPet pet) {
		for (VirtualPet currentPet: virtualPets()) {
			currentPet.isClean();
		}
	}
		

}
