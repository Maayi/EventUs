package data;

import java.util.ArrayList;
import java.util.Date;

public class Event {

	private String Name;
	private String Tipology;
	private Spaces Space;
	private float Price;
	private String Resources;
	private Date DateEvent;
	private int Hour;
	private int Minutes;
	
	public Event(String name, String tipology, float price, String resources, Date date, int hour, int minutes)
	{
		this.Name = name;
		this.Tipology = tipology;
		this.Price = price;
		this.Resources = resources;
		this.DateEvent = date;
		this.Hour = hour;
		this.Minutes = minutes;
	}

	public void addSpace (Spaces space)
	{
		this.Space= space;
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
		return Space;
	}

	public void setSpace(Spaces space) {
		this.Space = space;
	}

	public int getHour() {
		return Hour;
	}

	public void setHour(int hour) {
		this.Hour = hour;
	}
	
	public int getMinutes()
	{
		return Minutes;
	}
	
	public void setMinutes(int minutes) {
		this.Minutes = minutes;
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
