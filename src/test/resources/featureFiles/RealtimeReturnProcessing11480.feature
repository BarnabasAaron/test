
#@URS_11480
#This user story is under blocked
Feature: Realtime Return Processing
 
Scenario:

		Given The user has logged in as Maker
    And from home page the maker navigates to utility page
    And maker clicks Realtime Credit transfer initiation Quick Pay
     When maker entered valid Department,Debtor,creditor and Transaction details
    And Clicks initiation button
    And under Confirmation screen by selecting Confirm and proceed button
    Then payment will be succesfull
    And maker clicks logout
    And the user logged in as a checker
    And checker clicks Realtime Credit Transfer Approval
    And selects the eye icon
    And selects Approve button 
    And Checker clicks logout
    And The user has logged in as Maker
    And maker selects Inward Payment Return Approval
    And selects edit icon
    And clicks approve button
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report
    And maker add the new search filter
    And selects "State" in Select Name field
    And Selects "Equals To" in Operator Field
    And Enters data "Returned" in search field
    And maker click view report
    And maker selects eye icon
    And maker downloads the pacs 004 file 
    Then the file will be downloaded successfully
    
    
    