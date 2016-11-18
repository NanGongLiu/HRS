package orderBLService;
import java.util.*;
import VO.*;
import common.*;
import Object.*;

/**
 * ����ʵ�ֶ�����������Ҫ�ķ���ӿ�
 * @author ������
 * @version 1.0
 * @see presentation.Order
 */

public interface OrderBLService {
    /**
     * ��ʾ���ж�����Ϣ
     * 
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> show(int hotelId);
	
	
	/**
     * ��ʾ�����й��ڷ������Ϣ
     * 
     * @param vo OrderVO�ͣ�һ��������ֵ����
     * @return ����ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage getRoomInfo(OrderVO vo);
	
	/**
     * ��ʾ�����й��ڷ������Ϣ
     * 
     * @param vo UserVO�ͣ�һ���ͻ���ֵ����
     * @return ArrayList<Hotel> ��һ���Ƶ���б�
     * @see bussinesslogic.Order
     */
	public ArrayList<Hotel> gethistory(UserVO vo);
	
	
	/**
     * ��ʾѡ�еľƵ��������ʷ����
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ��ֵ����
     * @return ArrayList<Order> ��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> findByType(HotelVO vo);
	
	
	/**
     * ����ѡ������Ͳ������ж���������ʾ
     * 
     * @param type String�ͣ�һ�ֶ���������
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> findByType(String type);
	
	
	/**
     * ���ݶ����Ų��Ҷ������飬����ʾ
     * 
     * @param orderID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderVO showDetail(String orderID);
	
	
	/**
     * ��һ���������ͱ�Ϊ�ѳ����������泷��ʱ��
     * 
     * @param orderID String�ͣ�������
     * @param currentTime Time�ͣ���ǰʱ��
     * @see bussinesslogic.Order
     */
	public void cancelOrder(String orderID,Time currentTime);
	
	
	/**
     * ���г��������Ĳ���
     * 
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void duduct(OrderVO order);
	
	
	/**
     * �ж϶����Ƿ��ѱ�����
     * 
     * @param orderID String�ͣ��ͻ����
     * @param currentTime Time�ͣ�����������ʱ��
     * @return ���ѳ����򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public Boolean whetherDeduct(Time currentTime,String orderID);
	
	
	/**
     * ����һ����������
     * 
     * @param currentTime Time�ͣ���ǰʱ��
     * @param in Time�ͣ���סʱ��
     * @param out Time�ͣ��뿪ʱ��
     * @param ddl Time�ͣ�Ԥ���뿪ʱ��
     * @param roomType RoomType�ͣ���������
     * @param num int�ͣ������
     * @param numOfPerson int�ͣ�ס������
     * @param hasChild Boolean�ͣ��Ƿ���С��
     * @see bussinesslogic.Order
     */
	public void makeOrder(Time currentTime,
			Time in,Time out,Time ddl,
			RoomType roomType,int num,
			int numOfPerson,
			boolean haveChild ) ;
	
	
	
	/**
     * �ж϶����Ƿ�����
     * 
     * @param userID String�ͣ��ͻ����
     * @return ���������򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public boolean whetherMake(String uerID);
	
	
	
	/**
     * ���Ķ���״̬Ϊ��ִ�У�Ϊ�ͻ���������ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void done(String orderID,String userID);
	
	
	/**
     * ���¶�������Ϊ�쳣��Ϊ�ͻ���ȥ����ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void abnormalOrder(String orderID,String userID);
	
	
	/**
     * ���¶�������Ϊ��ִ�У�Ϊ�ͻ��ָ�����ֵ�����»�Ա�ȼ�  
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void delayIn(String orderID,String userID);
	
	
	/**
     * ��������ִ�����񣬳־û������漰�������������� ϵͳ����
     * 
     * @see bussinesslogic.Order
     */
	public void endExecute() ;
	
	
	/**
     * ���¶�����Ϣ����ʾ����
     * 
     * @param comment String�ͣ��ͻ�����
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void comment(String comment,OrderVO order);
	
	
	/**
     * ���������ID���Ҷ�������ʾ
     * 
     * @param ID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderVO findByID(String ID);
	
	
	/**
     * �ָ��ͻ�����ֵ�����»�Ա�ȼ�
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param choice Choice�ͣ�һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public void regain(OrderVO vo,Choice choice);
	
	
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param userID String�ͣ��ͻ����
     * @return long�������ļ�ֵ
     * @see bussinesslogic.Order
     */
	public long getPrice(OrderVO vo,String userID);
	
	
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @return ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage payment(OrderVO vo);


	public List<OrderVO> getUnfinishedOrders(int hotelId);


	public List<OrderVO> getFinishedOrders(int hotelId);


	public List<OrderVO> getAbnormalOrders(int hotelId);
}
