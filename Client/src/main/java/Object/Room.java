package Object;

import LineItem.RoomLineItem;
import List.OrderList;
import List.RoomList;
import VO.RoomVO;
import common.ResultMessage;

/**
 * ����
 * @author ����٩
 * @version 1.0
 * @see
 */
public class Room {
    
    private RoomList roomList;
    private OrderList orderList;
    /**
   	 * ��÷����б�
   	 * @param rl RoomList�ͣ���Ӧ�ķ����б�
   	 * @return
   	 */
    public void addRoomList(RoomList rl) {
    	roomList = rl;
    }
    /**
   	 * ��ö����б�
   	 * @param ol OrderList�ͣ���Ӧ�Ķ����б�
   	 * @return
   	 */
    public void addOrderList(OrderList ol) {
    	orderList = ol;
    }
    /**
	 * ��ȡ����۸�
	 * @param rvo RoomVo��
	 * @return ���ط���۸�
	 * @throws
	 * @see
	 */
    public int getPrice(RoomVO rvo) {
    	return roomList.getPrice(rvo);
    }
    /**
   	 * ��÷����б�
   	 * @param
   	 * @return ��Ӧ�ķ����б�
   	 */
    public int getRoom() {
    	return roomList.getRoom();
    }
    /**
	 * ��ӷ���
	 * @param roomid String�ͣ������
	 * @param roomstatue String�ͣ�����״̬
	 * @param roomtype String�ͣ���������
	 * @param rooms int�ͣ���������
	 * @param roomprice int�ͣ�����۸�
	 * @return
	 * @throws
	 * @see
	 */
    public int messageAdd(String roomid, String roomstatue, String roomtype, int rooms, int roomprice) {
    	roomList.addRoomLineItems(new RoomLineItem(new RoomVO(roomid, roomstatue, roomtype, rooms, roomprice)));
    	return roomList.getRoom();
    }
    /**
	 * ���·���
	 * @param roomid String�ͣ������
	 * @param roomstatue String�ͣ�����״̬
	 * @param roomtype String�ͣ���������
	 * @param rooms int�ͣ���������
	 * @param roomprice int�ͣ�����۸�
	 * @return
	 * @throws
	 * @see
	 */
    public ResultMessage messageUpdate(RoomLineItem rli,String roomid, String roomstatue, String roomtype, int rooms, int roomprice) {
    	roomList.messageUpdate(roomid, roomstatue, roomtype, rooms, roomprice);
    	return ResultMessage.Exist;
    }
    /**
	 * ��ȡ������Ϣ
	 * @param
	 * @return ���ض�����Ϣ
	 * @throws
	 * @see
	 */
    public int getOrderInfo() {
    	
    	return orderList.getOrderInfo();
    }

}
