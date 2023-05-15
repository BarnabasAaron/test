#Author: Dhamodharan.S
Feature: US_11378 API should facilitate to view the outward credit transfer send by the customer. By using different state.

  #working
  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report

  @test
  Scenario Outline: Maker can able to view different state details using filter
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "State" in Select Name field of Outward Screen
    And Selects "Equal To" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    Then maker click view report

    Examples: 
      | Search           |
      | State Completed  |
      | State In Process |
      | State Returned   |
      | State Rejected   |
      | State Reversal   |
