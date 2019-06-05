import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class Layout extends JFrame{
	GButton[][] buttons = new GButton[10][10]; 
	int rows = 9; 
	int cols = 9; 
	
	public Layout() {
		setLayout(new GridLayout(rows, cols)); 
		initBoard();
	}
	
	private void initBoard() {
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=cols; j++) {
				GButton button = null; 
				
				//create button
				if (i==1 || i==9 || j==1 || j==9) {
					//Route button
					button = new GButton(this, i + "" + j );	
				} else {
					//non route buttons, 
					button = new GButton(this);
				}
			
				//pink player final winning route button color
				if (i==j && i<5) {
					button.setBackground(Color.PINK);
					button.setText(i + "" + j );
				}
				
				//Blue player final winning route button color
				if (i==j && i>5) {
					button.setBackground(Color.CYAN);
					button.setText(i + "" + j );
				}
				
				//Green player final winning route button color
				if(i+j == 10 && i<5) {
					button.setBackground(Color.GREEN);
					button.setText(i + "" + j );
				}
				
				//Yellow player final winning route button color
				if(i+j == 10 && i>5) {
					button.setBackground(Color.YELLOW);
					button.setText(i + "" + j );
				}
				
				//Dice Button 
				if(i+j == 10 && i==5) {
					button.setBackground(Color.RED);
					button.setText("R");
					button.setEnabled(true);
					button.setDiceButton(true);
				}
				
				//Pink Home Button
				if (i==2 && j==3) {
					button.setText("PPPP");
					button.setForeground(Color.PINK);
					button.setHomeButton(true);
				}
				
				//Yellow Home Button
				if (i==7 && j==2) {
					button.setText("YYYY");
					button.setForeground(Color.YELLOW);
					button.setHomeButton(true);
				}
				
				//Green Home Button
				if (i==3 && j==8) {
					button.setText("GGGG");
					button.setForeground(Color.GREEN);
					button.setHomeButton(true);
				}
				
				//Blue Home Button
				if (i==8 && j==7) {
					button.setText("BBBB");
					button.setForeground(Color.BLUE);
					button.setHomeButton(true);
				}
				
				add(button);	
				buttons[i][j] = button; 
			}
			 
		}
	}

	public String getClickedText() {
		// TODO Auto-generated method stub
		return "Clicked";
	}

	public GButton[][] getButtons() {
		return buttons;
	}
}
