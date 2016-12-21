package dataService;
/**
 * ְ���Ƕ����ṩ���ݽӿڵĽӿ�
 * @author LZ
 * @version 1.0
 * @see
 */
public interface DataFactoryService {
	/**
	 * �����ṩ�ͻ����ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getUserData();
	/**
	 * �����ṩ���ü�¼���ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getCreditRecordData();
	/**
	 * �����ṩ�����������ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getPromotionData();
	/**
	 * �����ṩ�������ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getOrderData();
	/**
	 * �����ṩ�Ƶ����ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getHotelData();
	/**
	 * �����ṩ�������ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getRoomData();
}
