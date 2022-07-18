package exercise11;

public class LendingSystem {
	
	public int processLoanRequest(String applicantName, String address,	String purposeOfLoan, String specialRequests, String type, int cibilScore, int requiredTerm) {
		if(applicantName == null || type == null) {
			System.out.println("applicant name and applicant type are needed parameters");
			return -1;
		}
		if(!type.equalsIgnoreCase("government") && cibilScore <= 0) {
			System.out.println("For all applicant types other than government, cibil score is needed");
			return -2;
		}
		
		//ACTUAL LOGIC HERE, elided for simplicity
		
		return 1;
	}

}
