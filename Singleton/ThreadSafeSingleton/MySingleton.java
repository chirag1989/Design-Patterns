package DesignPatterns.Singleton.ThreadSafeSingleton

public class MySingleton {
	
	private static volatile MySingleton innerInstance = null;
	
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		
		if (innerInstance == null) {
			
			synchronized(MySingleton.class) {
				if (innerInstance == null) {
					innerInstance = new MySingleton();
				}
			}
			
		}
		
		return innerInstance;
	}
}

