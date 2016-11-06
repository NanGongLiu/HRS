package LineItem;

import Object.Hotel;

public class HotelLineItem {

	Hotel hotel;
	
	/**
	 * �����Ƶ�
	 * @param h Hotel�ͣ�����Ƶ����
	 * @return �����Ƶ�
	 */
	public HotelLineItem (Hotel h) {
		hotel = h;
	}
	
	/**
	 * �����Ƶ�
	 * @return �Ƶ���Ȧ
	 */
	public String location () {
		return hotel.gethotelDistrict();	
	}
	
	/**
	 * �����Ƶ�
	 * @return �Ƶ�����
	 */
	public String name () {
		return hotel.gethotelName();	
	}
	
}
