package exercise02;

import java.util.Objects;

public class ChemicalElement implements Comparable<ChemicalElement> { 
	
	
	public boolean alkali() {
		return alkaliMetals[atomic_number];
	}
	
	public boolean trans() {
		return (this.atomic_number >= 21 && this.atomic_number <= 31)
				|| (this.atomic_number >= 39 && this.atomic_number <= 48)
				|| (this.atomic_number >= 72 && this.atomic_number <= 80)
				|| (this.atomic_number >= 104 && this.atomic_number <= 112);
	}
	
	private int atomic_number;
	private String name, SYM;
	
	
	public ChemicalElement(int atomicNumber, String humanname, String symbolicname) {
		if(atomicNumber <= 0) {
			throw new IllegalArgumentException("hey, you can't pass 0 or -ve number for atomic number!!");
		}
		this.atomic_number = atomicNumber;
		this.name = humanname;
		this.SYM = symbolicname;
	}
	
	
	
	public boolean metal() {
				
		switch (atomic_number) {
		case 13:
			return true;
		case 49:
			return true;
		case 50:
			return true;
		case 81:
			return true;
		case 82:
			return true;
		case 83:
			return true;
		case 113:
			return true;
		case 114:
			return true;
		case 115:
			return true;
		case 116:
			return true;
		default:
			return false;
		}
	}
	
	
	public int getAtomicNumber() {
		return atomic_number;
	}

	public String getName() {
		return name;
	}

	public String getSymbol() {
		return SYM;
	}



	@Override
	public boolean equals(Object obj) {

		ChemicalElement other = (ChemicalElement) obj;
		if (atomic_number != other.atomic_number)
			return false;
		return true;
	}

	
	@Override
	public int compareTo(ChemicalElement other) {
		
		
		if(this.atomic_number > other.atomic_number) {
			return 1;
		}else if(other.atomic_number > this.atomic_number) {
			return -1;
		}else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomic_number + ", name=" + name + ", symbol=" + SYM + "]";
	}
	
private static final boolean[] alkaliMetals = new boolean[120];
	
	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}
}
