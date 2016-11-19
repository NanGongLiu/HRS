package roomBLService;

import java.util.ArrayList;

import VO.OrderVO;
import VO.RoomVO;
import common.MessageInput;
import common.ResultMessage;

public class RoomController implements RoomBLService {
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
	public ResultMessage messageadd(MessageInput  in){
		return ResultMessage.Exist;
	}
	
	
	/**
     * ��ö����ϵĿͻ��ĸ�����Ϣ����ס�˷�ʱ��
     * 
     * @param vo OrderVO�ͣ�һ��OrderVO������ֵ����
     * @return RoomVO����һ������ֵ����
     * @see bussinesslogic.Room
     */
	public RoomVO messageadd(OrderVO  vo){
		return new RoomVO();
	}
	
	
	/**
     * ���ؿ���ס����
     * 
     * @return ArrayList<RoomVO>,һ������ֵ�����б�
     * @see bussinesslogic.Room
     */
	public ArrayList<RoomVO> getRoom(){
		return new ArrayList<RoomVO>();
	}
	
	
	/**
     * ���ط���ļ۸�
     * 
     * @param roomType String�ͣ�һ�ַ�������
     * @return ����һ��long��ֵ
     * @see bussinesslogic.Room
     */
	public long getPrice(String roomType){
		return 200;
	}
}
