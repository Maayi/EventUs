package data;

import java.sql.Date;
//
public class gestor {
	
	void registrarEvento(String name, String tipology, float price, String resources, Date dateEvent, Event listaEventos[])
	{	
		int encontrado;
		
		do {
			
			encontrado=0;
			
			for (int i=0; i<(listaEventos.length)-1; i++)
			{
				if (listaEventos[i].equals(listaEventos[i+1]))
				{
					encontrado=1;
				}
			}
			if(encontrado==1)
			{
				System.out.printf("\nEl nombre del evento ya existe\n");
			}
			
			
		}while(encontrado==1);
		
		//Event e= {name, tipology, price, resources, dateEvent};
		
	}
	
	void registrarEspacio()
	{
		
	}

}
