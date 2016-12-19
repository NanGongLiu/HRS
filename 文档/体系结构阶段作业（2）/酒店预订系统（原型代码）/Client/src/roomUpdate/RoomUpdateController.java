package roomUpdate;

import java.rmi.RemoteException;
import java.util.ArrayList;

import VO.OrderVO;
import VO.RoomVO;
import common.MessageInput;
import common.ResultMessage;
import roomBLService.RoomBLService_realize;
public class RoomUpdateController extends RoomBLService_realize{
	/**
     * �޸ķ�����Ϣ
     * 
     * @param in MessageInput�ͣ�����������޸���Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Room
     */
	public ResultMessage messageupdate(MessageInput in){
		return ResultMessage.Exist;
	}
	
	
	
    /**
     * �޸ľƵ꺬�еķ�����Ϣ
     * 
     * @param in MessageInput�ͣ�����������޸���Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Room
     */
	public ResultMessage messageadd(MessageInput  in) {
		return ResultMessage.Exist;
	}
	
	
	/**
     * ��ö����ϵĿͻ��ĸ�����Ϣ����ס�˷�ʱ��
     * 
     * @param vo OrderVO�ͣ�һ��OrderVO������ֵ����
     * @return RoomVO����һ������ֵ����
     * @see bussinesslogic.Room
     */
	public RoomVO messageadd(OrderVO  vo) {
		RoomVO rv=new RoomVO();
		return rv;
	}
	
	
	/**
     * ���ؿ���ס����
     * 
     * @return ArrayList<RoomVO>,һ������ֵ�����б�
     * @see bussinesslogic.Room
     */
	public ArrayList<RoomVO> getRoom() {
		ArrayList<RoomVO> array=new ArrayList<RoomVO>(); 
		return array;
	}
}
