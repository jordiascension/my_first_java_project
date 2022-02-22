package com.sinensia.investment;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class PensionPlanTest {
	
	@Test
	@Parameters({ 
	      "300001, 10000, 1000", 
	      "300000, 10000, 1000"})
	public void DesgravacionTest(double dineroGanado, double dineroPersona, double dineroEmpresa) {
		//PensionPlan pensionPlan = new PensionPlan();
		double num1 = PensionPlan.Desgrave(dineroGanado, dineroPersona, dineroEmpresa);
		assertTrue(num1 > 0);
	}

}
