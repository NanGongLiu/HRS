package VO;
import java.sql.Time;
import java.util.Date;
import PO.*;
import Object.Order;

/**
 * ���������Լ����ݴ��������
 * @author ������
 * @version 1.1
 * @see Object.Order
 */

public class OrderVO extends VO {
    public String userID;
    public String hotelID;
	public String orderNumber;
	public int orderState;
	public int orderValue;
	public int numOfPerson;
	public boolean child;
	public String roomType;
	public int roomNumber;
	public Date expectedCheckIn;
	public Date expectedCheckOut;
	public Date latest;
	public Date cancel;
	public Date generationTime;
	public String comment;
	public int score;	
    public OrderVO (String hotelID,String userid,String oNum, int state, int value, int pnum,boolean ch,String rType, int rNum, Date in, Date out,Date la,Date cal,Date gen, String comm, int sco) {
		this.hotelID=hotelID;
    	userID=userid;
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
        cancel=cal;
        generationTime=gen;
	}
    public OrderVO (HotelPO po1,OrderPO po){
    	hotelID=po1.gethotelName();
		orderNumber=po.getOrderNumber();
		orderState=po.getOrderState();
		orderValue=po.getOrderValue();
		numOfPerson=po.getNumOfPerson();
		child=po.getChild();
		roomType=po.getRoomType();
		roomNumber=po.getRoomNumber();
		expectedCheckIn=po.getExpectedCheckIn();
		expectedCheckOut=po.getExpectedCheckOut();
		latest=po.getLatest();
		cancel=po.getCancel();
		generationTime=po.getgenerationTime();
		comment=po.getComment();
		score=po.getScore();	
    }
    public OrderVO(){}
	/**
     * ���¶�����Ϣ
     * 
     * @param ord Order�ͣ�һ�������������ݵĶ�������
     * @return 
     * @see Object.Order
     */
	public void update(OrderVO vo) {
		hotelID=vo.hotelID;
		userID=vo.userID;
		orderNumber=vo.orderNumber;
		orderState=vo.orderState;
		orderValue=vo.orderValue;
		numOfPerson=vo.numOfPerson;
		child=vo.child;
		roomType=vo.roomType;
		roomNumber=vo.roomNumber;
		expectedCheckIn=vo.expectedCheckIn;
		expectedCheckOut=vo.expectedCheckOut;
		latest=vo.latest;
		cancel=vo.cancel;
		generationTime=vo.generationTime;
		comment=vo.comment;
		score=vo.score;	
	}
	
	/**
     * ������������
     * 
     * @return һ�����µĶ���
     * @see Object.Order
     */
	public Order makeOrder() {		
		return new Order();
	}
	
}
