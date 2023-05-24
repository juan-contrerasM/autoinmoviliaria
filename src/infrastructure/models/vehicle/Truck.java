package infrastructure.models.vehicle;

import domain.vehicle.Vehicle;
import domain.vehicle.enums.EstadoVehiculo;
import domain.vehicle.enums.TipoAbs;
import domain.vehicle.enums.TipoCombustible;

public class Truck  extends Vehicle{
	private int loadingCapacity;
	private int numberAxes;
	
	public Truck(String trademark, String model, int changes, int maximumSpeed, int cylinder,
			EstadoVehiculo estadoVehiculo, TipoAbs tipoAbs, TipoCombustible tipocombustible, int loadingCapacity, int numberAxes) {
		super(trademark, model, changes, maximumSpeed, cylinder, estadoVehiculo, tipoAbs, tipocombustible);
		
		this.loadingCapacity=loadingCapacity;
		this.numberAxes=numberAxes;	
	}

	public int getLoadingCapacity() {
		return loadingCapacity;
	}

	public void setLoadingCapacity(int loadingCapacity) {
		this.loadingCapacity = loadingCapacity;
	}

	public int getNumberAxes() {
		return numberAxes;
	}

	public void setNumberAxes(int numberAxes) {
		this.numberAxes = numberAxes;
	}
	
	
	

}
