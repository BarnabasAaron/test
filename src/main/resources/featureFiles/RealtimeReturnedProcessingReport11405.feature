#Author: Barnabas Aaron

Feature: As a business user, I need to download return messages (pacs 004) from Central Bank and process return to customer accounts
#@URS_11405
  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report
    And maker selects valid from date and valid to date 
    And maker selects Add filter
    And selects "State" in Select Name field of Outward Screen
    And Selects "Equal To" in Operator Field
    And Enters data "State Equal To" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

  Scenario: The maker should able to select the eye icon from the report and then view the details of the transaction
    And maker selects the eye icon
    

  Scenario: The maker should able to download the pacs 004 file from the History
    And maker selects the eye icon
    And maker clicks download icon of "PACS004 Message Processing To CB" file
    Then the file will be downloaded successfuly

    
   