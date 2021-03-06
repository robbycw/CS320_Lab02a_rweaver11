package edu.ycp.cs320.lab02a_rweaver11.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_rweaver11.controller.NumbersController;
import edu.ycp.cs320.lab02a_rweaver11.model.Numbers;

public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	@Before
	public void setUp() {
		model = new Numbers();
		controller = new NumbersController();
		
		model.setFirst(2.0);
		model.setSecond(2.0);
		model.setThird(2.0);
		
		controller.setModel(model);
	}
	
	@Test
	public void testAdd() {
		controller.add();
		assertEquals((Double) 6.0, model.getResult());
	}
	
	@Test
	public void testMultiply() {
		controller.multiply();
		assertEquals((Double) 4.0, model.getResult());
	}

}
