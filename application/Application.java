package application;

import model.Dueño;
import model.Mascota;
import model.TiendaMascotas;

public class Application {

	public static void main(String[] args) {
		TiendaMascotas tiendaMascotas = new TiendaMascotas ("los animalitos");
		Dueño dueño1 = new Dueño ("pablo",30,"123",100000,tiendaMascotas);
		Dueño dueño2 = new Dueño ("carlos",20,"321",100000,tiendaMascotas);
		Dueño dueño3 = new Dueño ("chavo",18,"111",100000,tiendaMascotas);
		Mascota mascota1 = new Mascota (3,"conejo","blanco", "pequeño","poopy",null,12000,"987",tiendaMascotas);
		Mascota mascota2 = new Mascota (7,"perro","azul", "mediano","thor",null,20000,"876",tiendaMascotas);
		Mascota mascota3 = new Mascota (13,"gato","negro", "mediano","burbuja",null,25000,"765",tiendaMascotas);
		
		
	}
	
	
	// 1 -- escoger qué dueño es
	// 2 -- que aparezca toda la info del dueño, incluyendo lista actual de mascotas.
	// 3 -- permitir comprar una mascota, permitiendo ver la lista de mascotas disponibles 
	// 4 -- mostrar el nuevo presupuesto del dueño tras realizar la compra
	// 5 -- Crear una opción que permita repetir los 4 pasos anteriores.
	
	
}
