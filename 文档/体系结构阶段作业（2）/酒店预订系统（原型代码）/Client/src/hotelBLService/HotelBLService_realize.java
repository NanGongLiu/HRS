package hotelBLService;

import java.util.ArrayList;

import Object.Hotel;
import VO.HotelVO;
import VO.OrderVO;
import common.MessageInput;
import common.ResultMessage;

public class HotelBLService_realize implements HotelBLService{
	/**
     * ���ݵ�ַ����Ȧ��÷�Χ�ڵľƵ���Ϣ
     * 
     * @param hvo HotelVO�ͣ����洫������hotelֵ����
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage messagelook(HotelVO hvo) {
		return null;
	}
	
	
	/**
     * ����������������ط��ϵľƵ��б�
     * 
     * @param in MessageInput�ͣ��������������
     * @return ����HotelVO��һ���б�
     * @see bussinesslogic.Hotel 
     */
	public ArrayList<HotelVO> messagesearch(MessageInput in) {
		return null;
	}
	
	
	/**
     * �����û�����ʷ�����ľƵ겢������ʷ�Ƶ��б�
     * 
     * @param id String�ͣ��ͻ�id
     * @return ����HotelVO��һ���б�
     * @see bussinesslogic.Hotel
     */
	public  ArrayList<HotelVO> historylook(String  id) {
		return null;
	}
	
	
	/**
     * ά���Ƶ�Ļ�����Ϣ�����¾Ƶ�����
     * 
     * @param in MessageInput�ͣ�����������޸���Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage messagemaintain(MessageInput  in) {
		return null;
	}
	
	
	/**
     * ���ӾƵ��˺����Ʋ��Ҵ���һ���þƵ깤����Ա���˺�
     * 
     * @param in MessageInput�ͣ���������ľƵ������Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage accuntadmin(MessageInput  in){
		return null;
	}
	
	
	/**
     * ���ӸþƵ�����ּ�¼���������ֵľ�ֵ
     * 
     * @param socre int�ͣ��û��ԾƵ�����������
     * @return boolean�ͣ����³ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
	public boolean setscore(int  score){
		return (Boolean) null;
	}
	
	
	/**
     * ���ӸþƵ��µ����ۼ�¼
     * 
     * @param cooment String�ͣ��û��ԾƵ�����������
     * @return boolean�ͣ����³ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
	public boolean setcomment(String  comment){
		return (Boolean) null;
	}
	
	
	/**
     * ��ʾ�Ƶ����ϸ��Ϣ
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ��ֵ����
     * @return boolean�ͣ���ʾ�ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
	public boolean getroominfo(HotelVO vo){
		return (Boolean) null;
	}
	
	
	/**
     * ���۸�ӵ͵�����ʾ�Ƶ��б�
     * 
     * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
     * @return һ��HotelVOֵ����
     * @see bussinesslogic.Hotel
     */
	public HotelVO pricesort(ArrayList<Hotel>  ah) {
		return null;
	}
	
	
	/**
     * ���Ǽ��ӵ͵�����ʾ�Ƶ��б�
     * 
     * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
     * @return һ��HotelVOֵ����
     * @see bussinesslogic.Hotel
     */
	public HotelVO starsort(ArrayList<Hotel>  ah) {
		return null;
	}
	
	
	/**
     * �����ִӵ͵�����ʾ�Ƶ��б�
     * 
     * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
     * @return һ��HotelVOֵ����
     * @see bussinesslogic.Hotel
     */
	public HotelVO scoresort(ArrayList<Hotel>  ah) {
		return null;
	}
	
	
	/**
     * ��ʾ�ͻ��ھƵ��ϸ���Լ���ʷ����
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ�ֵ����
     * @return һ��OrderVOֵ����
     * @see bussinesslogic.Hotel
     */
	public OrderVO gethistoryorder(HotelVO  vo) {
		return null;
	}
	
	
	/**
     * ��ʾ�ͻ�����ʷԤ���Ƶ�
     * 
     * @return һ��ArrayList<HotelVO>���Ƶ�ֵ�����б�
     * @see bussinesslogic.Hotel
     */
	public ArrayList<HotelVO> gethistoryhotel() {
		return null;
	}
}
