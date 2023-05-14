#Author: Dhamodharan.S
#Sprint_3
Feature: US_12150 As a business user (checker) i should be able to view all of the Real time payment reversal that are verified by maker, through this queue screen

  Background: 
    Given user logged in as a checker
    #And the checker click Inward Payment processing in homepage
    And the checker click Realtime Payment Reversal Approval under Inward payment processing field

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker should able to verify detailed view of realtime payment reversal
    When Checker click the edit icon of the request
    And Checker see detaild view of realtime payment reversal request
    Then Checker verify details view of realtime payment reversal request

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker should able to approve realtime payment reversal checker queue
    When Checker click the edit icon of the request
    And Checker click Approve button of the request
    Then Approve option selected successfully
