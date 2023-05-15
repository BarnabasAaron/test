#Author: Dhamodharan.S
Feature: Realtime Payment Reversal Checker Verification Screen

  #Narrative:As a checker i should be able to verify the Real time payment reversal transaction that are verified by maker.
  #@URS11053
  Background: 
    Given user logged in as a checker
    #And the checker click Inward Payment processing in homepage
    And the checker click Realtime Payment Reversal Approval under Inward payment processing field

  @RealtimePaymentReversalCheckerVerificationScreen12
  Scenario: Checker select Approve option for reversal payment request approval
    When Checker click the edit icon of the request
    And Checker click Approve button of the request
    Then Approve option selected successfully

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker select Reject option without entering remarks for reversal payment request approval
    When Checker click the edit icon of the request
    And Checker click Reject button of the request
    And Click reject without remarks in confirmation screen
    Then Error message will be displayed

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker select Approve option with entering remarks for reversal payment request approval
    When Checker click the edit icon of the request
    And Checker click Approve button of the request
    And Click Approve by entering remarks in the confirmation screen
    Then Approve option selected successfully

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker select Reject option with entering remarks for reversal payment request approval
    When Checker click the edit icon of the request
    And Checker click Reject button of the request
    And in confirmation screen entering remarks click Reject
    Then Reject option selected successfully

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker should able to view the History
    When Checker click the edit icon of the request
    And Checker click History button of the request
    Then User view the history

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker navigates to History and select Approve option for reversal payment request approval
    When Checker click the edit icon of the request
    And Checker click History button of the request
    And Checker click Approve button of the request
    Then Approve option selected successfully

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker navigates to History and select Reject option without entering remarks for reversal payment request approval
    When Checker click the edit icon of the request
    And Checker click History button of the request
    And Checker click Reject button of the request
    And Click reject without remarks in confirmation screen
    Then Error message will be displayed

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker navigates to History and select Approve option with entering remarks for reversal payment request approval
    When Checker click the edit icon of the request
    And Checker click History button of the request
    And Checker click Approve button of the request
    And Click Approve by entering remarks in the confirmation screen
    Then Approve option selected successfully

  @RealtimePaymentReversalCheckerVerificationScreen
  Scenario: Checker navigates to History and select Reject option with entering remarks for reversal payment request approval
    When Checker click the edit icon of the request
    And Checker click History button of the request
    And Checker click Reject button of the request
    And in confirmation screen entering remarks click Reject
    Then Reject option selected successfully
