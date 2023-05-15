#Author:Barnabas
Feature: To download PACS002 file
#Narrative:As a business user, i need an option to view the the status of reversal in existing outward transaction status report. On initiation of reversal message status should be changed as reversal initiated and corresponding event log reflected in the report
#@URS_11379


Scenario: To download the pacs002 file
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "State" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And Enters data "State Equal To" in search field
    And maker click view report
    Then the result will be displayed successfully
    And maker selects the eye icon
    And maker clicks download icon of "Pacs002 Payment Return Accepted Confirmation Recei" file
    Then the file will be downloaded successfuly
    
    
   