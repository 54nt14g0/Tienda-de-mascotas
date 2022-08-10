package controllers;

import model.Dueño;
import model.Mascota;
import model.TiendaMascotas;

public class Controller {
	
	TiendaMascotas tiendaMascotas = new TiendaMascotas ("los animalitos");
	
	Dueño dueño1 = new Dueño ("pablo",30,"123",100000,tiendaMascotas);
	Dueño dueño2 = new Dueño ("carlos",20,"321",100000,tiendaMascotas);
	Dueño dueño3 = new Dueño ("chavo",18,"111",100000,tiendaMascotas);

	
	
}
