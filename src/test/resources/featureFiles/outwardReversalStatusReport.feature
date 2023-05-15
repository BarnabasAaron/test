#Author: Mukesh
#CreatedDate: 06/02/2023 #lastupdatedDate: 06/02/2023
#Blocked
@US11377

Feature: As a business user, i need an option to view the the status of reversal in existing outward transaction status report. On initiation of reversal message status should be changed as reversal initiated and corresponding event log reflected in the report.
  On initiation of reversal message status should be changed as reversal initiated and corresponding event log reflected in the report.

  @public @case1
  Scenario: To check the outwardReversalStatusReport
    Given The user has logged in as Maker
    And Maker initiate realtime credit transfer quickpay payment processing
    And Maker need to be logged out
    And Checker logs into the portal
    And the checker clicks Realtime Credit Transfer Approval under Outward payment processing field
    And approve the quickpay payment which is initiated by maker
    And Checker need to be logged out
    And The user has logged in as Maker
    And maker clicks utility and click outward realtime payment reversal button
    And approve the payment reversal initiation
    And Maker need to be logged out
    And Checker logs into the portal
    And the checker click Inward Payment processing in homepage
    And the checker click Realtime Payment Reversal Approval under Inward payment processing field
    And Approve Payment Reversal Request Confirmation
    And Checker need to be logged out
    And The user has logged in as Maker
    When Maker selects Report from side menu
    And selects Outward Transaction Detail Report
    And click edit icon
    Then download the pacs007 record file
