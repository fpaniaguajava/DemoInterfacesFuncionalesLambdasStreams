package com.fernandopaniagua.demo;

import java.util.ArrayList;

public class GeneradorEmpleados {
	static String[] NOMBRES = {"Pedro","Luis","Miguel","Vicente","Anibal","Fernando",
			"Lucía","Dolores","Anna","María","Steve","Richard","Kevin","Pablo","Cristiano","Lionel"};
	static String[] APELLIDOS = {"Folgado","Rodríguez","Leyda","Gasent","Rodríguez","Martínez","Gunnar","Choque","Ronaldo","Messi"};
	static String[] PUESTOS = {"Auxiliar","Programador Junior", "Programador Senior", "Tester", "QA Manager", "Director", "Presidente"};
	static int SALARIO_MINIMO = 15_000;
	static int SALARIO_MAXIMO = 80_000;
	public static ArrayList<Empleado> generarEmpleados(int numeroEmpleados){
		System.out.println("Generando " + numeroEmpleados + " empleados.");
		ArrayList<Empleado> empleados = new ArrayList();
		
		for (int i=0;i<numeroEmpleados;i++) {
			//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
			String nombre = NOMBRES[(int)(Math.random()*NOMBRES.length)];
			//if (i==10) nombre="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
			String apellido1 = APELLIDOS[(int)(Math.random()*APELLIDOS.length)];
			String apellido2 = APELLIDOS[(int)(Math.random()*APELLIDOS.length)];
			String puesto = PUESTOS[(int)(Math.random()*PUESTOS.length)];
			int salario = (int)((Math.random()*(SALARIO_MAXIMO-SALARIO_MINIMO))+SALARIO_MINIMO);
			empleados.add(new Empleado(nombre, apellido1, apellido2, puesto, salario));
		}
		return empleados;
	}
}
