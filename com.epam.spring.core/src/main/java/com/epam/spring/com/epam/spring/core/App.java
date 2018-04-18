package com.epam.spring.com.epam.spring.core;

/**
 * Hello world!
 *
 */
public class App 
{
	private Client client;
	private ConsoleEventLogger eventLogger;
	
	public void logEvent(String msg)
	{
		msg = msg.replaceAll(client.getId(), client.getFullName());
		eventLogger.logEvent(msg);
	}

	public static void main( String[] args )
    {
        App app = new App();
        
        app.client = new Client("1", "User");
        app.eventLogger = new ConsoleEventLogger();
        
        app.logEvent("New event from 1");
    }
}
