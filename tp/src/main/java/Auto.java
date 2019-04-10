

public class Auto {
	
	private int temperatura = 0;
	private double combustible;
	private double capMaxComb;
	private int velocidad = 0;
	private boolean encendido = false;
	
	///////////////////////////////////////////
	
	
	public void encender() throws CombustibleException {
		
		if(this.combustible != 0)
		{
			this.encendido = true;
			this.temperatura = 70;
			this.combustible = this.combustible * 0.999;
		}
		else {
			throw new CombustibleException("No tenes nafta hermano");
		}
	}
	
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public double getCombustible() {
		return combustible;
	}

	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}

	public double getCapMaxComb() {
		return capMaxComb;
	}

	public void setCapMaxComb(double capMaxComb) {
		this.capMaxComb = capMaxComb;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public void apagar() {
		
	}
	
	public void acelerar() {
		
	}
	
	public void frenar() {
		
	}

	public Auto(double combustible, double capMaxComb) {
		super();
		this.combustible = combustible;
		this.capMaxComb = capMaxComb;
	}
}
