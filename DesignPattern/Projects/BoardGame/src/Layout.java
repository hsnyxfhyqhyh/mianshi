import java.awt.*; 
import javax.swing.*; 

public class Layout extends JFrame{

	JButton button1, button2, button3; 
	JButton button4, button5, button6;
	
	public Layout() {
		int rows = 9; 
		int cols = 9; 
		
		setLayout(new GridLayout(rows, cols)); 
		
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=cols; j++) {
				JButton button = null; 
				if (i==1 || i==9 || j==1 || j==9) {
					button = new JButton(i + "" + j );	
				} else {
					button = new JButton();
				}
				button.setEnabled(false);
				
				if (i==j && i<5) {
					button.setBackground(Color.PINK);
				}
				
				if (i==j && i>5) {
					button.setBackground(Color.CYAN);
				}
				
				if(i+j == 10 && i<5) {
					button.setBackground(Color.GREEN);
				}
				
				if(i+j == 10 && i>5) {
					button.setBackground(Color.YELLOW);
				}
				
				if(i+j == 10 && i==5) {
					button.setBackground(Color.RED);
					button.setText("R");
					button.setEnabled(true);
				}
				
				if (i==2 && j==3) {
					button.setText("PPPP");
					button.setForeground(Color.PINK);
				}
				if (i==7 && j==2) {
					button.setText("YYYY");
					button.setForeground(Color.YELLOW);
				}
				
				if (i==3 && j==8) {
					button.setText("GGGG");
					button.setForeground(Color.GREEN);
				}
				
				if (i==8 && j==7) {
					button.setText("BBBB");
					button.setForeground(Color.BLUE);
				}
				
				add(button);	
			}
			 
		}
	}
	
	public static void main(String[] args) {
		Layout me = new Layout(); 
		me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		me.setVisible(true);
		me.pack();
		me.setTitle("Test of GridLayout"); 
		me.setSize(900, 900);
	}

}
