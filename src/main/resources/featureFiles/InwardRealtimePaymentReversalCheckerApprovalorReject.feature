#Author: Mukesh
@US:11438
Feature: As a business user, I need  a screen for checker to verify the reversal request.
  User should be naviaged to this screen from checker queue

  #US:11438
  Background: 
    Given user logged in as a checker
 #   And the checker click Inward Payment processing in homepage
    And the checker click Realtime Payment Reversal Approval under Inward payment processing field

  #	blocker in line 10
  @test
  Scenario: checker approve the Inward Reversal Payment reversal and maker download the Pac002 status in reports
    When Checker click the edit icon of the request
    And Checker click Approve button of the request
    And Approve option selected successfully
    And checker logout
    When user logged in as a maker
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report
    And maker click view report
    And click eye icon to view the returned history report of details
    Then click download button to the PAC002 status of returned report

  @test
  Scenario: checker approve the Inward Reversal Payment reversal and maker download the Pac004 status in reports
    When Checker click the edit icon of the request
    And Checker click Approve button of the request
    And Approve option selected successfully
    And checker logout
    When user logged in as a maker
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report
    And maker click view report
    And click eye icon to view the returned history report of details
    Then click download button to the PAC004 status of returned report
