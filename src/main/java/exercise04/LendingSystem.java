package exercise04;

public class LendingSystem {
	
	public boolean processLoanRequest(String applicantName, String address,	String purposeOfLoan, String specialRequests, String type, int cibilScore, int requiredTerm) {
		if(applicantName == null || type == null) {
			System.out.println("applicant name and applicant type are needed parameters");
			return false;
		}
		if(!type.equalsIgnoreCase("government") && cibilScore <= 0) {
			System.out.println("For all applicant types other than government, cibil score is needed");
			return false;
		}
		
		//ACTUAL LOGIC HERE, elided for simplicity
		
		return true;
	}

}
