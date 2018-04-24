import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
			String whatPet = JOptionPane.showInputDialog("what pet would u wanna buy");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
			for(int i = happinessLevel; i < 5; i = i + 0) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What u wanna do", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "walk", "food", "sleep" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
					if (task == 2) {
						sleep();
					} else if (task == 1) {
						food();
					} else if (task == 0) {
						walk();
					}
			
				i = happinessLevel;
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			JOptionPane.showMessageDialog(null, "ur good");
	}

	// 4. Create methods to handle each of your user selections.
	static void walk() { 
		JOptionPane.showMessageDialog(null, "your " + "dog" + " got hit by a car" );
		happinessLevel = happinessLevel - 1;
	}
	static void food() { 
		JOptionPane.showMessageDialog(null, "your " + "dog" + " got too fat aND DIABETIC but it had good food" );
		happinessLevel = happinessLevel + 1;
	}
	static void sleep() { 
		JOptionPane.showMessageDialog(null,"you never saw it again" );
		happinessLevel = happinessLevel + 0;
	}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}