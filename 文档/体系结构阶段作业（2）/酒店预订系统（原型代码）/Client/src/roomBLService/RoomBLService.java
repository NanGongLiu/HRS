package roomBLService;
import java.util.*;
import common.*;
import VO.*;

/**
 * ����ʵ�ֲ鿴�ɱ������;�Ӫ������������Ҫ�ķ���ӿ�
 * @author ������
 * @version 1.0
 * @see presentation.Room
 */

public interface RoomBLService {
    /**
     * �޸ķ�����Ϣ
     * 
     * @param in MessageInput�ͣ�����������޸���Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Room
     */
	public ResultMessage messageupdate(MessageInput in);
	
	
	
    /**
     * �޸ľƵ꺬�еķ�����Ϣ
     * 
     * @param in MessageInput�ͣ�����������޸���Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Room
     */
	public ResultMessage messageadd(MessageInput in);
	
	
	/**
     * ��ö����ϵĿͻ��ĸ�����Ϣ����ס�˷�ʱ��
     * 
     * @param vo OrderVO�ͣ�һ��OrderVO������ֵ����
     * @return RoomVO����һ������ֵ����
     * @see bussinesslogic.Room
     */
	public RoomVO messageadd(OrderVO  vo);
	
	
	/**
     * ���ؿ���ס����
     * 
     * @return ArrayList<RoomVO>,һ������ֵ�����б�
     * @see bussinesslogic.Room
     */
	public ArrayList<RoomVO> getRoom();
	
	
	/**
     * ���ط���ļ۸�
     * 
     * @param roomType String�ͣ�һ�ַ�������
     * @return ����һ��long��ֵ
     * @see bussinesslogic.Room
     */
	public long getPrice(String roomType);
}
