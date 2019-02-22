package jax.rest.app.messenger.database;

import java.util.HashMap;
import java.util.Map;

import jax.rest.app.messenger.model.Message;
import jax.rest.app.messenger.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
	
}
