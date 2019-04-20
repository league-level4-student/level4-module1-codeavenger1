package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		main2(Zodiac.AQUARIUS);
	}
	public static void main2(Zodiac horoscope){
		
		switch(horoscope) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "cancer");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "virgo");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "capricorn");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "scorpio");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "aries");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "gemini");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "aquarius");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "taurus");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "leo");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "pisces");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "libra");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "sagittarius");
			break;
		}
	}
}
