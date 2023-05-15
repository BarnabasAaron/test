#Author: Dhamodharan.S
Feature: US_11400 As a business user, I need an option to view and download the received Pacs 002 message file from the outward transaction detail report's history view.

#working
  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report

  @test
  Scenario Outline: Maker can able to view only credit transfer completed details using filter
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Status" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And selects data "Status Equal To Be Completed" from status search field
    And maker click view report
    Then the result will be displayed successfully

  @test
  Scenario Outline: Maker can able to download the PAC002 in history report of any of one credit transfer completed detail
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Status" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And selects data "Status Equal To Be Completed" from status search field
    And maker click view report
    Then the result will be displayed successfully
    And maker selects the eye icon
    And maker clicks download icon of "PACS002 Accept Message Received From CB" file
    Then the file will be downloaded successfuly
    
