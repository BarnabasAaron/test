#Author:Mukeshvb
Feature: Charge configuration- reject charges by checker

  #Narrative: As a Checker, I want to see active and modify charges by selecting pending class-wise charges, so that I can Reject charge configuration.
  #URS_12232
  @case1 
  Scenario: Reject the charge configuration charge which is initiated by maker
    Given The user has logged in as Maker
    And select Setting from side menu and click on NPSS Charge Configuration button
    And selects "Realtime" in message type
    And Selects "outward" in payment flow type
    And click on submit button
    And Save the result displayed in the toast msg and logout as maker
    And user logged in as a checker
    And select Setting from side menu
    And click on NPSS Charge Configuration Approval button
    And checker clicks on edit button
    And click reject button
    And enter remarks in confirmation popup and click on Reject button
    Then verify the reject toast msg
