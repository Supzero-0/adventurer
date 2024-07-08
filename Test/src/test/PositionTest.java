package test;

import org.junit.Test;

import adventurer.Position;

import static org.junit.Assert.*;

public class PositionTest {
	
	@Test
	public void testParameterizedConstructor() {
		Position position = new Position(3,4);
		assertEquals(3, position.getX());
		assertEquals(4, position.getY());
	}
	
	@Test
	public void testSetters() {
		Position position = new Position(0,0);
		position.setX(5);
		position.setY(6);
		assertEquals(5, position.getX());
		assertEquals(6, position.getY());
	}
}
