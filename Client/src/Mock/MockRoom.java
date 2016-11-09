package Mock;

import VO.RoomVO;

public class MockRoom extends RoomVO {

	private String roomId;
    private String roomStatue;
    private String roomType;
    private int roomS;
    private int roomPrice;
    /**
	 * ģ�ⷿ��
	 * @param roomid String�ͣ����ݲ㴫���ķ����
	 * @param roomstatue String�ͣ����ݲ㴫���ķ���״̬
	 * @param roomtype String�ͣ����ݲ㴫���ķ�������
	 * @param rooms int�ͣ����ݲ㴫���ķ�������
	 * @param roomprice int�ͣ����ݲ㴫���ķ���۸�
	 * @return
	 * @throws
	 * @see
	 */
	public MockRoom(String roomid, String roomstatue, String roomtype, int rooms, int roomprice) {
		super(roomid, roomstatue, roomtype, rooms, roomprice);
	}
	
	/**
	 * ��ȡ�����
	 * @param
	 * @return ���ط����
	 * @throws
	 * @see
	 */
    public String getroomId() {
    	return roomId;
    } 
    /**
	 * ���÷����
	 * @param id String�ͣ��߼��㴫���ķ����
	 * @return
	 * @throws
	 * @see
	 */
    public void setroomId (String id){
    	roomId=id;
    }
    /**
	 * ��ȡ����״̬
	 * @param
	 * @return ���ط���״̬
	 * @throws
	 * @see
	 */
    public String getroomStatue() {
    	return roomStatue;
    }
    /**
	 * ���÷���״̬
	 * @param sta String�ͣ��߼��㴫���ķ���״̬
	 * @return
	 * @throws
	 * @see
	 */
    public void setroomStatue (String sta){
    	roomStatue=sta;
    }
    /**
	 * ��ȡ��������
	 * @param
	 * @return ���ط�������
	 * @throws
	 * @see
	 */
    public String getroomType() {
    	return roomType;
    }
    /**
	 * ���÷�������
	 * @param type String�ͣ��߼��㴫���ķ�������
	 * @return 
	 * @throws
	 * @see
	 */
    public void setroomType (String type){
		roomType=type;
	}
    /**
	 * ��ȡ��������
	 * @param
	 * @return ���ط�������
	 * @throws
	 * @see
	 */
    public int getroomS() {
		return roomS;
	}
    /**
	 * ���÷�������
	 * @param room int�ͣ��߼��㴫���ķ�������
	 * @return
	 * @throws
	 * @see
	 */
    public void setroomS (int room){
		roomS=room;
	}
    /**
	 * ��ȡ����۸�
	 * @param
	 * @return ���ط���۸�
	 * @throws
	 * @see
	 */
    public int getroomPrice() {
		return roomPrice;
	}
    /**
	 * ���÷���۸�
	 * @param price int�ͣ��߼��㴫���ķ���۸�
	 * @return
	 * @throws
	 * @see
	 */
    public void setroomPrice (int price){
		roomPrice=price;
	}
    
    

}




