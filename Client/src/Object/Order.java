package Object;

import java.util.List;

import LineItem.CreditRecordLineItem;
import LineItem.HotelLineItem;
import LineItem.OrderLineItem;
import LineItem.RoomLineItem;
import LineItem.UserLineItem;
import List.HotelList;
import List.OrderList;
import List.RoomList;
import List.UserList;

import java.util.Date;
import VO.HotelVO;
import VO.OrderVO;
import VO.UserVO;
import common.Choice;
import common.ResultMessage;
/**
 * Order
 * @author ������
 * @version 1.0
 * @see
 */
public class Order {
	private static final long serialVersionUID = 1L;
	private String orderNumber;
	private int orderState;
	private int orderValue;
	private int numOfPerson;
	private boolean child;
	private String roomType;
	private int roomNumber;
	private Date expectedCheckIn;
	private Date expectedCheckOut;
	private Date latest;
	private Date cancel;
	private String comment;
	private int score;	
	private String userID;
	/**
	 * ���충������ʵ��
	 * @param oNum String�ͣ��߼��㴫���Ķ������
	 * @param state int�ͣ��߼��㴫���Ķ���״̬
	 * @param value int�ͣ��߼��㴫���Ķ�����ֵ
	 * @param pnum int�ͣ��߼��㴫��������
	 * @param ch boolean�ͣ��߼��㴫�������޶�ͯ
	 * @param rType String�ͣ��߼��㴫���ķ�������
	 * @param rNum int�ͣ��߼��㴫���Ķ�������
	 * @param in Date�ͣ��߼��㴫����Ԥ����סʱ��
	 * @param out Date�ͣ��߼��㴫����Ԥ���뿪ʱ��
	 * @param la Date�ͣ��߼��㴫��������ִ��ʱ��
	 * @param comm String�ͣ��߼��㴫���Ķ�������
	 * @param sco int�ͣ��߼��㴫���Ķ�������
	 * @param cancel Date�ͣ��߼��㴫���ĳ���ʱ��
	 * @return
	 * @throws
	 * @see
	 */
	public Order (String oNum, int state, int value, int pnum,boolean ch,String rType, int rNum, Date in, Date out,Date la, String comm, int sco,Date cancel) {
		
		orderNumber = oNum;
		orderState = state;
		orderValue = value;
		numOfPerson=pnum;
		child=ch;
		roomType = rType;
		roomNumber = rNum;
		expectedCheckIn = in;
		expectedCheckOut = out;
		latest=la;
		comment = comm;
		score = sco;
        this.cancel=cancel;
	}
	public Order(){}
	/**
	 * ��ȡ����ʱ��
	 * @param
	 * @return ����ʱ��
	 * @throws
	 * @see
	 */
	public Date getcancel() {
		return cancel;
	}
	/**
	 * ��ȡ�������
	 * @param
	 * @return ���ض������
	 * @throws
	 * @see
	 */
	public void setcancel(Date t) {
		cancel=t;
	}
	/**
	 * ��ȡ�������
	 * @param
	 * @return ���ض������
	 * @throws
	 * @see
	 */
	public String getOrderNumber() {
		return orderNumber;
	}
	/**
	 * ��ȡ����״̬
	 * @param
	 * @return ���ض���״̬
	 * @throws
	 * @see
	 */
	public int getOrderState() {
		return orderState;
	}
	/**
	 * ��ȡ������ֵ
	 * @param
	 * @return ���ض�����ֵ
	 * @throws
	 * @see
	 */
	public int getOrderValue() {
		return orderValue;
	}
	/**
	 * ��ȡ����
	 * @param
	 * @return ��������
	 * @throws
	 * @see
	 */
	public int getNumOfPerson(){
		return numOfPerson;
	}
	/**
	 * ��ȡ���޶�ͯ
	 * @param
	 * @return �������޶�ͯ
	 * @throws
	 * @see
	 */
	public boolean getChild(){
		return child;
	}
	/**
	 * ��ȡ��������
	 * @param
	 * @return ���ط�������
	 * @throws
	 * @see
	 */
	public String getRoomType() {
		return roomType;
	}
	/**
	 * ��ȡ��������
	 * @param
	 * @return ���ض�������
	 * @throws
	 * @see
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	/**
	 * ��ȡԤ����סʱ��
	 * @param
	 * @return ����Ԥ����סʱ��
	 * @throws
	 * @see
	 */
	public Date getExpectedCheckIn() {
		return expectedCheckIn;
	}
	/**
	 * ��ȡԤ���뿪ʱ��
	 * @param
	 * @return ����Ԥ���뿪ʱ��
	 * @throws
	 * @see
	 */
	public Date getExpectedCheckOut() {
		return expectedCheckOut;
	}
	/**
	 * ��ȡ����ִ��ʱ��
	 * @param
	 * @return ��������ִ��ʱ��
	 * @throws
	 * @see
	 */
	public Date getLatest(){
		return latest;
	}
	/**
	 * ��ȡ��������
	 * @param
	 * @return ���ض�������
	 * @throws
	 * @see
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * ��ȡ��������
	 * @param
	 * @return ���ض�������
	 * @throws
	 * @see
	 */
	public int getScore() {
		return score;
	}
	/**
	 * ���ö������
	 * @param oNum String�ͣ��߼��㴫���Ķ������
	 * @return
	 * @throws
	 * @see
	 */
	public void setOrderNumber(String oNum) {
		orderNumber = oNum;

	}
	/**
	 * ���ö���״̬
	 * @param state int�ͣ��߼��㴫���Ķ���״̬
	 * @return
	 * @throws
	 * @see
	 */
	public void setOrderState(int state) {
		orderState = state;
	}

