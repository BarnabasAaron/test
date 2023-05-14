#Author: Dhamodharan.S
#Sprint_3
Feature: US_12147 As a business user (checker) i should be able to view all of the Real time payment reversal that are verified by maker, through this queue screen

  @RealtimePaymentReversalCheckerVerificationScreen @ttestrun
  Scenario: Checker should able to view realtime payment reversal checker queue
    Given user logged in as a checker
    #When the checker click Inward Payment processing in homepage
    And the checker click Realtime Payment Reversal Approval under Inward payment processing field
    And Checker verify realtime payment reversal approval queue
    And Checker click the edit icon of the request
    And Checker see detaild view of realtime payment reversal request
    And Checker click history in detailed view page
    Then Checker verify history tab for realtime payment reversal approval queue
