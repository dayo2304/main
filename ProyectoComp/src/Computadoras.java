import java.util.Date;

public class Computadoras {
	int key;
	String modelo; 
	String marca;
	String so;
	int capacidad;
	String color;
	Date fechaHoraVenta;
	double precio;
	public Computadoras(int key) {
		super();
		this.key = key;
	}
	public Computadoras(int key, String modelo, String marca, String so, int capacidad, String color,
			Date fechaHoraVenta, double precio) {
		this.key = key;
		this.modelo = modelo;
		this.marca = marca;
		this.so = so;
		this.capacidad = capacidad;
		this.color = color;
		this.fechaHoraVenta = fechaHoraVenta;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Computadoras [key=" + key + ", modelo=" + modelo + ", marca=" + marca + ", so=" + so + ", capacidad="
				+ capacidad + ", color=" + color + ", fechaHoraVenta=" + fechaHoraVenta + ", precio=" + precio + "]";
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getFechaHoraVenta() {
		return fechaHoraVenta;
	}
	public void setFechaHoraVenta(Date fechaHoraVenta) {
		this.fechaHoraVenta = fechaHoraVenta;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
