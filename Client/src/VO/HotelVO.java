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
	public HotelVO(){};
	public HotelVO(String id){
		hotelName=id;
	}
	/**
	 * �Ƶ�����
	 * @param hAddress String�ͣ��߼��㴫���ľƵ��ַ
	 * @param hDistrict String�ͣ��߼��㴫���ľƵ�������Ȧ
	 * @param hStar int�ͣ��߼��㴫���ľƵ��Ǽ�
	 * @param hProfile String�ͣ��߼��㴫���ľƵ���
	 * @param hService String�ͣ��߼��㴫���ľƵ����
	 * @param hName String�ͣ��߼��ഫ���ľƵ�����
	 * @param hPhone String�ͣ��߼��ഫ���ľƵ�
	 * @param hReservation String�ͣ��߼��ഫ���ľƵ�Ԥ��״̬
	 * @param hAccount String�ͣ��߼��ഫ���ľƵ��˺�
	 * @param sco double�ͣ��߼��ഫ���ľƵ�����
	 * @return
	 * @throws
	 * @see
	 */
	public HotelVO (String hAddress,String hDistrict,int hStar,String hProfile,String hService,String hName,String hPhone,String hReservation,String hAccount,double sco) {
		
		hotelAddress=hAddress;
		hotelDistrict=hDistrict;
		hotelStar=hStar;
		hotelProfile=hProfile;
		hotelService=hService;
		hotelName=hName;
		hotelPhone=hPhone;
		hotelReservation=hReservation;
		hotelAccount=hAccount;
	    score=sco;
	}
	/**
     * ���¾Ƶ���Ϣ
     * 
     * @param hotel Hotel�ͣ�һ�������������ݵľƵ����
     * @return 
     * @see Object.Hotel
     */
	public void update(HotelVO hotel) {
		
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

