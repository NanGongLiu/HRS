package List;

import java.util.*;

import LineItem.HotelLineItem;
import Object.Hotel;
import common.ResultMessage;

public class HotelList {

	List<HotelLineItem> hotels;
	
	/**
	 * �Ƶ��б�
	 * @param
	 * @return
	 */
	public HotelList () {
		
		hotels = new ArrayList<HotelLineItem>();
		
	}
	
	/**
	 * ��ӵ����Ƶ�
	 * @param hli HotelLineItem�ͣ���ӵĵ����Ƶ� 
	 * @return 
	 */
	public void addHotelLineItems(HotelLineItem  hli) {
		hotels.add(hli);
	}
	
	/**
	 * �õ��Ƶ�
	 * @param
	 * @return ���ؾƵ�
	 */
	public int getHotel() {
		return hotels.size();
	}
	
	/**
	 * �õ����������ľƵ�
	 * @param
	 * @return ���ؾƵ����
	 */
	public int messageLook(String location) {
		int num = 0;
		for(int i=0;i<hotels.size();i++) {
			if(hotels.get(i).location().equals(location)) {
				num++;
			}
		}
		return num;
	}

	/**
	 * ά���Ƶ���Ϣ
	 * @param h Hotel�ͣ��µľƵ�����
	 * @return ���ؾƵ���½��
	 */
	public ResultMessage messageMaintain(Hotel h) {
		return ResultMessage.Exist;
	}
	
	/**
	 * �����Ƶ�
	 * @param name String�ͣ��Ƶ�����
	 * @return ���ؾƵ�����
	 */
	public int messageSearch(String name) {
		int num = 0;
		for(int i=0;i<hotels.size();i++) {
			if(hotels.get(i).name().contains(name)) {
				num++;
			}
		}
		return num;
	}

	/**
	 * ���۸���Ƶ�����
	 * @return ����������
	 */
	public ResultMessage priceSort() {
		return ResultMessage.Exist;
	}
	
	/**
	 * �����ָ��Ƶ�����
	 * @return ����������
	 */
	public ResultMessage scoreSort() {
		return ResultMessage.Exist;
	}
	
	/**
	 * ���Ǽ����Ƶ�����
	 * @return ����������
	 */
	public ResultMessage starSort() {
		return ResultMessage.Exist;
	}

	/**
	 * ���Ƶ�����
	 * @param comment String�ͣ���������
	 * @return �������۽��
	 */
	public ResultMessage setComment(String comment) {
		return ResultMessage.Exist;
	}
	
	/**
	 * ���Ƶ�����
	 * @param score int�ͣ�����
	 * @return �������ֽ��
	 */
	public ResultMessage setScore(int score) {
		return ResultMessage.Exist;
	}
	
}
