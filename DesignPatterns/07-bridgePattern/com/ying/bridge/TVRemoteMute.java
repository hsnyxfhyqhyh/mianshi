package com.ying.bridge;

//Refined Abstraction

//If I decide I want to further extend the remote I can

public class TVRemoteMute extends RemoteControl{
	
	public TVRemoteMute(EntertainmentDevice newDevice) {
		super(newDevice);
	}
	
	public void buttonNinePressed() {
		
		System.out.println("TV was Muted");
		
	}
	
}