

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		
		String times = JOptionPane.showInputDialog("how many times do you want the calc to work");
		int timesnum = Integer.parseInt(times);
		for (int i = 0; i < timesnum; i++) {
			// 1. Get 2 numbers from the user and convert them to integer.
		String num1String;
		num1String = JOptionPane.showInputDialog("first number?");
		String num2String;
		num2String = JOptionPane.showInputDialog("second number?");
		int num1;
		num1 = Integer.parseInt(num1String);
		int num2;
		num2 = Integer.parseInt(num2String);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What Operation?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide"},
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		
			
		
		if (operation == 0) {
			add(num1,num2);
		} else if (operation == 1) {
			sub(num1,num2);
		} else if (operation == 2) {
			multiply(num1,num2);
		} else if (operation == 3) {
			divide(num1,num2);
		}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add (int num1, int num2) {
		int numadd = num1+num2;
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + numadd);
	}
	// 4. Create similar methods for subtraction, multiplication and division.
	static void sub (int num1, int num2) {
		int numsub = num1-num2;
		JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + numsub);
	}
	static void multiply (int num1, int num2) {
		int nummult = num1*num2;
		JOptionPane.showMessageDialog(null, num1 + " X " + num2 + " = " + nummult);
	}
	static void divide (int num1, int num2) {
		int numdivide = num1/num2;
		JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + numdivide);
	}
}