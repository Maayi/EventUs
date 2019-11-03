package data;

import java.util.ArrayList;
import java.util.Date;

public class Event {

	private String Name;
	private String Tipology;
	private Spaces space;
	private float Price;
	private String Resources;
	private Date DateEvent;
	private int hour;
	private int minutes;
	
	public Event()
	{
		//constructor
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getTipology() {
		return Tipology;
	}

	public void setTipology(String tipology) {
		this.Tipology = tipology;
	}
	
	public Spaces getSpace() {
		return space;
	}

	public void setSpace(Spaces space) {
		this.space = space;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getResources() {
		return Resources;
	}

	public void setResources(String resources) {
		this.Resources = resources;
	}

	public Date getDateEvent() {
		return DateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.DateEvent = dateEvent;
	}
	
	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}
	
	
	
}
