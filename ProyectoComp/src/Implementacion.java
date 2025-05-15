import java.util.HashMap;
import java.util.Optional;
import java.util.Map.Entry;

public class Implementacion implements Metodos {

	HashMap<Integer, Computadoras> hash = new HashMap<Integer, Computadoras>();
	
	@Override
	public void guardar(Computadoras computadoras) {
		if (hash.isEmpty()) {
			hash.put(computadoras.getKey(), computadoras);
			System.out.println("Se guardo la computadora");
		} else {
			hash.put(computadoras.getKey(), computadoras);
			System.out.println("Se guardo la computadora");
		}
	}

	@Override
	public void editar(Computadoras computadoras) {
		hash.put(computadoras.getKey(), computadoras);
		System.out.println("Se edito la computadora");
	}

	@Override
	public void eliminar(Computadoras computadoras) {
		hash.remove(computadoras.getKey());
		System.out.println("Se elimino la computadora");
	}

	@Override
	public Computadoras buscar(Computadoras computadoras) {
		return hash.get(computadoras.getKey());
	}

	@Override
	public HashMap<Integer, Computadoras> listar() {
		// TODO Auto-generated method stub
		return hash;
	}
	public String keyValue() {
		for(Entry<Integer, Computadoras> p : hash.entrySet()) {
			System.out.println("Key"+p.getKey());
			System.out.println("Value"+p.getValue());
		}
		return "key, Value";
	}
	
	public Computadoras buscarModelo(String nombre) {
		Computadoras computadorabuscar = null;
		for(Entry<Integer, Computadoras> p : hash.entrySet()) {
			if(p.getValue().getModelo().equalsIgnoreCase(nombre)) {
				computadorabuscar = p.getValue();
			}else {
				System.out.println("No se encontro la computadora");
			}
		}
		return computadorabuscar;
	}
	
	public Computadoras buscarMarca(String marca) {
		Computadoras productobuscar = null;
		for(Computadoras p: hash.values()) {
			if(p.getMarca().equalsIgnoreCase(marca)) {
				productobuscar =p;
			}else {
				System.out.println("No se encontro el producto");
			}
		}
		return productobuscar;
	}
	
	public Optional<Computadoras> buscarNombreLamda(String modelo) {
		Optional<Computadoras> producto = hash.values().stream().filter(a -> a.getModelo().equalsIgnoreCase(modelo)).findFirst();
		return producto;
	}
	
	public void EliminarLamda(String nombre) {
		hash.values().removeIf(a -> a.getModelo().equalsIgnoreCase(nombre));
		System.out.println("Se elimino el producto");
		
	}
	
	public void EliminarTodo(String opcion) {
		if(opcion.equalsIgnoreCase("si")) {
			hash.clear();
		}else {
			System.out.println("Volviendo al menu...");
		}
	}
}
