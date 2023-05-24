package domain.vehicle;

import domain.vehicle.enums.*;

public abstract class Vehicle {
	
	private String trademark;
	private String model;
	private int changes;
	private int maximumSpeed;
	private int cylinder;
	private EstadoVehiculo estadoVehiculo; 
	private TipoAbs tipoAbs;
	private TipoCombustible tipoCombustible;
	
	public Vehicle(String trademark, String model, int changes, int maximumSpeed, int cylinder,EstadoVehiculo estadoVehiculo,TipoAbs tipoAbs, TipoCombustible tipocombustible) {
		this.trademark = trademark;
		this.model = model;
		this.changes = changes;
		this.maximumSpeed = maximumSpeed;
		this.cylinder = cylinder;
		this.estadoVehiculo=estadoVehiculo;
		this.tipoAbs= tipoAbs;
		this.tipoCombustible= tipocombustible;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getChanges() {
		return changes;
	}

	public void setChanges(int changes) {
		this.changes = changes;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	
	
	
	
	

}

