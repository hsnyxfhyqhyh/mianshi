
public class Player {

	private boolean isGreen = false; 
	private boolean isBlue = false; 
	private boolean isPink = false; 
	private boolean isYellow = false; 
	private GButton homeButton = null;
	
	private String name= ""; 
	
	private GButton[] positions = new GButton[4]; 
	
	private Player nextPlayer = null;
	
	

	public Player(String name) {
		if (name ==null) {
			this.name = "G"; 
		} else {
			this.name = name;
		}
		
		if (this.name.equalsIgnoreCase("Y")) {
			this.isYellow = true; 
		} else if(this.name.equalsIgnoreCase("B")) {
			this.isBlue = true; 
		} else if (this.name.equalsIgnoreCase("P")) {
			this.isPink = true; 
		} else {
			this.isGreen = true;
			this.name = "G";
		}
	}

	public GButton[] getPositions() {
		return positions;
	}

	public void setPositions(GButton[] positions) {
		this.positions = positions;
	}

	public boolean isGreen() {
		return isGreen;
	}

	public boolean isBlue() {
		return isBlue;
	}

	public boolean isPink() {
		return isPink;
	}

	public boolean isYellow() {
		return isYellow;
	}

	public String getName() {
		return name;
	}
	
	public GButton getHomeButton() {
		return homeButton;
	}

	public void setHomeButton(GButton homeButton) {
		this.homeButton = homeButton;
	}
	
	public Player getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}
}
