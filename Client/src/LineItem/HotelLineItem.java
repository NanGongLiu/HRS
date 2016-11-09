package LineItem;

import VO.HotelVO;
/**
 * H�����Ƶ�
 * @author ����٩
 * @version 1.0
 */
public class HotelLineItem {

	HotelVO hotelVO;
	
	/**
	 * �����Ƶ�
	 * @param h Hotel�ͣ�����Ƶ����
	 * @return �����Ƶ�
	 */
	public HotelLineItem (HotelVO hvo) {
		hotelVO = hvo;
	}
	
	/**
	 * �����Ƶ�
	 * @return �Ƶ���Ȧ
	 */
	public String location () {
		return hotelVO.hotelDistrict;	
	}
	
	/**
	 * �����Ƶ�
	 * @return �Ƶ�����
	 */
	public String name () {
		return hotelVO.hotelName;	
	}
	
}
