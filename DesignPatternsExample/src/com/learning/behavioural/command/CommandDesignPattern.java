package com.learning.behavioural.command;

interface ICommandAC {
	public void execute();
}

class AC {
	public void turnOn() {
		System.out.println("Ac is on");
	}

	public void turnOff() {
		System.out.println("Ac is Off");
	}

	public void incTemp() {
		System.out.println("Increasing Temperature by 1");
	}

	public void decTemp() {
		System.out.println("Decreasing Temperature by 1");
	}
}

class StartACCommand implements ICommandAC {

	AC ac;

	public StartACCommand(AC ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Turning On the AC");
		ac.turnOn();
	}

}


class StopACCommand implements ICommandAC {

	AC ac;

	public StopACCommand(AC ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Turning Off the AC");
		ac.turnOff();
	}

}


class IncTempAcCommand implements ICommandAC {

	AC ac;

	public IncTempAcCommand(AC ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Increasing temp of the AC");
		ac.incTemp();;
	}

}

class DecTempAcCommand implements ICommandAC {

	AC ac;

	public DecTempAcCommand(AC ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Decreasing temp  of the AC");
		ac.decTemp();
	}

}

class ACAutomationRemote{
	ICommandAC command;

	public void setCommand(ICommandAC command) {
		this.command = command;
	}
	
	public void buttonPressed()
	{
		command.execute();
	}
	
}

public class CommandDesignPattern {
	public static void main(String[] args) {

		AC acRoomOne = new AC();
		AC acRoomTwo = new AC();
		
		ACAutomationRemote remote = new ACAutomationRemote();
		
		remote.setCommand(new StartACCommand(acRoomOne));
		remote.buttonPressed();
		
		remote.setCommand(new StartACCommand(acRoomTwo));
		remote.buttonPressed();
		
		remote.setCommand(new IncTempAcCommand(acRoomTwo));
		remote.buttonPressed();
		
		Runnable r;
	}

}
