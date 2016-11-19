package TestRoom;

import static org.junit.Assert.*;

import org.junit.Test;

import LineItem.RoomLineItem;
import List.RoomList;
import Mock.MockRoom;
import Object.Room;
import common.ResultMessage;

public class MessageUpdateTester {

	@Test
	public void testMessageUpdate() {

		MockRoom room1 = new MockRoom("303", "��ִ��", "�󴲷�", 1, 200);
		MockRoom room2 = new MockRoom("304", "δִ��", "��׼��", 2, 300);
		
		RoomList roomList = new RoomList();
		
		RoomLineItem roomLineItem1 = new RoomLineItem(room1);
		RoomLineItem roomLineItem2 = new RoomLineItem(room2);
		
		roomList.addRoomLineItems(roomLineItem1);
		roomList.addRoomLineItems(roomLineItem2);
		
		Room room = new Room();
		room.addRoomList(roomList);
		
		assertEquals(ResultMessage.Exist , room.messageUpdate(roomLineItem1, "305", "�쳣", "���˼�", 3, 400));
	
	}

}
