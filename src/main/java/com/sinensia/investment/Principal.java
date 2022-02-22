package com.sinensia.investment;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona plan dew inversión al que vas a aportar:");
		System.out.println("1. Plan de pensiones de persona física");
		System.out.println("2. Plan de pensiones empresarial");
		System.out.println("3. Ambos");
		int opcion = sc.nextInt();

		System.out.println("¿Cuánto dinero has ganado este año? (€ brutos anuales)");
		int dineroGanado = sc.nextInt();
		int dineroPersonaFísica = 0;
		int dineroEmpresarial = 0;
		if(opcion == 1 || opcion == 3) {
			System.out.println("¿Cuánto dinero aportamos al plan de persona física?");
			dineroPersonaFísica = sc.nextInt();
		}
		if(opcion == 2 || opcion == 3) {
			System.out.println("¿Cuánto dinero aportamos al plan empresarial?");
			dineroEmpresarial = sc.nextInt();
		}

		//PensionPlan pensionPlan = new PensionPlan();

		double dineroDesgrave = PensionPlan.Desgrave(dineroGanado, dineroPersonaFísica, dineroEmpresarial);
		System.out.println("El dinero desgravado es: "+ dineroDesgrave);
		sc.close();//we should use try with resources


	}

}

