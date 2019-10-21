package data;

import java.util.ArrayList;

public class Spaces 
{
	
	private int idSpace;
	private String name;
	private String address;
	
	private ArrayList<Event> listaEventos;

	public int getIdSpace() {
		return idSpace;
	}

	public void setIdSpace(int idSpace) {
		this.idSpace = idSpace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Event> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(ArrayList<Event> listaEventos) {
		this.listaEventos = listaEventos;
	}
	
	
	
		
}
