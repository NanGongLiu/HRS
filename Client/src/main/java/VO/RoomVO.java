package VO;
import Object.Room;

/**
 * ��������Լ����ݴ��������
 * @author ����٩
 * @version 1.0
 * @see Object.Room
 */

public class RoomVO extends VO {

	public String roomId;
    public String roomStatue;
    public String roomType;
    public int roomS;
    public int roomPrice;
    public RoomVO(){};
    /**
	 * ��������
	 * @param roomid String�ͣ����ݲ㴫���ķ����
	 * @param roomstatue String�ͣ����ݲ㴫���ķ���״̬
	 * @param roomtype String�ͣ����ݲ㴫���ķ�������
	 * @param rooms int�ͣ����ݲ㴫���ķ�������
	 * @param roomprice int�ͣ����ݲ㴫���ķ���۸�
	 * @return
	 * @throws
	 * @see
	 */
    public RoomVO (String roomid,String roomstatue,String roomtype,int rooms,int roomprice){
	    roomId=roomid;
	    roomStatue=roomstatue;
	    roomType=roomtype;
	    roomS=rooms;
	    roomPrice=roomprice;
    }
    /**
     * ���·�����Ϣ
     * 
     * @param room Room�ͣ�һ�������������ݵķ������
     * @return 
     * @see Object.Room
     */
	public void update(Room room) {
		
	}
	
	/**
     * �����������
     * 
     * @return һ����¼��ķ���
     * @see Object.Room
     */
	public Room makeRoom() {
		
		return new Room();
	}
    
}
