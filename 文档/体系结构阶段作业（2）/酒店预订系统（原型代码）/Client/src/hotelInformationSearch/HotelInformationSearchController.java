package hotelInformationSearch;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Object.Hotel;
import VO.HotelVO;
import VO.OrderVO;
import common.MessageInput;
import common.ResultMessage;
import common.UserType;
import hotelBLService.HotelBLService_realize;
public class HotelInformationSearchController extends HotelBLService_realize{
	/**
     * ���ݵ�ַ����Ȧ��÷�Χ�ڵľƵ���Ϣ
     * 
     * @param hvo HotelVO�ͣ����洫������hotelֵ����
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage messagelook(HotelVO hvo) {
		return ResultMessage.Exist;
	}
	
	
	/**
     * ����������������ط��ϵľƵ��б�
     * 
     * @param in MessageInput�ͣ��������������
     * @return ����HotelVO��һ���б�
     * @see bussinesslogic.Hotel 
     */
	public ArrayList<HotelVO> messagesearch(MessageInput in) {
		ArrayList<HotelVO> array=new ArrayList<HotelVO>();
		return array;
	}
	
}