	/**
	 * ���ö�����ֵ
	 * @param value int�ͣ��߼��㴫���Ķ�����ֵ
	 * @return
	 * @throws
	 * @see
	 */
	public void setOrderValue(int value) {
		orderValue = value;
	}
	/**
	 * ��������
	 * @param pnum int�ͣ��߼��㴫��������
	 * @return
	 * @throws
	 * @see
	 */
	public void setNumOfPerson(int num){
		numOfPerson=num;
	}
	/**
	 * �������޶�ͯ
	 * @param ch boolean�ͣ��߼��㴫�������޶�ͯ
	 * @return
	 * @throws
	 * @see
	 */
	public void setChild(boolean ch){
		child=ch;
	}
	/**
	 * ���÷�������
	 * @param rType String�ͣ��߼��㴫���ķ�������
	 * @return
	 * @throws
	 * @see
	 */
	public void setRoomType(String rType) {
		roomType = rType;
	}
	/**
	 * ���ö�������
	 * @param rNum int�ͣ��߼��㴫���Ķ�������
	 * @return
	 * @throws
	 * @see
	 */
	public void setRoomNumber(int rNum) {
		roomNumber = rNum;
	}
	/**
	 * ����Ԥ����סʱ��
	 * @param in Time�ͣ��߼��㴫����Ԥ����סʱ��
	 * @return
	 * @throws
	 * @see
	 */
	public void setExpectedCheckIn(Date in) {
		expectedCheckIn = in;
	}
	/**
	 * ��������ִ��ʱ��
	 * @param la Time�ͣ��߼��㴫��������ִ��ʱ��
	 * @return
	 * @throws
	 * @see
	 */
	public void setLatest(Date la){
		latest=la;
	}
	/**
	 * ����Ԥ����סʱ��
	 * @param out Time�ͣ��߼��㴫����Ԥ���뿪ʱ��
	 * @return
	 * @throws
	 * @see
	 */
	public void setExpectedCheckOut(Date out) {
		expectedCheckOut = out;
	}
	/**
	 * ���ö�������
	 * @param comm String�ͣ��߼��㴫���Ķ�������
	 * @return
	 * @throws
	 * @see
	 */
	public void setComment(String comm) {
		comment = comm;
	}
	/**
	 * ���ö�������
	 * @param sco int�ͣ��߼��㴫���Ķ�������
	 * @return
	 * @throws
	 * @see
	 */
	public void setScore(int sco) {
		score = sco;
	}
	OrderLineItem orderitem;
	CreditRecordLineItem credititem;
	UserLineItem useritem;
	RoomLineItem roomitem;
	OrderList orderlist;
	RoomList roomlist;
	UserList userlist;
	HotelList hotellist;
	HotelLineItem hotelitem;
	User user;
	public void addorderlist(OrderList list){
		orderlist=list;
	}
	public void addorderuser(UserLineItem use){
		useritem=use;
	}
	public void addordcredit(CreditRecordLineItem use){
		credititem=use;
	}
	/**
     * ��ʾ���ж�����Ϣ
     * 
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */

