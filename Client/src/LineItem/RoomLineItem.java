package LineItem;

import VO.RoomVO;
/**
 * ��������
 * @author ����٩
 * @version 1.0
 */
public class RoomLineItem {

	RoomVO roomVO;
	
	/**
	 * ��������
	 * @param r Room�ͣ����뷿�����
	 * @return ��������
	 */
	public RoomLineItem (RoomVO rvo) {
		roomVO = rvo;
	}
	
	/**
	 * �õ�����۸�
	 * @param 
	 * @return ���ط���۸�
	 */
	public int getPrice() {
		return roomVO.roomPrice;
	}
	
}
