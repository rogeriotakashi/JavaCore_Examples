package enums;

public enum TrafficSignal {
	
	//This will call enum contructor with one String argument
	RED("wait"), GREEN("go"), ORANGE("slow down");
	
	private String action;
	
	public String getAction(){
		return this.action;
	}
	
	TrafficSignal(String action){
		this.action = action;
	}
	
	
}
