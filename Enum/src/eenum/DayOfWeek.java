package eenum;

public enum DayOfWeek {
	MONDAY("monday"),
	TUESDAY("tuesday"),
	WEDNESDAY("wednesday"),
	THURSDAY("thursday"),
	FRIDAY("friday"),
	SATURDAY("saturday"),
	SUNDAY("sunday");
	
private final String name;

DayOfWeek(String name){
	this.name=name;
	}
public String getName() {
	return name;
}
}
