package com.sinensia.investment;

public class PensionPlan {

	public static double Desgrave(double dineroGanado, double dineroPersona, double dineroEmpresa) {
		double dineroDesgravado = 0;
		
		if(dineroGanado <= 12450) {
			dineroDesgravado = dineroPersona*0.19;
		}else if(dineroGanado>12450 && dineroGanado <= 20200) {
			dineroDesgravado = dineroPersona*0.24;
		}else if(dineroGanado>20200 && dineroGanado <= 35200) {
			dineroDesgravado = dineroPersona*0.30;
		}else if(dineroGanado>35200 && dineroGanado <= 60000) {
			dineroDesgravado = dineroPersona*0.37;
		}else if(dineroGanado>60000 && dineroGanado <= 300000) {
			dineroDesgravado = dineroPersona*0.45;
		}else if(dineroGanado > 300000) {
			dineroDesgravado = dineroPersona*0.47;
		}
		
		dineroDesgravado += dineroEmpresa*0.25;
		return dineroDesgravado;
	}

}