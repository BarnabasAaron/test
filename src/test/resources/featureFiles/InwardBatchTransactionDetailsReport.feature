#Author: Mukesh
Feature: As a business user, I need an option in existing inward transaction detail report to monitor the batch transaction details with addition column filter for message type (real-time/batch).
  Relevant additional fields should be added in the detail report existing all report functionality should be achieved
  
  #US:11440
  @test
  Scenario: 
    Given The user has logged in as Maker
    When Maker selects Report from side menu
    And maker clicks Inward transaction details report
    And maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Mode" in Select Name field of Outward Screen
    And Selects "Equal To" in Operator Field
    And Enters data "search for batch" in search field of Outwards Screen
    And selects View Report
    And verify the Inward Transaction Detail column names
    And click eye icon to view the history report of details
    Then download the pacs status msg
    