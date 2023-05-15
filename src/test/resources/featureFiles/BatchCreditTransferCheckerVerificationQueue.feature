#Author: Dhamodharan.S
Feature: Batch Credit Transfer Checker Verification Queue

  #Narrative: As a checker i should be able to view all of the Batch credit transfer files that are initiated by maker, through this queue screen.
  #@URS_11050
  Background: 
    Given user logged in as a checker
    #And the checker click Outward Payment processing in homepage
    And the checker click Batch Credit Transfer Approval under Outward payment processing field

  @batchCreditTransferCheckerVerificationQueue1
  Scenario: Checker should able to view Message reference field in batch credit transfer approval queue
    Then checker view message reference field in batch credit transfer approval queue
    And checker view creation date time field in batch credit transfer approval queue
    And checker view number of transaction field in batch credit transfer approval queue
    And checker view total amount field in batch credit transfer approval queue
    And checker view settlement date field in batch credit transfer approval queue
    And checker view created by field in batch credit transfer approval queue
    And checker view source field in batch credit transfer approval queue
    And checker view file name field in batch credit transfer approval queue

  @batchCreditTransferCheckerVerificationQueue
  Scenario: Checker view details of batch credit transfer
    When checker click edit icon in batch credit transfer queue
    Then checker view details about that batch credit transfer
