#Author: Dhamodharan.S
#Sprint_3
Feature: US_12153 As a support/Business user, I need a screen to view the various states and status of messages processing, processing history. ISO formats like pacs008  to against the message flow should be able to view based on the  privilege configuration

  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report

  @test
  Scenario: Maker can able to download the PAC008 in rejected state details
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "State" in Select Name field
    And Selects equal "Equal to" operator in Operator Field
    And Enters data "State Rejected" in search field
    And maker click view report
    Then the result will be displayed successfully
    And maker selects the eye icon
    And maker clicks download icon of "Pacs008 Customer Credit Transfer Request Received" file
    Then the file will be downloaded successfuly

  @test
  Scenario: Maker can able to download the PAC008 in returned state details
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "State" in Select Name field
    And Selects equal "Equal to" operator in Operator Field
    And Enters data "State Equal To" in search field
    And maker click view report
    Then the result will be displayed successfully
    And maker selects the eye icon
    And maker clicks download icon of "Pacs008 Customer Credit Transfer Request Received" file
    Then the file will be downloaded successfuly
