package uiService;

import HotelWorkerView.HotelMainView;

/**
 * ����ʵ�־Ƶ����ϵͳ�ľƵ깤����Ա�ĳ�ʼ����
 * @author ����٩
 */
public interface HotelMainUiService {

	public void setView(HotelMainView view);
	public void toLogView();//���ص�¼����
	public void toUpdateHotelInfoView();
	public void toAdminRoomView();
	public void toBrowseOrderView();
	public void toMakeHotelPromotionView();
	
	
}
