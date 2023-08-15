package view;
import controller.ControllerMDC;

public class PublicRecursicaMDC {

	public static void main(String[] args) {
		int x = 20;
		int y = 24;
		
		ControllerMDC mdc = new ControllerMDC();
		
		int res = mdc.MDC(x, y);
		System.out.println(res);

	}

}
