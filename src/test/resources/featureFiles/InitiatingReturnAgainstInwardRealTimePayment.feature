Feature: As a business user, I need APIs to view and initiate the return request against earlier received payment. So, that end customer/channel system can initiate the return request as needed.
#@URS_11410
#Blocked
  Background: 
    Given The user has logged in as Maker
    And from home page the maker navigates to utility page
    And maker clicks Realtime Inward Payment Reversal Initiation

  Scenario: To execute the entire process as a normal positive flow
    When the maker selects search with particular date
    And from the results displayed maker selects the edit button
    And selects Approve
    Then the user login as checker
    And from checker homescreen the checker selects Realtime Payment Reversal Approval under Inward Payment Processing
    And selects the edit icon
    And selects the Approve button

  Scenario: To download the pacs002 file from Inward Transaction Detail Report Screen
    When the positive flow is completed
    And The user has logged in as Maker
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report
    And maker click view report
    And selecting eye icon of the first transaction
    And selecting download button of pacs002
    Then pacs002 file will be downloaded successfully

  Scenario: To download the pacs004 file from Inward Transaction Detail Report Screen
    When the positive flow is completed
    And The user has logged in as Maker
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report
    And maker click view report
    And selecting eye icon of the first transaction
    And selecting download button of pacs002
    Then pacs004 file will be downloaded successfully
    
   
