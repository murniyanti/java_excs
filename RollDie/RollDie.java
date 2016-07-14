import javax.swing.*;

public class RollDie {
	public static void main (String args[]) {
		int frequency1=0;
		int frequency2=0;
		int frequency3=0;
		int frequency4=0;
		int frequency5=0;
		int frequency6=0;
		int face;

		//Summarize results

		for (int roll=1; roll<=6000; roll++) {
			face=1+ (int)(Math.random()*6);

			switch(face) {
				case 1:
					++frequency1;
					break;
				case 2:
					++frequency2;
					break;
				case 3:
					++frequency3;
					break;
				case 4:
					++frequency4;
					break;
				case 5:
					++frequency5;
					break;
				case 6:
					++frequency6;
					break;
			}//End of switch
		}//end for

		JTextArea outputArea = new JTextArea(7, 10);
		outputArea.setText(
			"Face/tFrequency"+
			"\n1\t"+frequency1+
			"\n2\t"+frequency2+
			"\n3\t"+frequency3+
			"\n4\t"+frequency4+
			"\n5\t"+frequency5+
			"\n6\t"+frequency6);

		JOptionPane.showMessageDialog(null, outputArea, "Rolling a die 6000 times", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}
}