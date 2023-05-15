#Author:Barnabas
Feature: To download PACS002 file
#Narrative:As a business user, I need  processing the Payment status report (002-Accept/Reject) received from Central bank and beneficiary bank against the 008 messages.
#@URS_12191

 Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report


Scenario: To download the pacs002 file

When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Mode" in Select Name field of Outward Screen
    And Selects "Equal To" in Operator Field
    And selects data "Mode Equal To" from search field
    And maker selects Add filter
    And selects "State" in Select Name field of Outward Screen
    And Selects "Equal To" in second Operator Field
    And Enters data "State Completed" in search field of Outwards Screen
    And maker click view report
    And the result will be displayed successfully
    And maker selects the eye icon
    And maker clicks download icon of "PACS002 Accept Message Received From CB" file
    Then the file will be downloaded successfuly


    
    
    