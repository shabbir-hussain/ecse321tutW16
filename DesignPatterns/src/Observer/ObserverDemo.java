package Observer;

import java.util.Random;

public class ObserverDemo {
	public static void main(String[] args){
		//oldWay();
		newWay();
	}

	public static void oldWay(){
		Magazine Billboard = new Magazine();

		Subscriber Meg = new  Subscriber(Billboard);
		Subscriber Stewie =  new Subscriber(Billboard);
		Subscriber Peter =  new Subscriber(Billboard);
		
		Meg.startThread();
		Stewie.startThread();
		Peter.startThread();
		
		while(true){
			try {
				Random r = new Random();
				Thread.sleep((long) (r.nextInt(2000)));
				Billboard.publishMagazine();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void newWay(){
		Magazine Billboard = new Magazine();

		Subscriber Meg = new  Subscriber(Billboard);
		Subscriber Stewie =  new Subscriber(Billboard);
		Subscriber Peter =  new Subscriber(Billboard);
		
		while(true){
			try {
				Random r = new Random();
				Thread.sleep((long) (r.nextInt(2000)));
				Billboard.publishMagazine();
				Billboard.notifyObservers();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
