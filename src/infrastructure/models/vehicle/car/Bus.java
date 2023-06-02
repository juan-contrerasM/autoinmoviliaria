package infrastructure.models.vehicle.car;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import domain.vehicle.Car;
import domain.vehicle.enums.EstadoVehiculo;
import domain.vehicle.enums.TipoAbs;
import domain.vehicle.enums.TipoCombustible;

public class Bus extends Car {

	@JsonCreator
	public Bus(@JsonProperty("trademark") String trademark, @JsonProperty("model") String model,
			@JsonProperty("changes") int changes, @JsonProperty("maximumSpeed") int maximumSpeed,
			@JsonProperty("cylinder") int cylinder, @JsonProperty("estadoVehiculo") EstadoVehiculo estadoVehiculo,
			@JsonProperty("tipoAbs") TipoAbs tipoAbs, @JsonProperty("tipocombustible") TipoCombustible tipocombustible,
			@JsonProperty("numPassengers") int numPassengers, @JsonProperty("numClow") int numClow,
			@JsonProperty("trunkCapacity") int trunkCapacity,@JsonProperty("numberAirbags") int numberAirbags) {
		super(trademark, model, changes, maximumSpeed, cylinder, estadoVehiculo, tipoAbs, tipocombustible, numPassengers,
				numClow, trunkCapacity, numberAirbags);
	}

}
