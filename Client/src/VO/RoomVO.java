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
