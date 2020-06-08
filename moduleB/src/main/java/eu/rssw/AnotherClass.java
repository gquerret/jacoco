package eu.rssw;

public class AnotherClass {
	private MyClass myCls;
	
	public AnotherClass(int xx) {
		this.myCls = new MyClass(xx);
	}

	public int getSomething() {
		return myCls.getSomething() * 2;
	}
}
