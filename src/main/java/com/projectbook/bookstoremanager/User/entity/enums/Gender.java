package com.projectbook.bookstoremanager.User.entity.enums;


public enum Gender {
	
	MALE("male"),
	FAMALE("Famale");
	
	private String description;

	Gender(String string) {
 	}

	public String getDescription() {
		return description;
	}	
}
