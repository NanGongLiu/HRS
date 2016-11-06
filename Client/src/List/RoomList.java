package List;

import java.util.*;

import LineItem.RoomLineItem;
import Object.Order;
import Object.Room;

public class RoomList {

	List<RoomLineItem> rooms;
	
	/**
	 * �����б�
	 * @param
	 * @return
	 */
	public RoomList () {
		
		rooms = new ArrayList<RoomLineItem>();
		
	}
	
	/**
	 * ��ӵ�������
	 * @param rli RoomLineItem�ͣ���ӵĵ������� 
	 * @return 
	 */
	public void addRoomLineItems(RoomLineItem  rli) {
		rooms.add(rli);
	}
	
	/**
	 * �õ������б�����
	 * @param
	 * @return ���ط����б�����
	 */
	public int getRoom() {
		return rooms.size();
	}
	
	/**
	 * ���·�����Ϣ
	 * @param roomid String�ͣ������
	 * @param roomstatue String�ͣ�����״̬
	 * @param roomtype String�ͣ���������
	 * @param rooms int�ͣ���������
	 * @param roomprice int�ͣ�����۸�
	 * @return
	 */
	public void messageUpdate(String roomid, String roomstatue, String roomtype, int rooms, int roomprice) {
		this.rooms.add(new RoomLineItem(new Room(roomid, roomstatue, roomtype, rooms, roomprice)));
	}

	/**
	 * �õ������б�����
	 * @param
	 * @return ���ط����б�����
	 */
	public int getRoomInfo() {
		return rooms.size();
	}
	/**
	 * �õ������б�����
	 * @param
	 * @return ���ط����б�����
	 */
	public int getRoomInfo(Order vo){
		return  0;
	}
}










