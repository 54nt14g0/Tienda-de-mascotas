package application;

import model.Due�o;
import model.Mascota;
import model.TiendaMascotas;

public class Application {

	public static void main(String[] args) {
		TiendaMascotas tiendaMascotas = new TiendaMascotas ("los animalitos");
		Due�o due�o1 = new Due�o ("pablo",30,"123",100000,tiendaMascotas);
		Due�o due�o2 = new Due�o ("carlos",20,"321",100000,tiendaMascotas);
		Due�o due�o3 = new Due�o ("chavo",18,"111",100000,tiendaMascotas);
		Mascota mascota1 = new Mascota (3,"conejo","blanco", "peque�o","poopy",null,12000,"987",tiendaMascotas);
		Mascota mascota2 = new Mascota (7,"perro","azul", "mediano","thor",null,20000,"876",tiendaMascotas);
		Mascota mascota3 = new Mascota (13,"gato","negro", "mediano","burbuja",null,25000,"765",tiendaMascotas);
		
		
	}
	
	
	// 1 -- escoger qu� due�o es
	// 2 -- que aparezca toda la info del due�o, incluyendo lista actual de mascotas.
	// 3 -- permitir comprar una mascota, permitiendo ver la lista de mascotas disponibles 
	// 4 -- mostrar el nuevo presupuesto del due�o tras realizar la compra
	// 5 -- Crear una opci�n que permita repetir los 4 pasos anteriores.
	
	
}
