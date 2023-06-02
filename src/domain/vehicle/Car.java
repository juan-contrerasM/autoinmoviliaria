package domain.vehicle;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import domain.vehicle.enums.EstadoVehiculo;
import domain.vehicle.enums.TipoAbs;
import domain.vehicle.enums.TipoCombustible;

public abstract class Car extends Vehicle {

	private int numPassengers;
	private int numClow;
	private int trunkCapacity;
	private int numberAirbags;

	@JsonCreator
	public Car(@JsonProperty("trademark") String trademark, @JsonProperty("model") String model,
			@JsonProperty("changes") int changes, @JsonProperty("maximumSpeed") int maximumSpeed,
			@JsonProperty("cylinder") int cylinder, @JsonProperty("estadoVehiculo") EstadoVehiculo estadoVehiculo,
			@JsonProperty("tipoAbs") TipoAbs tipoAbs, @JsonProperty("tipocombustible") TipoCombustible tipocombustible,
			@JsonProperty("numPassengers") int numPassengers, @JsonProperty("numClow") int numClow,
			@JsonProperty("trunkCapacity") int trunkCapacity,@JsonProperty("numberAirbags") int numberAirbags) {
		super(trademark, model, changes, maximumSpeed, cylinder, estadoVehiculo, tipoAbs, tipocombustible);
		this.numPassengers = numPassengers;
		this.numClow = numClow;
		this.trunkCapacity = trunkCapacity;
		this.numberAirbags = numberAirbags;

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

	public int getTrunkCapacity() {
		return trunkCapacity;
	}

	public void setTrunkCapacity(int trunkCapacity) {
		this.trunkCapacity = trunkCapacity;
	}

	public int getNumberAirbags() {
		return numberAirbags;
	}

	public void setNumberAirbags(int numberAirbags) {
		this.numberAirbags = numberAirbags;
	}

}
