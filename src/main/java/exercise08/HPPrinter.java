package exercise08;

public class HPPrinter  extends Printer{
	

	
	@Override
	public void print(String path) {
		int inputVolts = 251;
		if(inputVolts < 150 || inputVolts > 250) {
			System.out.println("Can't print when input voltage is "+inputVolts);
		return;
		}
		//actual logic for printing
	}

}
