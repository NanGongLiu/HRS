package hotelInformationOverview;
import java.util.ArrayList;

import Object.Hotel;
import VO.HotelVO;
import VO.OrderVO;
import hotelBLService.HotelBLService_realize;
public class HotelInformationOverviewController extends HotelBLService_realize{
	/**
     * ��ʾ�Ƶ����ϸ��Ϣ
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ��ֵ����
     * @return boolean�ͣ���ʾ�ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
public boolean getroominfo(HotelVO vo) {
		return false;
	}


/**
 * ���۸�ӵ͵�����ʾ�Ƶ��б�
 * 
 * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
 * @return һ��HotelVOֵ����
 * @see bussinesslogic.Hotel
 */
public HotelVO pricesort(ArrayList<Hotel>  ah) {
	HotelVO hv=new HotelVO();
	return hv;
}


/**
 * ���Ǽ��ӵ͵�����ʾ�Ƶ��б�
 * 
 * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
 * @return һ��HotelVOֵ����
 * @see bussinesslogic.Hotel
 */
public HotelVO starsort(ArrayList<Hotel>  ah) {
	HotelVO hv=new HotelVO();
	return hv;
}


/**
 * �����ִӵ͵�����ʾ�Ƶ��б�
 * 
 * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
 * @return һ��HotelVOֵ����
 * @see bussinesslogic.Hotel
 */
public HotelVO scoresort(ArrayList<Hotel>  ah) {
	HotelVO hv=new HotelVO();
	return hv;
}
/**
 * ��ʾ�ͻ��ھƵ��ϸ���Լ���ʷ����
 * 
 * @param vo HotelVO�ͣ�һ���Ƶ�ֵ����
 * @return һ��OrderVOֵ����
 * @see bussinesslogic.Hotel
 */
public OrderVO gethistoryorder(HotelVO  vo) {
	OrderVO hv=new OrderVO();
	return hv;
}


}
