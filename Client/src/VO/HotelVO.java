package VO;
import Object.Hotel;

/**
 * �Ƶ�����Լ����ݴ��������
 * @author ����٩
 * @version 1.0
 * @see Object.Hotel
 */
public class HotelVO extends VO {

	public String hotelAddress;
	public String hotelDistrict;
	public int hotelStar;
	public String hotelProfile;
	public String hotelService;
	public String hotelName;
	public String hotelPhone;
	public String hotelReservation;
	public String hotelAccount;
	public double score;
	
	/**
     * ���¾Ƶ���Ϣ
     * 
     * @param hotel Hotel�ͣ�һ�������������ݵľƵ����
     * @return 
     * @see Object.Hotel
     */
	public void update(Hotel hotel) {
		
	}
	
	/**
     * �����Ƶ����
     * 
     * @return һ����¼��ľƵ�
     * @see Object.Hotel
     */
	public Hotel makeHotel() {
		
		return new Hotel();
	}
	
}

