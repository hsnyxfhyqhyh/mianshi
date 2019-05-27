package study.c01;

public interface Subject {
	public void register(Observer o); 
	public void unregister(Observer o); 
	public void notifyObserver(); 
	
}
