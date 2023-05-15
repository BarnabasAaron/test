#Author:Barnabas
Feature: To initiate the Realtime Credit Transfer Initiation Detailed View and approve from Checker
#Narrative: As a business user I need to approve or reject all the Outward Customer Credit Transfers.
#@URS_12152,@URS_12200,@URS_12199,@URS_12225,

  Background: 
    Given The user has logged in as Maker
    And from home page the maker navigates to utility page
    And maker clicks Realtime Credit transfer initiation Detailed View

  
  Scenario: Maker should able to select the Department value
  
  When maker selects the department field
  And selects option from dropdown of department field
  
  Scenario: Maker should able to search for Debtor Account Details
  
  When maker updates department field
  And enters data under Debtor Account Number field
  And select search button
  Then the debtor Account data will be updated in the fields
  
 
  Scenario: Maker should able to search for Creditor Account Details
  
  When maker updates department field
  And maker updates the debtor Account field
  And maker enters data under Creditor Account number field
  And select search button of Creditor Account field
  Then the creditor Account data will be updated in the field
  
  
  Scenario: Maker should able to verify whether the Charge Amount is been displayed
  
  When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
 	And maker selects the Transaction Type
 	Then verify whether the charge amount is been displayed
 	
 	
 	Scenario: Maker should able to verify whether the VAT Amount is been displayed
 	
 	 When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
 	And maker selects the Transaction Type
 	Then verify whether the VAT amount is been displayed
 	
 	Scenario: Maker should able to verify whether the Total Amount is been displayed
 	
 	 When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
 	And maker selects the Transaction Type
 	Then verify whether the Total Amount is been displayed 
  
  
  Scenario: Error message should be displayed if the mandatory fields are not entered
  
  When maker selects initiate button without entering any data
  Then Error message should be displayed in the particular fields
  
  Scenario: Maker should able to reset the data 
  
  When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
 	And maker selects the Transaction Type
 	Then maker selects Reset button
 	And the entered data should be reset to default
 	
 	Scenario: Maker should able to verify whether all the entered details are been present in the confirmation page after initiating
 	
 	When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
  And maker enters Senders Charge
 	And maker selects the Transaction Type
 	And maker selects data from Charge Type
 	And maker enters Transaction Remarks
 	And maker enters Remarks
 	And maker selects initiate button
 	And verify the details in confirmation page
 	
 	
 	Scenario: Maker should able to confirm the initiation
 	
 	When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
  And maker enters Senders Charge
 	And maker selects the Transaction Type
 	And maker selects data from Charge Type
 	And maker enters Transaction Remarks
 	And maker enters Remarks
 	And maker selects initiate button
 	And verify the details in confirmation page
 	And selects confirm button
 	
 	Scenario: Maker should able to cancel the initiation 
 	
 		When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
  And maker enters Senders Charge
 	And maker selects the Transaction Type
 	And maker selects data from Charge Type
 	And maker enters Transaction Remarks
 	And maker enters Remarks
 	And maker selects initiate button
 	And verify the details in confirmation page
 	And selects cancel button
 	
 	
 	Scenario: Maker should able to change the creditor name and checker should able to approve
 	When maker updates department field
  And maker updates the debtor Account field
  And maker enters data under Creditor Account number field
  And select search button of Creditor Account field
  And maker should able to change the creditor name
   And maker enters settled amount
  And maker enters instructed amount
  And maker enters Senders Charge
 	And maker selects the Transaction Type
 	And maker selects data from Charge Type
 	And maker enters Transaction Remarks
 	And maker enters Remarks
 	And maker selects initiate button 
 	And selects confirm button which has change in creditor name
  And maker selects logout
  And Checker logs in
  And selects Realtime Credit Transfer Approval from home page
  And verifies the data
  And clicks eye icon
  And verify Debtor Details
  And verify Creditor Details
  And click Approve
  
 	
 	Scenario: Maker should able to change the Creditor ID and checker should able to approve
 	
 	When maker updates department field
  And maker updates the debtor Account field
  And maker enters data under Creditor Account number field
  And select search button of Creditor Account field
  And maker should able to change the creditor ID
  And maker enters settled amount
  And maker enters instructed amount
  And maker enters Senders Charge
 	And maker selects the Transaction Type
 	And maker selects data from Charge Type
 	And maker enters Transaction Remarks
 	And maker enters Remarks
 	And maker selects initiate button
 	And selects confirm button which has change in creditor ID
  And maker selects logout
  And Checker logs in
  And selects Realtime Credit Transfer Approval from home page
  And verifies the data
  And clicks eye icon
  And verify Debtor Details
  And verify Creditor Details
  And click Approve
 	
 	
 	Scenario: Maker should able to change the Creditor Agent Name and checker should able to approve
 	
 	When maker updates department field
  And maker updates the debtor Account field
  And maker enters data under Creditor Account number field
  And select search button of Creditor Account field
  And maker should able to change the creditor Agent Name
  And maker enters settled amount
  And maker enters instructed amount
  And maker enters Senders Charge
 	And maker selects the Transaction Type
 	And maker selects data from Charge Type
 	And maker enters Transaction Remarks
 	And maker enters Remarks
 	And maker selects initiate button
 	And selects confirm button which has change in creditor Agent Name
  And maker selects logout
  And Checker logs in
  And selects Realtime Credit Transfer Approval from home page
  And verifies the data
  And clicks eye icon
  And verify Debtor Details
  And verify Creditor Details
  And click Approve
 	
  
 	
 	Scenario: Maker should able to change the Town Name and checker should able to approve
 	
 		When maker updates department field
  And maker updates the debtor Account field
  And maker enters data under Creditor Account number field
  And select search button of Creditor Account field
  And maker should able to change the creditor Town Name
  And maker enters settled amount
  And maker enters instructed amount
  And maker enters Senders Charge
 	And maker selects the Transaction Type
 	And maker selects data from Charge Type
 	And maker enters Transaction Remarks
 	And maker enters Remarks
 	And maker selects initiate button
 	And selects confirm button which has change in creditor Town Name
  And maker selects logout
  And Checker logs in
  And selects Realtime Credit Transfer Approval from home page
  And verifies the data
  And clicks eye icon
  And verify Debtor Details
  And verify Creditor Details
  And click Approve
 	
 	
  
 	
 	 Scenario: Maker should able to enter senders charge and Checker should approve
  
   When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
 	Then maker enters Senders Charge
 	And maker selects the Transaction Type
  And maker selects initiate button
  And selects confirm button which has changes in senders charge
  And maker selects logout
  And Checker logs in
  And selects Realtime Credit Transfer Approval from home page
  And verifies the data
  And clicks eye icon
  And verify Debtor Details
  And verify Creditor Details
  And verify senders charge
  And click Approve
  
  Scenario: Maker should able to change Charge Type and Checker should approve
  
   When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
 	And maker selects the Transaction Type
 	Then maker selects data from Charge Type
 	And maker selects initiate button
  And selects confirm button which has change in Charge Type
  And maker selects logout
  And Checker logs in
  And selects Realtime Credit Transfer Approval from home page
  And verifies the data
  And clicks eye icon
  And verify Debtor Details
  And verify Creditor Details
  And verify Charge Type
  And click Approve
  
  
 	Scenario: Maker should able to enter Transaction Remarks and Checker should approve
 	
 	When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
 	And maker selects the Transaction Type
 	Then maker enters Transaction Remarks
 	And maker selects initiate button
  And selects confirm button
  And maker selects logout
  And Checker logs in
  And selects Realtime Credit Transfer Approval from home page
  And verifies the data
  And clicks eye icon
  And verify Debtor Details
  And verify Creditor Details
  And verify Transaction Remarks
  And click Approve
  
  Scenario: Maker should able to enter Remarks and checker should able to approve
  
  When maker updates department field
  And maker updates the debtor Account field
  And maker updates the creditor Account field
  And maker enters settled amount
  And maker enters instructed amount
 	And maker selects the Transaction Type
 	Then maker enters Remarks
 	And maker selects initiate button
  And selects confirm button
  And maker selects logout
  And Checker logs in
  And selects Realtime Credit Transfer Approval from home page
  And verifies the data
  And clicks eye icon
  And verify Debtor Details
  And verify Creditor Details
  And verify Remarks
  And click Approve
 
 
  Scenario: Checker should able to the view details in Realtime Credit Transfer Approval Page
  
 		When maker updates department field
    And maker updates the debtor Account field
    And maker updates the creditor Account field
    And maker enters settled amount
    And maker enters instructed amount
    And maker selects the Transaction Type
    And maker selects initiate button
    And selects confirm button
    And maker selects logout
    And Checker logs in
    And selects Realtime Credit Transfer Approval from home page
    Then verifies the data
  
 	
 	Scenario: Checker should able to verify the details in the confirmation page
 	
 		When maker updates department field
    And maker updates the debtor Account field
    And maker enters data under Creditor Account number field
    And select search button of Creditor Account field
    And maker enters settled amount
    And maker enters instructed amount
    And maker selects the Transaction Type
    And maker selects initiate button
    And selects confirm button
    And maker selects logout
    And Checker logs in
    And selects Realtime Credit Transfer Approval from home page
    And verifies the data
    And clicks eye icon
    And verify Debtor Details
    And verify Creditor Details
    
    
    Scenario: Checker should able to approve the transaction 
     When maker updates department field
    And maker updates the debtor Account field
    And maker enters data under Creditor Account number field
    And select search button of Creditor Account field
    And maker enters settled amount
    And maker enters instructed amount
    And maker selects the Transaction Type
    And maker selects initiate button
    And selects confirm button
    And maker selects logout
    And Checker logs in
    And selects Realtime Credit Transfer Approval from home page
    And verifies the data
    And clicks eye icon
    And verify Debtor Details
    And verify Creditor Details
    And click Approve 
    
     Scenario: Checker should able to reject the transaction 
    When maker updates department field
    And maker updates the debtor Account field
    And maker enters data under Creditor Account number field
    And select search button of Creditor Account field
    Then the creditor Account data will be updated in the fields
    And maker enters settled amount
    And maker enters instructed amount
    And maker selects the Transaction Type
    And maker selects data from Charge Type
    And maker selects initiate button
    And selects confirm button
    And maker selects logout
    And Checker logs in
    And selects Realtime Credit Transfer Approval from home page
    And verifies the data
    And clicks eye icon
    And verify Debtor Details
    And verify Creditor Details
    And click Reject
    
    
    
 