	public List<OrderLineItem> show(){
		return  orderlist.show();
	}
	
	
	/**
     * ��ʾ�����й��ڷ������Ϣ
     * 
     * @param vo OrderVO�ͣ�һ��������ֵ����
     * @return ����ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage getRoomInfo(Order vo){
		return ResultMessage.Exist;
	}
	
	/**
     * ��ʾ�û���������ʷ����
     * 
     * @param vo UserVO�ͣ�һ���ͻ���ֵ����
     * @return ArrayList<Hotel> ��һ���������б�
     * @see bussinesslogic.Order
     */
	public List<OrderLineItem> gethistory(UserVO vo){
		return  orderlist.gethistory(vo);
	}
	
	
	/**
     * ��ʾѡ�еľƵ��������ʷ����
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ��ֵ����
     * @return ArrayList<Order> ��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public List<OrderLineItem> findByType(HotelVO vo){
		return orderlist.gethotel(vo);
	}
	
	
	/**
     * ����ѡ������Ͳ������ж���������ʾ
     * 
     * @param type String�ͣ�һ�ֶ���������
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public List<OrderLineItem> findByType(String type){
		return orderlist.find(type);
	}
	
	
	/**
     * ���ݶ����Ų��Ҷ������飬����ʾ
     * 
     * @param orderID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderLineItem showDetail(String orderID){
		return orderlist.showdetail(orderID);
	}
	
	
	/**
     * ��һ���������ͱ�Ϊ�ѳ����������泷��ʱ��
     * 
     * @param orderID String�ͣ�������
     * @param currentTime Time�ͣ���ǰʱ��
     * @see bussinesslogic.Order
     */
	public void cancelOrder(String orderID,Date currentTime){
		orderlist.cancel(orderID,currentTime);
	}
	
	
	/**
     * ���г��������Ĳ���
     * 
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void duduct(OrderVO order){
		orderlist.cancel();
	}
	
	
	/**
     * �ж϶����Ƿ��ѱ�����
     * 
     * @param orderID String�ͣ��ͻ����
     * @param currentTime Time�ͣ�����������ʱ��
     * @return ���ѳ����򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public Boolean whetherDeduct(Date currentTime,String orderID){
		orderitem=orderlist.showdetail(orderID);
		if(orderitem.getcancel()==currentTime){
			return true;
		}
		else{
			return false;
		}
	}
	
	
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
	public void makeOrder(Date currentTime,
			Date in,Date out,Date ddl,
			String roomType,int num,
			int numOfPerson,
			boolean haveChild ) {
		Order b=new Order();
	    OrderLineItem a=new OrderLineItem(b);
		a.getorder().setExpectedCheckIn(in);
		a.getorder().setExpectedCheckOut(out);
		a.getorder().setLatest(ddl);
		a.getorder().setRoomType(roomType);
		a.getorder().setNumOfPerson(numOfPerson);
		a.getorder().setRoomNumber(num);
		a.getorder().setChild(haveChild);
		orderlist.addOrderLineItems(a);
	}
	
	
	
	/**
     * �ж϶����Ƿ�����
     * 
     * @param userID String�ͣ��ͻ����
     * @return ���������򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public boolean whetherMake(String uerID){
		return true;
	}
	
	
	
	/**
     * ���Ķ���״̬Ϊ��ִ�У�Ϊ�ͻ���������ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void done(String orderID,String userID){
		orderlist.find(userID,orderID).getorder().setOrderState(1);
		credititem.getUser().setCurrentcredit(2);
		useritem.getUser().setLevel(2);
	}
	
	
	/**
     * ���¶�������Ϊ�쳣��Ϊ�ͻ���ȥ����ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void abnormalOrder(String orderID,String userID){
		orderlist.find(userID,orderID).getorder().setOrderState(1);
		credititem.getUser().setCurrentcredit(1);
		useritem.getUser().setLevel(1);
	}
	
	
	/**
     * ���¶�������Ϊ��ִ�У�Ϊ�ͻ��ָ�����ֵ�����»�Ա�ȼ�  
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void delayIn(String orderID,String userID){
		orderlist.find(userID,orderID).getorder().setOrderState(3);
		credititem.getUser().setCurrentcredit(3);
		useritem.getUser().setLevel(3);
	}
	
	
	/**
     * ��������ִ�����񣬳־û������漰�������������� ϵͳ����
     * 
     * @see bussinesslogic.Order
     */
	public ResultMessage endExecute() {
		return ResultMessage.Exist;
	}
	
	
	/**
     * ���¶�����Ϣ����ʾ����
     * 
     * @param comment String�ͣ��ͻ�����
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void comment(String comment,Order order){
		orderitem=new OrderLineItem(order);
		orderitem.getorder().setComment(comment);
	}
	
	
	/**
     * ���������ID���Ҷ�������ʾ
     * 
     * @param ID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderLineItem findByID(String ID){
		return orderlist.findByID(ID);
	}
	
	
	/**
     * �ָ��ͻ�����ֵ�����»�Ա�ȼ�
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param choice Choice�ͣ�һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public void regain(OrderVO vo,Choice choice){
		credititem.getUser().setCurrentcredit(3);
		useritem.getUser().setLevel(3);
	}
	
	
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param userID String�ͣ��ͻ����
     * @return long�������ļ�ֵ
     * @see bussinesslogic.Order
     */
	public long getPrice(Order vo,String userID){
		orderitem=new OrderLineItem(vo);
		return orderitem.getorder().getOrderValue();
	}
	
	
	/**
     * δ֧������
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @return ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage payment(OrderVO vo){
		return ResultMessage.Exist;
	}
}
