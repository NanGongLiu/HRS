package roomBLService;

import java.util.ArrayList;

import javax.xml.crypto.Data;

import VO.OrderVO;
import VO.RoomVO;
import common.MessageInput;
import common.ResultMessage;

/**
 * ����ʵ�ֲ鿴�ɱ������;�Ӫ������������Ҫ��׮����
 * @author ������
 * @version 1.0
 * @see presentation.Room
 */
public class RoomBLService_Stub implements RoomBLService{
	         String roomId;
	         String roomStatue;
	         String roomType;
	         int roomS;
	         int roomPrice;
	         String userName;
	         String userAccount;
	         String userPhone;
	         Data expectedOut;
	         Data actuallyOut;         
	         public RoomBLService_Stub (String roomid,String roomstatue,String roomtype,int rooms,int roomprice,String uName,String uAccount,String uPhone,Data expectedout,Data actuallyout) 
	        {
	         roomId=roomid;
	         roomStatue=roomstatue;
	         roomType=roomtype;
	         roomS=rooms;
	         roomPrice=roomprice;
	         userName = uName;
		 userAccount = uAccount;
		 userPhone = uPhone;
	         expectedOut = expectedout;
	         actuallyOut = actuallyout;  
	         }
	
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
	public ResultMessage messageadd(MessageInput in){
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
