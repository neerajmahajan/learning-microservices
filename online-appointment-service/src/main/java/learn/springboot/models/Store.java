package learn.springboot.models;

import java.util.Calendar;
import java.util.List;

public class Store {

	private String name;
	private List<Calendar> timeSlots;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Calendar> getTimeSlots() {
		return timeSlots;
	}
	public void setTimeSlots(List<Calendar> timeSlots) {
		this.timeSlots = timeSlots;
	}
}
