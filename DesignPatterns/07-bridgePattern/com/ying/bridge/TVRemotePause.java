package com.ying.bridge;

//Refined Abstraction

//If I decide I want to further extend the remote I can

public class TVRemotePause extends RemoteControl{
	
	public TVRemotePause(EntertainmentDevice newDevice) {
		super(newDevice);
	}
	
	public void buttonNinePressed() {
		
		System.out.println("TV was Paused");
		
	}
	
}