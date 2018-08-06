package example;

import enums.TrafficSignal;

public class EnumConstrucotorExample {

	public static void main(String[] args) {
		
		TrafficSignal[] signals = TrafficSignal.values();
		
		for(TrafficSignal signal : signals){			
			System.out.println("Name: "+signal.name()+" Action:"+signal.getAction());
		}

	}

}
