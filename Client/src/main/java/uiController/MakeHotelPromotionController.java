package uiController;

import HotelWorkerView.HotelMainView;
import HotelWorkerView.MakeHotelPromotionView;
import runner.ClientRunner;
import uiService.HotelMainUiService;
import uiService.MakeHotelPromotionUiService;

public class MakeHotelPromotionController implements MakeHotelPromotionUiService {
	
	private MakeHotelPromotionView view;

	public void setView(MakeHotelPromotionView view) {
		this.view = view;
	}

	public void toHotelMainView() {
		HotelMainUiService controller = new HotelMainUiController();
		HotelMainView view = new HotelMainView(controller);
		controller.setView(view);
		ClientRunner.change(view);
	}

	public void makeHotelPromotion() {
		//ϵͳ��ӾƵ�Ӫ������
	}

}
