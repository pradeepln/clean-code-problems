package exercise09.iftimepermits;

import exercise09.iftimepermits.applayer.BrowserSupport;
import exercise09.iftimepermits.oslayer.NetworkInfra;

public class App {

	public static void main(String[] args) {
		Modem m = new Modem();
		NetworkInfra infra = new NetworkInfra();
		BrowserSupport b = new BrowserSupport();
		
		infra.setUp(m);
		b.sendRequest(m);

	}

}
