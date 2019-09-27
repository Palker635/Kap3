/*
Uppgift 3.1
Skapat 2019-09-26
Dev: Isac Hansson
*/

import javax.swing.*; 
public class Uppgift33	{
	public static void main (String[] args) {
	double pi = 3.1415; 
	double radie;
	
	radie = Double.parseDouble (JOptionPane.showInputDialog(null, "Vilken radie har din cirkel?"));
	JOptionPane.showMessageDialog(null, radie*radie*pi);
		}
}