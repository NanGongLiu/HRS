package TestHotel;

import static org.junit.Assert.*;

import org.junit.Test;

import LineItem.RoomLineItem;
import List.RoomList;
import Mock.MockRoom;
import Object.Hotel;

public class GetRoomInfoTester {

	@Test
	public void testGetRoomInfo() {
		
		MockRoom room1 = new MockRoom("303", "��ִ��", "�󴲷�", 1, 200);
		MockRoom room2 = new MockRoom("304", "δִ��", "��׼��", 2, 300);
		
		RoomList roomList = new RoomList();
		
		RoomLineItem roomLineItem1 = new RoomLineItem(room1);
		RoomLineItem roomLineItem2 = new RoomLineItem(room2);
		
		roomList.addRoomLineItems(roomLineItem1);
		roomList.addRoomLineItems(roomLineItem2);
		
		Hotel hotel = new Hotel();
		
		hotel.addRoomList(roomList);
		
		assertEquals(2, hotel.getRoomInfo());
		
		
	}

}
