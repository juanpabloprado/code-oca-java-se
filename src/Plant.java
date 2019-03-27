
public abstract class Plant {
	private int age;
	private int height;
	
	public int getHeight() {
		return height;
	}
	
	public void addYearToAge() {
		age++;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}
	
	abstract public void doSpring();
	abstract public void doSummer();
	abstract public void doFall();
	abstract public void doWinter();
}
