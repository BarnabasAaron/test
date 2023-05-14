#Author: Mukesh
#CreatedDate: 07/01/2023 #lastupdatedDate: 08/01/2023
#This Feature file covers User Story 11439
#Mukesh should complete InwardRealtimeTransactionSummary.match_cutomizedvalue_and_tablevalue();
Feature: As a business user, I need an option in existing inward transaction detail report to view the summary of outward transaction details
  So I can view different type of summary such as daily summary, customerwise summary, account wise summary, participantwise summary etc

  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report

  @public
  Scenario: Maker should able to view all mandatory filter option
    When maker clicks filter button
    Then all the mandatory column names should displayed

  @public
  Scenario: Maker should able to customize the reports
    When maker clicks filter button
    And Customize the reports
    And clicks on save button
    And success toast msg should displayed
    Then the customized column should match with the Inward transaction details table

  @public 
  Scenario: verify maker can able to view any tranasaction
    When maker click on view button
    Then the Inward transaction details popup should displayed

  @public @runtestrun
  Scenario: verify maker can able to close the filters
    When maker clicks filter button
    And Close the filter popup
