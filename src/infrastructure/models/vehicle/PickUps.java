package infrastructure.models.vehicle;

import domain.vehicle.Car;
import domain.vehicle.enums.EstadoVehiculo;
import domain.vehicle.enums.TipoAbs;
import domain.vehicle.enums.TipoCombustible;

public class PickUps extends Car {
	private int loadingCapacity;
	
	public PickUps(String trademark, String model, int changes, int maximumSpeed, int cylinder,
			EstadoVehiculo estadoVehiculo, TipoAbs tipoAbs, TipoCombustible tipocombustible, int numPassengers,
			int numClow, int trunkCapacity, int numberAirbags, int loadingCapacity) {
		super(trademark, model, changes, maximumSpeed, cylinder, estadoVehiculo, tipoAbs, tipocombustible, numPassengers,
				numClow, trunkCapacity, numberAirbags);
		
		this.loadingCapacity = loadingCapacity;
		
	}

	

	
}
