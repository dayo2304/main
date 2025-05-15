import java.util.HashMap;

public interface Metodos {
	public void guardar(Computadoras computadoras);
	public void editar(Computadoras computadoras);
	public void eliminar(Computadoras computadoras);
	public Computadoras buscar(Computadoras computadoras);
	public HashMap<Integer, Computadoras> listar();
}
