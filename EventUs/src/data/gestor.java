package data;

import java.sql.Date;
//
public class gestor {
	
	void registrarEvento(Event evento, Event listaEventos[])
	{	
		int encontrado;
		
		do {
			
			encontrado=0;
			
			for (int i=0; i<(listaEventos.length); i++)
			{
				if (listaEventos[i].getName().equals(evento.getName()))
				{
					encontrado=1;
				}
			}
			if(encontrado==1)
			{
				System.out.printf("\nEl nombre del evento ya existe\n");
			}
			
			
		}while(encontrado==1);
		
		//guardar en la base de datos el evento
		
	}
	
	void registrarEspacio(Spaces space, Spaces listaEspacios[])
	{
		int encontrado;
		
		do {
			
			encontrado=0;
			
			for (int i=0; i<(listaEspacios.length); i++)
			{
				
				if (listaEspacios[i].getIdSpace()==space.getIdSpace())
				{
					encontrado=1;
				}
			}
			
			if (encontrado==1)
			{
				System.out.printf("\nEl ID del espacio ya existe\n");
			}
			
		}while (encontrado==1);
		
		//guardar en la base de datos el espacio
	}

}
