package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.OutwardTransactionDetailReport;

public class OutwardTransactionDetailsReport002RejectMessageSteps {
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();

	
	@Then("^maker see status of \"([^\"]*)\"$")
    public void maker_see_status_of_pacs002(String message) throws Throwable {
    	
    	outward.verifydatafromTable(message);
       
    }

}
