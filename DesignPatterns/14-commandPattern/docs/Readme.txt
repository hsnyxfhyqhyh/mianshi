Command Pattern:

http://www.newthinktank.com/2012/09/command-design-pattern-tutorial/

1. define ElectronicDevice Interface, which declares on/off/volumeup/volumdown method. 
2. define Television class to implement ElectronicDevice interface, which has the concrete on/off/volumeup/volumdown
3. define Command interface, which has execute/undo declared. 
4. Define TurnTVOn/TurnTVOff/TurnTVUp class which implements Command interface. 
	These concrete Command Classes have a constructor to accept an instance of ElectronicDevice object, like TV/Radio. 
	Then in the execute method can use the ElectronicDevice instance to execute the real method. 
		Undo method will do the opposite function of the command is suppose to do. 
5. DeviceButton is the action invoker class. It accepts a command in the constructor defined. 
	And the command has the device binded to it. 
	So the pressed function will invoke the command and then invoke the device's function. 
6.  PlayWithRemoteClient will first create a device, 
		then use the device to create a command, 
		then use the command to create a DeviceButton.
		then call the DeviceButton'press function to invoke the command's execute function to execute the real device's function. 
		
		
		