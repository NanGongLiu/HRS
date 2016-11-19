package uiController;

import HotelWorkerView.AdminRoomView;
import HotelWorkerView.InputRoomInfoView;
import runner.ClientRunner;
import uiService.AdminRoomUiService;
import uiService.InputRoomInfoUiService;

public class InputRoomInfoUiController implements InputRoomInfoUiService {
	
	private InputRoomInfoView view;

	public void setView(InputRoomInfoView view) {
		this.view = view;
	}

	public void toAdminRoomView() {
		AdminRoomUiService controller = new AdminRoomUiController();
		AdminRoomView view = new AdminRoomView(controller);
		controller.setView(view);
		ClientRunner.change(view);
	}

	public void inputRoomInfo() {
		//ϵͳ���¾Ƶ�ӵ�еķ�����Ϣ
	}

}
