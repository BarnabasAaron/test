#Author: Mukesh
Feature: Charge configuration- Load Pending/approved charges by maker

  #Narrative: As a maker, I want to add modify Rule-wise charges for collecting charges from corporate, so that process the file (SIF, RFR)
  #@URS_12234
  Background: 
    Given The user has logged in as Maker
    And select Setting from side menu
    And click on NPSS Charge Configuration
    And click on Custom Charge tab

  @case1 
  Scenario: Verify maker able to click edit button when checker action is approved in the custom charge table
    When maker clicks the edit button if checker status is approved
    Then maker can able to edit the custom charges

  @case2
  Scenario: Verify maker able to click edit button when checker action is pending/reject in the custom charge table
    When maker can view the eye icon if checker status is pending
    Then maker cannot able to edit the custom charges
