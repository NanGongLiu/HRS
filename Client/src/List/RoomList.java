package List;

import java.util.*;

import LineItem.RoomLineItem;
import Object.Order;
import VO.OrderVO;
import VO.RoomVO;
/**
 * �����б�
 * @author ����٩
 * @version 1.0
 * @see
 */
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
	 * �õ�����۸�
	 * @param rvo RoomVO��
	 * @return ���ط���۸�
	 */
	public int getPrice(RoomVO rvo) {
		return 300;
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
		this.rooms.add(new RoomLineItem(new RoomVO(roomid, roomstatue, roomtype, rooms, roomprice)));
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
	public int getRoomInfo(OrderVO vo){
		return  0;
	}
}










