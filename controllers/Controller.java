package controllers;

import model.Due�o;
import model.Mascota;
import model.TiendaMascotas;

public class Controller {
	
	TiendaMascotas tiendaMascotas = new TiendaMascotas ("los animalitos");
	
	Due�o due�o1 = new Due�o ("pablo",30,"123",100000,tiendaMascotas);
	Due�o due�o2 = new Due�o ("carlos",20,"321",100000,tiendaMascotas);
	Due�o due�o3 = new Due�o ("chavo",18,"111",100000,tiendaMascotas);

	
	
}
