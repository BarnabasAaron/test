#Author: Mukesh
Feature: Batch Credit Transfer

  #Narrative: As a business user I need to upload Batch credit transfer from an initiation screen, so that the file will be processed through NPSS system.
  #@URS_11049,@URS_11057,@URS_11058
  Background: 
    Given The user has logged in as Maker
    And from home page the maker navigates to utility page
    And maker clicks Batch Credit Transfer upload

  @batchCreditTransfer
  Scenario: Maker should able to select option from the list of Template
    When maker selects option from Template field
    Then the selected template option displayed in the field

  @batchCreditTransfer
  Scenario: Error message should be displayed when entered invalid data under the Template field
    When Maker enters invalid template data and click submit button
    Then Template error message should be displayed below the field

  @batchCreditTransfer
  Scenario: Maker should able to select option from the list of Department
    When maker selects option from Department field
    Then the selected Department option displayed in the field

  @batchCreditTransfer
  Scenario: Error message should be displayed when entering invalid data under the Department field
    When Maker enters invalid department data and click submit button
    Then department error message should be displayed below the field

  @batchCreditTransfer
  Scenario: Maker should able to upload batch credit file
    When maker select Template and Department
    And maker uploads the file
    And click Submit
    Then the file will be submitted and the status will be displayed below

  @batchCreditTransfer
  Scenario: While uploading an null data in batch credit file the status should be displayed as failed
    When maker select Template and Department
    And the maker upload an invalid data file and click submit button
    Then the status of batch should be failed

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under DebitorAccountBAN
    When maker select Template and Department
    And maker uploads invalid data of DebitorAccountBan
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under MessageReference
    When maker select Template and Department
    And maker uploads invalid data of MessageReference
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Debtor Account
    When maker select Template and Department
    And maker uploads invalid data of Debtor Account
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Debtor Account Type
    When maker select Template and Department
    And maker uploads invalid data of Debtor Account Type
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Debtor Agent
    When maker select Template and Department
    And maker uploads invalid data of Debtor Agent
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Debtor Name
    When maker select Template and Department
    And maker uploads invalid data of Debtor Name
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Creditor Agent
    When maker select Template and Department
    And maker uploads invalid data of Creditor Agent
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Creditor account IBAN
    When maker select Template and Department
    And maker uploads invalid data of Creditor account IBAN
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Creditor Account
    When maker select Template and Department
    And maker uploads invalid data of Creditor Account
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Creditor Account Type
    When maker select Template and Department
    And maker uploads invalid data of Creditor Account Type
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Creditor Name
    When maker select Template and Department
    And maker uploads invalid data of Creditor Name
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Transaction Type
    When maker select Template and Department
    And maker uploads invalid data of Transaction Type
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Settled Amount
    When maker select Template and Department
    And maker uploads invalid data of Settled Amount
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Charge Bearer
    When maker select Template and Department
    And maker uploads invalid data of Charge Bearer
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Settlement Method
    When maker select Template and Department
    And maker uploads invalid data of Settlement Method
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: The status of the batch credit file should be failed when invalid data is entered under Settled Currency
    When maker select Template and Department
    And maker uploads invalid data of Settled Currency
    And click Submit
    Then Error message will be displayed and the file will not be uploaded

  @batchCreditTransfer
  Scenario: Maker selects Reset after the data has been entered
    When maker select Template and Department
    And maker uploads the file
    And click Reset
    Then Template,Department and the file uploaded will be reset successfully

  @batchCreditTransfer
  Scenario: Maker selects Reset only if Template is been selected
    When maker select Template
    And click Reset
    Then the Template data will be reset successfully

  @batchCreditTransfer
  Scenario: Maker selects Reset only if Department is been selected
    When maker select Department
    And click Reset
    Then the Department data will be reset successfully

  @batchCreditTransfer
  Scenario: Maker selects Reset only if uploads is been selected
    And maker uploads the file
    And click Reset
    Then the file field will be reset successfully

  @batchCreditTransfer123
  Scenario: Checker select Approve option from the confirmation message
    When maker submitted the batch credit file successfully
    And Checker logs into the portal
    And checker click Batch Credit Transfer approval under Outward Payment Processing menu in homepage
    And Checker click the edit icon for the batch
    And Checker click Approve
    Then Approve option will be selected successfully

  @batchCreditTransfer
  Scenario: Checker navigates to History and selects Reject without entering remarks
    When maker submitted the batch credit file successfully
    And from Checker Account the checker navigates to Batch Credit Transfer Approval Screen then click edit icon
    And Checker click Reject
    And in confirmation screen without entering remarks click Reject
    Then Error message should be displayed

  @batchCreditTransfer
  Scenario: Checker adds some remarks in confirmation message and then select Approve
    When maker submitted the batch credit file successfully
    And from Checker Account the checker navigates to Batch Credit Transfer Approval Screen then click edit icon
    And Checker click Approve
    And in Confirmation Popup the checker enters data under remarks to approve
    Then Approve option will be selected successfully

  @batchCreditTransfer
  Scenario: Checker adds some remarks in confirmation message and then Select Reject
    When maker submitted the batch credit file successfully
    And from Checker Account the checker navigates to Batch Credit Transfer Approval Screen then click edit icon
    And Checker click Reject
    And in Confirmation Popup the checker enters data under remarks to reject
    Then Reject option will be selected successfully

  @batchCreditTransfer
  Scenario: Checker should able to view the History
    When maker submitted the batch credit file successfully
    And from Checker Account the checker navigates to Batch Credit Transfer Approval Screen then click edit icon
    And Checker click History
    Then User can be able to view the history

  @batchCreditTransfer
  Scenario: Checker navigates to History and selects Approve from Confirmation Message
    When maker submitted the batch credit file successfully
    And from Checker Account the checker navigates to Batch Credit Transfer Approval Screen then click edit icon
    And Checker click History
    And Checker click Approve
    Then Approve option will be selected successfully

  @batchCreditTransfer
  Scenario: Checker navigates to History and selects Reject without entering remarks
    When maker submitted the batch credit file successfully
    And from Checker Account the checker navigates to Batch Credit Transfer Approval Screen then click edit icon
    And Checker click History
    And Checker click Reject
    And in confirmation screen without entering remarks click Reject
    Then Error message should be displayed

  @batchCreditTransfer
  Scenario: Checker navigates to History and adds some remarks in confirmation message and Select Approve
    When maker submitted the batch credit file successfully
    And from Checker Account the checker navigates to Batch Credit Transfer Approval Screen then click edit icon
    And Checker click History
    And Checker click Approve
    And in Confirmation Popup under History Page the checker enters data under remarks to approve
    Then Approve option will be selected successfully

  @batchCreditTransfer
  Scenario: Checker navigates to History and adds some remarks in confirmation message and Select Reject
    When maker submitted the batch credit file successfully
    And from Checker Account the checker navigates to Batch Credit Transfer Approval Screen then click edit icon
    And Checker click History
    And Checker click Reject
    And in Confirmation Popup under History Page the checker enters data under remarks to reject
    Then Reject option will be selected successfully
