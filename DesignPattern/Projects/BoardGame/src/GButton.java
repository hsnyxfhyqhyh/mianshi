import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GButton extends JButton {
	private Position position ; 
	
//	private Player player; 
	private boolean isHomeButton = false; 
	private boolean isDiceButton = false; 
	private boolean isRouteButton = false;
	
	private Layout layout; 
	
	public GButton(Layout layout) {
		super();
		this.setEnabled(false);
		addAction();
		this.layout = layout; 
	}
	
	public GButton(Layout layout, String text) {
		super(text);
		this.setEnabled(false);
		addAction();
		this.layout = layout; 
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

//	public Player getPlayer() {
//		return player;
//	}
//
//	public void setPlayer(Player player) {
//		this.player = player;
//	}

	public boolean isHomeButton() {
		return isHomeButton;
	}

	public void setHomeButton(boolean isHomeButton) {
		this.isHomeButton = isHomeButton;
	}

	public boolean isDiceButton() {
		return isDiceButton;
	}

	public void setDiceButton(boolean isDiceButton) {
		this.isDiceButton = isDiceButton;
	}
	
	public boolean isRouteButton() {
		return isRouteButton;
	}

	public void setRouteButton(boolean isRouteButton) {
		this.isRouteButton = isRouteButton;
	}

	private void addAction() {
		this.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	GButton b = (GButton)e.getSource(); 
		    	b.setText(layout.getClickedText());
		    	GButton[][] buttons = b.getGLayout().getButtons(); 
		    	buttons[2][3].setEnabled(true);
		    }
		});
	}

	public Layout getGLayout() {
		return layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}
}
