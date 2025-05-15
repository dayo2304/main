import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int key;
		String modelo; 
		String marca;
		String so;
		int capacidad;
		String color;
		Date fechaHoraVenta;
		double precio;

		Computadoras computadora = null;
		Scanner lec = null;
		int menu, submenu;
		Implementacion imp = new Implementacion();

		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		do {
			System.out.println("\nBienbenido Computadoras X 🎯");
			System.out.println("Opcion 1: Alta codigo duro ✍");
			System.out.println("Opcion 2: Guardar registor 💾");
			System.out.println("opcion 3: Buscar 🔎");
			System.out.println("opcion 4: Actualizar 📥");
			System.out.println("opcion 5: Eliminar 🗑");
			System.out.println("opcion 6: Listar 📝");
			System.out.println("opcion 7: Buscar por modelo->Expresion lamda 📝");
			System.out.println("opcion 8: key,Value");
			System.out.println("opcion 9: Buscar por modelo-> ForEach 📝");
			System.out.println("opcion 10: Buscar por sabor");
			System.out.println("opcion 11: Buscar por modelo->Eliminar con expresion lamda 📝");
			System.out.println("opcion 15: Eliminar todo 📝");
			System.out.println("opcion 16: Serrar sesion 🔚");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				Computadoras computadora1 = new Computadoras(1, "yoga 360", "Lenovo", "Linux", 500, "Negro", java.sql.Date.valueOf("2025-01-05"), 30000.00);
				Computadoras computadora2 = new Computadoras(2, "inspirion", "Acer", "Windows", 1000, "Negro", java.sql.Date.valueOf("2025-01-29"), 25000.00);
				Computadoras computadora3 = new Computadoras(3, "Mac pro", "Apple", "mac os", 500, "Negro", java.sql.Date.valueOf("2025-01-05"), 35000.00);


				imp.guardar(computadora1);
				imp.guardar(computadora2);
				imp.guardar(computadora3);

				break;
			case 2:
				System.out.println("Ingrese la key:");
				lec = new Scanner(System.in);
				key = lec.nextInt();

				System.out.println("Ingrese el modelo:");
				lec = new Scanner(System.in);
				modelo = lec.next();

				System.out.println("Ingrese la marca:");
				lec = new Scanner(System.in);
				marca = lec.next();

				System.out.println("Ingrese el sistema operativo:");
				lec = new Scanner(System.in);
				so = lec.next();

				System.out.println("Ingrese la capacidad:");
				lec = new Scanner(System.in);
				capacidad = lec.nextInt();
				
				System.out.println("Ingrese el color:");
				lec = new Scanner(System.in);
				color = lec.next();

				System.out.println("Ingrese la fecha:");
				lec = new Scanner(System.in);
				String fechaStr = lec.next();

				// castear
				LocalDate fechaNuevo = LocalDate.parse(fechaStr, formatoFecha);
				fechaHoraVenta = Date.from(fechaNuevo.atStartOfDay(ZoneId.systemDefault()).toInstant());

				System.out.println("Ingrese el precio:");
				lec = new Scanner(System.in);
				precio = lec.nextInt();

				computadora = new Computadoras(key, modelo, marca, so, capacidad, color, fechaHoraVenta, precio);

				imp.guardar(computadora);
				break;
			case 3:
				System.out.println("Ingrese la key");
				lec = new Scanner(System.in);
				key = lec.nextInt();

				computadora = new Computadoras(key);
				computadora = imp.buscar(computadora);
				System.out.println("Se encontro la computadora" + computadora);
				break;
			case 4:
				System.out.println("Ingrese la key");
				lec = new Scanner(System.in);
				key = lec.nextInt();

				computadora = new Computadoras(key);
				computadora = imp.buscar(computadora);
				System.out.println("Se encontro la computadora" + computadora);

				do {
					System.out.println("1.-Editar modelo");
					System.out.println("2.-Editar marca");
					System.out.println("3.- Menu");
					
					lec = new Scanner(System.in);
					submenu = lec.nextInt();
					
					switch (submenu) {
					case 1:
						System.out.println("Ingrese el modelo");
						lec = new Scanner(System.in);
						modelo = lec.next();
						
						computadora.setModelo(modelo);
						imp.editar(computadora);
						break;
					case 2:
						System.out.println("Ingrese la marca");
						lec = new Scanner(System.in);
						marca = lec.next();
						
						computadora.setMarca(marca);;
						imp.editar(computadora);
						break;
					case 3:
						System.out.println("Menu Principal");
						break;
					}
				} while (submenu < 0 || submenu > 3);
				break;
			case 5:
				System.out.println("Ingrese la key");
				lec = new Scanner(System.in);
				key = lec.nextInt();

				computadora = new Computadoras(key);
				imp.eliminar(computadora);
				break;
			case 6:
				System.out.println("lista de computadoras" + imp.listar());

				break;
			case 7:
				System.out.println("Ingrese el modelo");
				lec = new Scanner(System.in);
				modelo = lec.next();
				
				Optional<Computadoras> computadoraLamda = imp.buscarNombreLamda(modelo);
				System.out.println("Se encontro la computadora por lamda:"+computadoraLamda);
				
				break;
			case 8:
				imp.keyValue();
				break;
			case 9:
				System.out.println("Ingrese el modelo");
				lec = new Scanner(System.in);
				modelo = lec.next();
				
				computadora = imp.buscarMarca(modelo);
				System.out.println("Se encontro la computadora:"+computadora);
				break;
			case 10:
				System.out.println("Ingrese la marca");
				lec = new Scanner(System.in);
				marca = lec.next();
				
				computadora = imp.buscarMarca(marca);
				System.out.println("Se encontro la computadora por marca:"+computadora);
				break;
			case 11:
				System.out.println("Ingrese el modelo");
				lec = new Scanner(System.in);
				modelo = lec.next();
				
				imp.EliminarLamda(modelo);
				break;
			case 15:
				System.out.println("Desea eliminar todas las computadoras... si/no");
				lec = new Scanner(System.in);
				String eliminarAll = lec.next();
				
				imp.EliminarTodo(eliminarAll);
				break;
			case 16:
				System.out.println("Saliendo del sistema...");
				break;
			}

		} while (menu != 16);
	}
}
