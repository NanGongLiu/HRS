package orderOverview;
import java.util.ArrayList;

import Object.Hotel;
import VO.HotelVO;
import VO.OrderVO;
import VO.UserVO;
import common.ResultMessage;
import orderBLService.OrderBLService_realize;
public class OrderOverviewController extends OrderBLService_realize{
	 /**
     * ��ʾ���ж�����Ϣ
     * 
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> show() {
		ArrayList<OrderVO> array=new ArrayList<OrderVO>();
		return array;
	}
	
	
	/**
     * ��ʾ�����й��ڷ������Ϣ
     * 
     * @param vo OrderVO�ͣ�һ��������ֵ����
     * @return ����ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage getRoomInfo (OrderVO vo) {
		return ResultMessage.Exist;
	}
	/**
     * ��ʾ�����й��ڷ������Ϣ
     * 
     * @param vo UserVO�ͣ�һ���ͻ���ֵ����
     * @return ArrayList<Hotel> ��һ���Ƶ���б�
     * @see bussinesslogic.Order
     */
	public ArrayList<Hotel> gethistory(UserVO vo) {
		ArrayList<Hotel> ht=new ArrayList<Hotel>();
		return ht;
	}
	/**
     * ��ʾѡ�еľƵ��������ʷ����
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ��ֵ����
     * @return ArrayList<Order> ��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> findByType(HotelVO vo) {
		ArrayList<OrderVO> ov=new ArrayList<OrderVO>();
		return ov;
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
	
	
	/**
     * ���ݶ����Ų��Ҷ������飬����ʾ
     * 
     * @param orderID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderVO showDetail(String orderID) {
		OrderVO ov=new OrderVO();
		return ov;
	}
	/**
     * ���������ID���Ҷ�������ʾ
     * 
     * @param ID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderVO findByID(String ID) {
		OrderVO ov=new OrderVO();
		return ov;
	}
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param userID String�ͣ��ͻ����
     * @return long�������ļ�ֵ
     * @see bussinesslogic.Order
     */
	public long getPrice(OrderVO vo,String userID) {
		return 200;
	}
	
	
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @return ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage payment(OrderVO vo) {
		return ResultMessage.Exist;
	}
}
