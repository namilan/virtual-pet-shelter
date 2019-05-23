import java.util.List;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		VirtualPetShelter ronnysPlayHouse = new VirtualPetShelter();
		List<VirtualPet> petsInPlayhouse = ronnysPlayHouse.getVirtualPets();
		
		VirtualPet ronny = new VirtualPet("Ronny", "Raptor", 50, 50, 50, 50, 100);
		petsInPlayhouse.add(ronny);
		VirtualPet spike = new VirtualPet("Spike", "Stegosaurus", 50, 50, 50, 50, 100);
		petsInPlayhouse.add(spike);
		VirtualPet ducky = new VirtualPet("Ducky", "Saurolophus", 50, 50, 50, 50, 100);
		petsInPlayhouse.add(ducky);
		
	
	do {
		
		System.out.println("Welcome to Ronny's Play House");
		ronnysPlayHouse.printAllPetNames();
		System.out.println("Here are some options for you!");
		System.out.println("1)Would you like to feed the pets?");
		System.out.println("2)Would you like to water all the pets?");
		System.out.println("3)Would you like to clean the cages?");
		System.out.println("4)Which pet would you like to play with?");
		System.out.println("5)Which pet would you like to adopt?");
		System.out.println("6)Would you like to admit a pet?");
		System.out.println("7)Quit. ");
		
		int userInput = input.nextInt();
		
		switch (userInput) {
		case 1:
			if (ronnysPlayHouse.areThePetsHungry()) {
				System.out.println("You fed the pets!");
				ronnysPlayHouse.makeAllPetsTick();
			}else {
				System.out.println("Pets were not hungry afterall."); 
				ronnysPlayHouse.makeAllPetsTick();
				}
		break;
		case 2:
			if (ronnysPlayHouse.arePetsThirsty()) {
				System.out.println("You watered the pets!");
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("Pet's were not thirsty afterall.");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
		case 3:
			if(ronnysPlayHouse.isNeedingClean()) {
				System.out.println("You cleaned the cages!");
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("Cages were just clean! Nevermind. ");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
		case 4:
			if(ronnysPlayHouse.isNeedingPlay()) {
				System.out.println("You played with all your pets!");
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("They didn't want to play afterall.");
				ronnysPlayHouse.makeAllPetsTick();
			}
			
		break;
		case 5:
			if(ronnysPlayHouse.isAdopted(null)) {
				System.out.println("You have adopted a pet!");
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
		case 6:
			if(ronnysPlayHouse.isAdmit(null)) {
				System.out.println("You have admitted a pet!");
				ronnysPlayHouse.makeAllPetsTick();
			} else {
				System.out.println("");
				ronnysPlayHouse.makeAllPetsTick();
			}
		break;
		case 7:
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		
		default:
			System.out.println("You did not enter a valid response. Try again.\n");
			continue;
		
			
		}
	
	} while (ronnysPlayHouse.areAlive());
	
	}
}
