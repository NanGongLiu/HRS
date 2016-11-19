package Object;

import LineItem.HotelLineItem;
import List.HotelList;
import List.OrderList;
import List.RoomList;
import VO.HotelVO;
import common.ResultMessage;
/**
 * �Ƶ�
 * @author ����٩
 * @version 1.0
 * @see
 */
public class Hotel {
    
    private HotelList hotelList;
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
   	 * ��÷����б�
   	 * @param rl RoomList�ͣ���Ӧ�ķ����б�
   	 * @return
   	 */
    public void addHotelList(HotelList hl) {
    	hotelList = hl;
    }
    /**
   	 * ��ӾƵ��ʺ�
   	 * @param h Hotel�ͣ�Ҫ��ӵľƵ�
   	 * @return ��ӽ��
   	 */
    public ResultMessage acountAdmin(HotelVO hvo) {
    	hotelList.addHotelLineItems(new HotelLineItem(hvo));
    	return ResultMessage.Exist;
    }
    /**
   	 * �õ��ͻ�����ʷԤ���Ƶ�
   	 * @return �Ƶ����
   	 */
    public int getHistoryHotel() {
    	return hotelList.getHotel();
    }
    /**
   	 * �õ��ͻ�����ʷԤ������
   	 * @return ��������
   	 */
    public int getHistoryOrder() {
    	return orderList.getOrder();
    }
    /**
   	 * �õ��ͻ��ķ�����Ϣ
   	 * @return �������
   	 */
    public int getRoomInfo() {
    	return roomList.getRoomInfo();
    }
    /**
   	 * ���ҷ��������ľƵ�
   	 * @param location String�ͣ��Ƶ���Ȧ
   	 * @return ���������ľƵ����
   	 */
    public int messageLook(String location) {
    	return hotelList.messageLook(location);
    }
    /**
   	 * ά���Ƶ���Ϣ
   	 * @param h Hotel�ͣ��Ƶ���µ�����
   	 * @return ���ĺ�Ľ��
   	 */
    public ResultMessage messageMaintain(Hotel h) {
    	return hotelList.messageMaintain(h);
    }
    /**
	 * �����Ƶ�
	 * @param name String�ͣ��Ƶ�����
	 * @return ���ؾƵ�����
	 */
    public int messageSearch(String name) {
    	return hotelList.messageSearch(name);
    }
    /**
	 * ���۸���Ƶ�����
	 * @return ����������
	 */
    public ResultMessage priceSort() {
    	return hotelList.priceSort();
    }
    /**
	 * �����ָ��Ƶ�����
	 * @return ����������
	 */
    public ResultMessage scoreSort() {
    	return hotelList.scoreSort();
    }
    /**
	 * ���Ǽ����Ƶ�����
	 * @return ����������
	 */
    public ResultMessage starSort() {
    	return hotelList.starSort();
    }
    /**
	 * ���Ƶ�����
	 * @param comment String�ͣ���������
	 * @return �������۽��
	 */
    public ResultMessage setComment(String comment) {
    	return hotelList.setComment(comment);
    }
    /**
	 * ���Ƶ�����
	 * @param score int�ͣ�����
	 * @return �������ֽ��
	 */
    public ResultMessage setScore(int score) {
    	return hotelList.setScore(score);
    }
    
    
    

}

