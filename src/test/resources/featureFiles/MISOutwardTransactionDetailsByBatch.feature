#Author: Dhamodharan.S
Feature: US_11409 and US_11443 As a business user, i need an option in outward transaction detail report to view the batch transaction details. So, i can view the all transaction processed in batch mode.

  #@URS_11409
  #@URS_11443
  #working
  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report

  @test
  Scenario Outline: Maker can able to view only batch transaction details using filter
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Mode" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And selects data "Mode Equal To Batch" from search field
    And maker click view report
    Then the result will be displayed successfully

  @test
  Scenario Outline: Maker can able to view the particular batch transaction details
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Mode" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And selects data "Mode Equal To Batch" from search field
    And maker click view report
    Then particular batch detailed result will be displayed successfully
