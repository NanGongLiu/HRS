package dataService;
import PO.*;
import dataService.DataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**����ʵ�־Ƶ����ݴ�������Ҫ�ķ���ӿ�
 * @author ��ΰ
 * @version 1.0
 * see presentation.Hotel
 */
public interface HotelDataService  extends DataService, Remote{
/**
 * ��id���в��ҷ�����Ӧ��HotelPO���
 * @param in MessageInput�ͣ���������ľƵ�id
 * @return ����ResultMessageö�ٵ�һ��
 * @see data.Hotel
 */
	public HotelPO find(String id) throws RemoteException;
/**
 * �����ƽ��в��ҷ�����Ӧ��HotelPO���
 * @param in MessageInput�ͣ���������ľƵ�����
 * @return ����ResultMessageö�ٵ�һ��
 * @see data.Hotel
 */
		public HotelPO findByName(String name) throws RemoteException;
/**
 * ����Ȧ���в��ҷ�����Ӧ��HotelPO���
 * @param in MessageInput�ͣ������������Ȧ����
 * @return ����ResultMessageö�ٵ�һ��
 * @see data.Hotel
 */
		public ArrayList<HotelPO> findByDistrict(String district) throws RemoteException;
/**
 * ���Ǽ����в��ҷ�����Ӧ��HotelPO���
 * @param in MessageInput�ͣ�����������Ǽ�
 * @return ����ResultMessageö�ٵ�һ��
 * @see data.Hotel
 */
		public ArrayList<HotelPO> findByStar(int star) throws RemoteException;
/**
 * �����ֽ��в��ҷ�����Ӧ��HotelPO���
 * @param in MessageInput�ͣ���������ľƵ�����
 * @return ����ResultMessageö�ٵ�һ��
 * @see data.Hotel
 */
		public ArrayList<HotelPO> findByScore(double sco) throws RemoteException;
/**
 * �����ݿ�������һ��po��¼
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Hotel
 */
		public void insert(HotelPO po) throws RemoteException;
/**
 * �����ݿ���ɾ��һ��po
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Hotel
 */
		public void delete(HotelPO po) throws RemoteException;
/**
 *�����ݿ��и���һ��po
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Hotel
 */
		public void update(HotelPO po) throws RemoteException;
/**
 * ����ʼ���־û����ݿ�
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Hotel
 */
		public void init() throws RemoteException;
/**
 * �����־û����ݿ��ʹ��
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Hotel
 */
		public void finish() throws RemoteException;
	}
