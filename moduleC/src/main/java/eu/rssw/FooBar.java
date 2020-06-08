package eu.rssw;

public class FooBar {
	private AnotherClass cls;

	public FooBar(int xx) {
		this.cls = new AnotherClass(xx);
	}

	public int getSomething() {
		return cls.getSomething() * 2;
	}
}
