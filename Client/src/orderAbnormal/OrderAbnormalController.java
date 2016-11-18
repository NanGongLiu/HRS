package orderAbnormal;
import java.util.ArrayList;

import VO.OrderVO;
import common.Choice;
import common.ResultMessage;
import orderBLService.OrderBLService_realize;
public class OrderAbnormalController extends OrderBLService_realize{
	public OrderAbnormalController(int hotelId) {
		super(hotelId);
		// TODO Auto-generated constructor stub
	}
	/**
     * ����ѡ������Ͳ������ж���������ʾ
     * 
     * @param type String�ͣ�һ�ֶ���������
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> findByType(String type) {
		ArrayList<OrderVO> ov=new ArrayList<OrderVO>();
		return ov;
	}
    public ResultMessage getRoomInfo (OrderVO vo) {
		return ResultMessage.Exist;
	}
	
	
	/**
     * �رն�������
     * 
     * @see bussinesslogic.Order
     */
	public void cancel() {
	}
	/**
     * ����ѡ������Ͳ������ж���������ʾ
     * 
     * @param type String�ͣ�һ�ֶ���������
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public OrderVO showDetail(String orderID) {
		OrderVO ov=new OrderVO();
		return ov;
	}
public void done(String orderID,String userID) {
}
	
	
	/**
     * ���¶�������Ϊ�쳣��Ϊ�ͻ���ȥ����ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void abnormalOrder(String orderID,String userID) {
	}
	
	
	/**
     * ���¶�������Ϊ��ִ�У�Ϊ�ͻ��ָ�����ֵ�����»�Ա�ȼ�  
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void delayIn(String orderID,String userID) {
	}
	
	
	/**
     * ��������ִ�����񣬳־û������漰�������������� ϵͳ����
     * 
     * @see bussinesslogic.Order
     */
	public void endExecute() {
	}
    public OrderVO findByID(String ID) {
    	OrderVO vo=new OrderVO();
	    return vo;
    }
	
	
	/**
     * �ָ��ͻ�����ֵ�����»�Ա�ȼ�
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param choice Choice�ͣ�һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public void regain(OrderVO vo,Choice choice) {
	}
}
