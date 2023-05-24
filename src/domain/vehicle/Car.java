package domain.vehicle;

import domain.vehicle.enums.EstadoVehiculo;
import domain.vehicle.enums.TipoAbs;
import domain.vehicle.enums.TipoCombustible;

public abstract class Car extends Vehicle {
	
	private int numPassengers;
	private int numClow; 
	private int trunkCapacity;
	private int numberAirbags;
	
	public Car(String trademark, String model, int changes, int maximumSpeed, int cylinder,
			EstadoVehiculo estadoVehiculo, TipoAbs tipoAbs, TipoCombustible tipocombustible, int numPassengers, int numClow,
			int trunkCapacity,int numberAirbags ){
		super(trademark, model, changes, maximumSpeed, cylinder, estadoVehiculo, tipoAbs, tipocombustible);
		this.numPassengers= numPassengers;
		this.numClow= numClow;
		this.trunkCapacity= trunkCapacity;
		this.numberAirbags= numberAirbags;
		
	}	


	public int getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public int getNumClow() {
		return numClow;
	}

	public void setNumClow(int numClow) {
		this.numClow = numClow;
	}
	
	

}
