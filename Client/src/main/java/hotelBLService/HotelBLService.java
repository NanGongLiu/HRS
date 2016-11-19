package hotelBLService;
import java.util.ArrayList;

import VO.*;
import common.*;
import Object.*;

/**
 * ����ʵ�־Ƶ��������Ҫ�ķ���ӿ�
 * @author ������
 * @version 1.0
 * @see presentation.Hotel
 */

public interface HotelBLService {
    /**
     * ���ݵ�ַ����Ȧ��÷�Χ�ڵľƵ���Ϣ
     * 
     * @param hvo HotelVO�ͣ����洫������hotelֵ����
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage messagelook(HotelVO hvo);
	
	
	/**
     * ����������������ط��ϵľƵ��б�
     * 
     * @param in MessageInput�ͣ��������������
     * @return ����HotelVO��һ���б�
     * @see bussinesslogic.Hotel 
     */
	public ArrayList<HotelVO> messagesearch(MessageInput in);
	
	
	/**
     * �����û�����ʷ�����ľƵ겢������ʷ�Ƶ��б�
     * 
     * @param id String�ͣ��ͻ�id
     * @return ����HotelVO��һ���б�
     * @see bussinesslogic.Hotel
     */
	public  ArrayList<HotelVO> historylook(String  id);
	
	
	/**
     * ά���Ƶ�Ļ�����Ϣ�����¾Ƶ�����
     * 
     * @param in MessageInput�ͣ�����������޸���Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage messagemaintain(MessageInput  in);
	
	
	/**
     * ���ӾƵ��˺����Ʋ��Ҵ���һ���þƵ깤����Ա���˺�
     * 
     * @param in MessageInput�ͣ���������ľƵ������Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage accuntadmin(MessageInput  in);
	
	
	/**
     * ���ӸþƵ�����ּ�¼���������ֵľ�ֵ
     * 
     * @param socre int�ͣ��û��ԾƵ�����������
     * @return boolean�ͣ����³ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
	public boolean setscore(int  score);
	
	
	/**
     * ���ӸþƵ��µ����ۼ�¼
     * 
     * @param cooment String�ͣ��û��ԾƵ�����������
     * @return boolean�ͣ����³ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
	public boolean setcomment(String  comment);
	
	
	/**
     * ��ʾ�Ƶ����ϸ��Ϣ
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ��ֵ����
     * @return boolean�ͣ���ʾ�ɹ��򷵻�true�����򷵻�false
     * @see bussinesslogic.Hotel
     */
	public boolean getroominfo(HotelVO vo);
	
	
	/**
     * ���۸�ӵ͵�����ʾ�Ƶ��б�
     * 
     * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
     * @return һ��HotelVOֵ����
     * @see bussinesslogic.Hotel
     */
	public HotelVO pricesort(ArrayList<Hotel>  ah);
	
	
	/**
     * ���Ǽ��ӵ͵�����ʾ�Ƶ��б�
     * 
     * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
     * @return һ��HotelVOֵ����
     * @see bussinesslogic.Hotel
     */
	public HotelVO starsort(ArrayList<Hotel>  ah);
	
	
	/**
     * �����ִӵ͵�����ʾ�Ƶ��б�
     * 
     * @param ah ArrayList<Hotel>�ͣ�һ���Ƶ�ֵ������б�
     * @return һ��HotelVOֵ����
     * @see bussinesslogic.Hotel
     */
	public HotelVO scoresort(ArrayList<Hotel>  ah);
	
	
	/**
     * ��ʾ�ͻ��ھƵ��ϸ���Լ���ʷ����
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ�ֵ����
     * @return һ��OrderVOֵ����
     * @see bussinesslogic.Hotel
     */
	public OrderVO gethistoryorder(HotelVO  vo);
	
	
	/**
     * ��ʾ�ͻ�����ʷԤ���Ƶ�
     * 
     * @return һ��ArrayList<HotelVO>���Ƶ�ֵ�����б�
     * @see bussinesslogic.Hotel
     */
	public ArrayList<HotelVO> gethistoryhotel();
}
