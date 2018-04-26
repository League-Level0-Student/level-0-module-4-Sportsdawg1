//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        int isWeekday2 = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
        if (isWeekday2 == 1) {
        	isWeekday = false;
        } else {
        	isWeekday = true;
        }
        int isVacation2 = JOptionPane.showConfirmDialog(null, "is it a vacation?", "", JOptionPane.YES_NO_OPTION);
        System.out.println(isWeekday2);
        if (isVacation2 == 1) {
        	isVacation = false;
        } else {
        	isVacation = true;
        }
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
    
        
	    if (isVacation || !isWeekday || isVacation && isWeekday) {
	        JOptionPane.showMessageDialog(null, "sleep in");
	    } else { 
	        JOptionPane.showMessageDialog(null, "get up");
	    }
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
