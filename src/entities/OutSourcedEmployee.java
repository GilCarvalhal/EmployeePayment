package entities;

public class OutSourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutSourcedEmployee() {
		super();
	}

	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	/*
	 * Funcionário tercerizado recebe um bônus de 110% de sua despesa adicional.
	 */
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
