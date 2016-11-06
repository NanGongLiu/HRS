package TestRoom;

import static org.junit.Assert.*;

import org.junit.Test;

import Mock.MockRoom;

public class GetPriceTester {

	@Test
	public void testGetPrice() {
		
		MockRoom room1 = new MockRoom("303", "��ִ��", "�󴲷�", 1, 200);
		MockRoom room2 = new MockRoom("304", "δִ��", "��׼��", 2, 300);
		
		assertEquals(200, room1.getPrice());
		assertEquals(300, room2.getPrice());
		
	}

}
