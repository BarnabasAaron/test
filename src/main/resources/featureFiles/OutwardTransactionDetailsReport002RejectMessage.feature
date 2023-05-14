#Author: Dhamodharan.S
#Sprint_3
Feature: US_12149 As a business user, I need to reverse the core transaction against actual real-time outward transaction, incase of rejection

  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report

  Scenario: To verify the filter options with Status to see the PACS002 Reject message
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Debtor Acc Number" in Select Name field of Outward Screen
    And Selects "Equal To" in Operator Field
    And Enters data "Equal Search" in search field of Outwards Screen
    And maker selects Add filter
    And selects "Status" in Select Name field of Outward Screen
    And Selects "Equal To" in second Operator Field
    And selects data "Pacs002reject" from second status search field
    And maker click view report
    And the result will be displayed successfully
    And maker selects the eye icon
    Then maker see status of "Pacs002 Reject Message Received From CB For Revers"
