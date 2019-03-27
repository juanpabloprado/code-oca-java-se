
public class Car implements Vehicle {
	int topSpeed;
	boolean running;
	
	Car(int topSpeed, boolean running) {
		this.topSpeed = topSpeed;
		this.running = running;
	}

	public boolean isRunning() {
		return running;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	@Override
	public void run() {
	}
	
}
