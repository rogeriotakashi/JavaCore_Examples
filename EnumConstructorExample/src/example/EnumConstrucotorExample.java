package example;

import enums.EnumThread;
import enums.TrafficSignal;

public class EnumConstrucotorExample {

	public static void main(String[] args) {
		
		TrafficSignal[] signals = TrafficSignal.values();
		
		for(TrafficSignal signal : signals){			
			System.out.println("Name: "+signal.name()+" Action:"+signal.getAction());
		}

		//Interface implementation in Enum Class Example  e.g. Runnable
		EnumThread thread = EnumThread.ONE;
		thread.run();
		
		thread = EnumThread.TWO;
		thread.run();
		
		thread = EnumThread.THREE;
		thread.run();
		
		//Numero da posição da constante
		System.out.println(EnumThread.ONE.ordinal());	
		
		//Nome da constante
		System.out.println(EnumThread.ONE.name());
		
	}

}
