import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {
	
	List<VirtualPet> virtualPets = new ArrayList<>();
	
	
	
	public List <VirtualPet> getVirtualPets(){
		return virtualPets;
	}
	
	public void printAllPetNames() {
		System.out.println("Here are the current pets in the shelter:");
		for (VirtualPet currentPet : getVirtualPets()){
				System.out.println(currentPet.getUserPetName());
		}
	}
	
	public boolean isAdopted(VirtualPet pet) {
		return this.virtualPets.remove(pet);
	}
	
	public boolean isAdmit(VirtualPet pet) {
		return this.virtualPets.add(pet);
	}
	
	public boolean areThePetsHungry() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isHungry() == true) {
				return true;
			}
		}
		return false;
		
	}
		
	public boolean arePetsThirsty() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isThirsty() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isNeedingPlay() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isNeedingPlay() == true) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean isNeedingClean() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isClean() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isBored() {
		for (VirtualPet currentPet : getVirtualPets ()) {
			if(currentPet.isVeryBored() == true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isPetClean() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isClean() == true) {
				return true;
			}
		}
		return false;
	}
	
	public void makeAllPetsTick() {
		for (VirtualPet currentPet : getVirtualPets()) {
			currentPet.tick();
		}
	}
	
	public boolean areAlive() {
		for (VirtualPet currentPet : getVirtualPets()) {
			if(currentPet.isAlive() == true) {
				return true;
			}
		}
		return false;
	}

}
