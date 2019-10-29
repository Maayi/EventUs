package data;

import java.util.ArrayList;
import java.util.Date;

public class Event {

	private String Name;
	private String Tipology;
	private float Price;
	private String Resources;
	private Date DateEvent;
	//private Spaces space;
	
	private ArrayList<Spaces> listaEspacios;
	
	public Event()
	{
		//constructor
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTipology() {
		return Tipology;
	}

	public void setTipology(String tipology) {
		Tipology = tipology;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public String getResources() {
		return Resources;
	}

	public void setResources(String resources) {
		Resources = resources;
	}

	public Date getDateEvent() {
		return DateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		DateEvent = dateEvent;
	}

	public ArrayList<Spaces> getListaEspacios() {
		return listaEspacios;
	}

	public void setListaEspacios(ArrayList<Spaces> listaEspacios) {
		this.listaEspacios = listaEspacios;
	}
	
	
	
}
