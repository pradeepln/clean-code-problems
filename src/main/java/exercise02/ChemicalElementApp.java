package exercise02;

public class ChemicalElementApp {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1,"Hydrogen","H");
		ChemicalElement h2 = new ChemicalElement(1,"hydrogenium","H");
		ChemicalElement h3 = h;
//		h.atomicNumber = 1;
//		h.symbol = "H";
//		h.name = "Hydrogen";
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		
		System.out.println("Is hydrogen an alkali? "+h.alkali());
		System.out.println("Is potassium an alkali? "+k.alkali());
		
		System.out.println("h == h2? "+ (h == h2));
		System.out.println("h == h3? "+ (h == h3));
		System.out.println("h == k? "+ (h == k));

		
		System.out.println("h equals h2? "+ h.equals(h2));
		System.out.println("h equals h3? "+ h.equals(h3));
		System.out.println("h equals k? "+ h.equals(k));
		
		System.out.println("The name of this element is "+k.getName());
//		k.atomicNumber = -1;
		
		
		
	}

}
