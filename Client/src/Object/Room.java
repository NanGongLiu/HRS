package Object;

import java.io.Serializable;
import java.util.List;

import LineItem.RoomLineItem;
import List.OrderList;
import List.RoomList;
import common.ResultMessage;

/**
 * ���������ʵ��
 * @author LZ
 * @version 1.0
 * @see
 */
public class Room implements Serializable{
	private static final long serialVersionUID = 1L;
	private String roomId;
    private String roomStatue;
    private String roomType;
    private int roomS;
    private int roomPrice;
    /**
	 * ���췿�������ʵ��
	 * @param roomid String�ͣ����ݲ㴫���ķ����
	 * @param roomstatue String�ͣ����ݲ㴫���ķ���״̬
	 * @param roomtype String�ͣ����ݲ㴫���ķ�������
	 * @param rooms int�ͣ����ݲ㴫���ķ�������
	 * @param roomprice int�ͣ����ݲ㴫���ķ���۸�
	 * @return
	 * @throws
	 * @see
	 */
    public Room (String roomid,String roomstatue,String roomtype,int rooms,int roomprice){
	    roomId=roomid;
	    roomStatue=roomstatue;
	    roomType=roomtype;
	    roomS=rooms;
	    roomPrice=roomprice;
    }
    /**
	 * ���췿�������ʵ��
	 * @return
	 */
    public Room (){
	    
    }
    /**
	 * ��ȡ�����
	 * @param
	 * @return ���ط����
	 * @throws
	 * @see
	 */
    public String getroomId() {
    	return roomId;
    } 
    /**
	 * ���÷����
	 * @param id String�ͣ��߼��㴫���ķ����
	 * @return
	 * @throws
	 * @see
	 */
    public void setroomId (String id){
    	roomId=id;
    }
    /**
	 * ��ȡ����״̬
	 * @param
	 * @return ���ط���״̬
	 * @throws
	 * @see
	 */
    public String getroomStatue() {
    	return roomStatue;
    }
    /**
	 * ���÷���״̬
	 * @param sta String�ͣ��߼��㴫���ķ���״̬
	 * @return
	 * @throws
	 * @see
	 */
    public void setroomStatue (String sta){
    	roomStatue=sta;
    }
    /**
	 * ��ȡ��������
	 * @param
	 * @return ���ط�������
	 * @throws
	 * @see
	 */
    public String getroomType() {
    	return roomType;
    }
    /**
	 * ���÷�������
	 * @param type String�ͣ��߼��㴫���ķ�������
	 * @return 
	 * @throws
	 * @see
	 */
    public void setroomType (String type){
		roomType=type;
	}
    /**
	 * ��ȡ��������
	 * @param
	 * @return ���ط�������
	 * @throws
	 * @see
	 */
    public int getroomS() {
		return roomS;
	}
    /**
	 * ���÷�������
	 * @param room int�ͣ��߼��㴫���ķ�������
	 * @return
	 * @throws
	 * @see
	 */
    public void setroomS (int room){
		roomS=room;
	}
    /**
	 * ��ȡ����۸�
	 * @param
	 * @return ���ط���۸�
	 * @throws
	 * @see
	 */
    public int getroomPrice() {
		return roomPrice;
	}
    /**
	 * ���÷���۸�
	 * @param price int�ͣ��߼��㴫���ķ���۸�
	 * @return
	 * @throws
	 * @see
	 */
    public void setroomPrice (int price){
		roomPrice=price;
	}
    
    
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
	 * @param
	 * @return ���ط���۸�
	 * @throws
	 * @see
	 */
    public int getPrice() {
    	return roomPrice;
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
    	roomList.addRoomLineItems(new RoomLineItem(new Room(roomid, roomstatue, roomtype, rooms, roomprice)));
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
