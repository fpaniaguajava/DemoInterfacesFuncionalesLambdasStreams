package com.fernandopaniagua.demo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		java.util.ArrayList<Empleado> empleados;
		empleados = GeneradorEmpleados.generarEmpleados(10);
		
		//¿Hay empleados que cobran más de 70000?
		boolean hayEmpleados70000 = empleados.stream().anyMatch((emple)->(emple.getSalarioAnual()>=70000));
		System.out.println("¿Hay empleados con salarios >= 70000? " + hayEmpleados70000);
				
		//Listado de empleados que cobran más de 70000 (sin utilizar lambdas)
		List<Empleado> empleados70000 = empleados.stream().filter(new Filtro70000()).collect(Collectors.toList());
		for(Empleado empleado : empleados70000) {
			System.out.println(empleado);
		}
		
		//Número de empleados que cobran más de 70000 (Utilizando lambdas)
		long numeroEmpleados70000 = empleados.stream().filter((empleado)-> (empleado.getSalarioAnual()>=70000)).count();
		System.out.println("Número de empleados de más de 70000:" + numeroEmpleados70000);
		
		//¿Existe Anna Folgado Folgado?
		boolean hayAnnaFolgadoFolgado = empleados.stream().anyMatch((empleado)-> {
			return (
					(empleado.getNombre().equals("Anna")) && 
					(empleado.getApellido1().equals("Folgado")) && 
					(empleado.getApellido2().equals("Folgado")));
		});
		System.out.println("¿Hay alguna Anna Folgado Folgado en la lista de empleados?" + hayAnnaFolgadoFolgado);
		
		//¿Cuántos directores hay?
		long numeroDirectores = empleados.stream().filter((empleado)-> {
			return empleado.getPuesto().equals("Director");
		}).count();
		System.out.println(String.format("En la lista hay %d Directores", numeroDirectores));
	}
}
class Filtro70000 implements Predicate<Empleado> {
	@Override
	public boolean test(Empleado empleado) {
		return empleado.getSalarioAnual()>=70000;
	}
	
}
