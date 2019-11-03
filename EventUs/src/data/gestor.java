package data;

import java.sql.Date;
//
public class gestor {
	
	void registrarEvento(String name, String tipology, Spaces space, float price, String resources, Date dateEvent, int hour, int minutes, Event listaEventos[])
	{	
		int encontrado;
		
		do {
			
			encontrado=0;
			
			for (int i=0; i<(listaEventos.length)-1; i++)
			{
				if (listaEventos[i].getName().equals(listaEventos[i+1].getName()))
				{
					encontrado=1;
				}
			}
			if(encontrado==1)
			{
				System.out.printf("\nEl nombre del evento ya existe\n");
			}
			
			
		}while(encontrado==1);
		
		//Event e= {name, tipology, space, price, resources, dateEvent, hour, minutes};
		//guardar en la base de datos
		
	}
	
	void registrarEspacio(int idSpace, String name, String adress, int capacity, String resources, Spaces listaEspacios[])
	{
		int encontrado;
		
		do {
			
			encontrado=0;
			
			for (int i=0; i<(listaEspacios.length)-1; i++)
			{
				
				if (listaEspacios[i].getIdSpace()==listaEspacios[i+1].getIdSpace())
				{
					encontrado=1;
				}
			}
			
			if (encontrado==1)
			{
				System.out.printf("\nEl ID del espacio ya existe\n");
			}
			
		}while (encontrado==1);
		
		//Spaces s={idSpace, name, adress, capacity, resources};
		//guardar en la base de datos
	}

}
