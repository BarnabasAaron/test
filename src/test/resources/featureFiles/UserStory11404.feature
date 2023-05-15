#Author:Barnabas
Feature: Outward Transaction Summary Report
#Narrative:As a business user, I need an option in existing outward transaction detail report to view the summary of outward transaction details.
#@URS_11404
Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Summary Report
    
    
    
    Scenario: To view the details with Realtime Mode filter
    
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Mode" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And selects data "Mode Equal To" from search field
    And maker click view report
    Then the result will be displayed successfully
    