package hotelBLService;

import java.util.ArrayList;

import Object.Hotel;
import Object.Order;
import VO.HotelVO;
import VO.OrderVO;
import common.MessageInput;
import common.ResultMessage;

public class HotelController implements HotelBLService {
	/**
     * ���ݵ�ַ����Ȧ��÷�Χ�ڵľƵ���Ϣ
     * 
     * @param hvo HotelVO�ͣ����洫������hotelֵ����
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage messagelook(HotelVO hvo){
		return ResultMessage.Exist;
	}
	
	
	/**
     * ����������������ط��ϵľƵ��б�
     * 
     * @param in MessageInput�ͣ��������������
     * @return ����HotelVO��һ���б�
     * @see bussinesslogic.Hotel 
     */
	public ArrayList<HotelVO> messagesearch(MessageInput in){
		return new ArrayList<HotelVO>();
	}
	
	
	/**
     * �����û�����ʷ�����ľƵ겢������ʷ�Ƶ��б�
     * 
     * @param id String�ͣ��ͻ�id
     * @return ����HotelVO��һ���б�
     * @see bussinesslogic.Hotel
     */
	public  ArrayList<HotelVO> historylook(String  id){
		return new ArrayList<HotelVO>();
	}
	
	
	/**
     * ά���Ƶ�Ļ�����Ϣ�����¾Ƶ�����
     * 
     * @param in MessageInput�ͣ�����������޸���Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage messagemaintain(MessageInput  in){
		return ResultMessage.Exist;
	}
	
	
	/**
     * ���ӾƵ��˺����Ʋ��Ҵ���һ���þƵ깤����Ա���˺�
     * 
     * @param in MessageInput�ͣ���������ľƵ������Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage accuntadmin(MessageInput  in){
		return ResultMessage.Exist;
	}
	
	
	/**
     * ���ӸþƵ�����ּ�¼���������ֵľ�ֵ
     * 
     * @param socre int�ͣ��û��ԾƵ�����������
     * @return boolean�ͣ����³ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
	public boolean setscore(int  score){
		return true;
	}
	
	/**
     * ���ӸþƵ��µ����ۼ�¼
     * 
     * @param cooment String�ͣ��û��ԾƵ�����������
     * @return boolean�ͣ����³ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
	public boolean setcomment(String  comment){
		return true;
	}
	
	
	/**
     * ��ʾ�Ƶ����ϸ��Ϣ
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ��ֵ����
     * @return boolean�ͣ���ʾ�ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
	public boolean getroominfo(HotelVO vo){
		return true;
	}
	
	
	/**
     * ���۸�ӵ͵�����ʾ�Ƶ��б�
     * 
     * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
     * @return һ��HotelVOֵ����
     * @see bussinesslogic.Hotel
     */
	public HotelVO pricesort(ArrayList<Hotel>  ah){
		return new HotelVO();
	}
	
	
	/**
     * ���Ǽ��ӵ͵�����ʾ�Ƶ��б�
     * 
     * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
     * @return һ��HotelVOֵ����
     * @see bussinesslogic.Hotel
     */
	public HotelVO starsort(ArrayList<Hotel>  ah){
		return new HotelVO();
	}
	
	
	/**
     * �����ִӵ͵�����ʾ�Ƶ��б�
     * 
     * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
     * @return һ��HotelVOֵ����
     * @see bussinesslogic.Hotel
     */
	public HotelVO scoresort(ArrayList<Hotel>  ah){
		return new HotelVO();
	}
	
	
	/**
     * ��ʾ�ͻ��ھƵ��ϸ���Լ���ʷ����
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ�ֵ����
     * @return һ��OrderVOֵ����
     * @see bussinesslogic.Hotel
     */
	public OrderVO gethistoryorder(HotelVO  vo){
		return new OrderVO();
	}
	
	
	/**
     * ��ʾ�ͻ�����ʷԤ���Ƶ�
     * 
     * @return һ��ArrayList<HotelVO>���Ƶ�ֵ�����б�
     * @see bussinesslogic.Hotel
     */
	public ArrayList<HotelVO> gethistoryhotel(){
		return new ArrayList<HotelVO>();
	}


}
