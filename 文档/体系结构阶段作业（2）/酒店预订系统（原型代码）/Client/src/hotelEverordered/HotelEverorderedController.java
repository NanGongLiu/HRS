package hotelEverordered;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Object.Hotel;
import VO.HotelVO;
import VO.OrderVO;
import common.ResultMessage;
import common.UserType;
import hotelBLService.HotelBLService_realize;
public class HotelEverorderedController extends HotelBLService_realize{
	/**
     * �����û�����ʷ�����ľƵ겢������ʷ�Ƶ��б�
     * 
     * @param id String�ͣ��ͻ�id
     * @return ����HotelVO��һ���б�
     * @see bussinesslogic.Hotel
     */
	public  ArrayList<HotelVO> historylook(String  id) {
	    ArrayList<HotelVO> array=new  ArrayList<HotelVO>();
		return array;
	}
	/**
     * ��ʾ�ͻ�����ʷԤ���Ƶ�
     * 
     * @return һ��ArrayList<HotelVO>���Ƶ�ֵ�����б�
     * @see bussinesslogic.Hotel
     */
	public ArrayList<HotelVO> gethistoryhotel() {
		ArrayList<HotelVO> array=new  ArrayList<HotelVO>();
		return array;
	}
}

