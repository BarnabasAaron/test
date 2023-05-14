#Author: Mukesh
Feature: Quick Pay Direct Entry Screen

  #Narrative As a maker user, I need to initiate a payment from this screen so that the payment message will sent to CB.
  #@URS_11052
  Background: 
    Given The user has logged in as Maker
    And from home page the maker navigates to utility page
    And maker clicks Realtime Credit transfer initiation Quick Pay

  @QuickPayDirectEntryScreen12
  Scenario: Maker should able to select option from the list of Department
    When maker selects option from Department dropdown
    Then the selected quickpay Department option displayed in the field

  @QuickPayDirectEntryScreen
  Scenario: Error message should be displayed when null data passed under the Department field
    When maker clicks initiate button without entering Department value
    Then Department error message should be displayed below the field

  @QuickPayDirectEntryScreen
  Scenario: Maker should able to enter valid Debtor account number
    When maker enters valid Debtor account number and clicks search button
    Then Debtor name,agent id and address should be prefilled

  @QuickPayDirectEntryScreen2
  Scenario: Error message should be displayed when null data passed under the Debtor account number
    When maker clicks search button without entering Debitor account number
    Then Debtor account toast message should be displayed

  @QuickPayDirectEntryScreen
  Scenario: Error message should be displayed when null data passed under the Debtor name
    When maker clicks initiate button without entering Debtor name
    Then Debtor name error message should be displayed

  @QuickPayDirectEntryScreen
  Scenario: Error message should be displayed when null data passed under the Debtor agent ID
    When maker clicks initiate button without entering Debtor agent ID
    Then Debtor agent ID error message should be displayed

  @QuickPayDirectEntryScreen
  Scenario: Maker should able to enter valid Creditor account number
    When maker enters valid Creditor account number and clicks search button
    Then Creditor name,agent id and address should be prefilled

  @QuickPayDirectEntryScreen
  Scenario: Error message should be displayed when null data passed under the Creditor account number
    When maker clicks search button without entering Creditor account number
    Then Creditor account toast message should be displayed

  @QuickPayDirectEntryScreen
  Scenario: Error message should be displayed when null data passed under the Creditor name
    When maker clicks search button without entering Creditor name
    Then Creditor name error message should be displayed

  @QuickPayDirectEntryScreen
  Scenario: Error message should be displayed when null data passed under the Creditor agent ID
    When maker clicks search button without entering Creditor agent ID
    Then Creditor agent ID error message should be displayed

  @QuickPayDirectEntryScreen
  Scenario: Maker should able to enter valid Transaction amount
    When maker enters Transaction amount
    Then Chargetype,Charge amount,VAT amount, Total amount and Amount in words should get prefilled

  @QuickPayDirectEntryScreen
  Scenario: Error message should be displayed when null data passed under the Transaction amount
    When maker clicks initiation button without entering Transaction amount
    Then Transaction amount error message should be displayed

  @QuickPayDirectEntryScreen
  Scenario: Error message should be displayed when null data passed under the Total amount
    When maker clicks initiation button without entering Total amount
    Then Total amount error message should be displayed

  @QuickPayDirectEntryScreen123
  Scenario: Maker should able to enter valid Department,Debtor,creditor,Transaction and Remarks details and confirm the payment
    When maker entered valid Department,Debtor,creditor,Transaction and Remarks details
    And Clicks initiation button
    And Click Confirm and proceed button in the confirmation screen
    Then payment will be succesfull

  @QuickPayDirectEntryScreen123
  Scenario: Maker should able to enter valid Department,Debtor,creditor and Transaction details and confirm the payment
    When maker entered valid Department,Debtor,creditor and Transaction details
    And Clicks initiation button
    And Click Confirm and proceed button in the confirmation screen
    Then payment will be succesfull

  @QuickPayDirectEntryScreen123 @testrunnnnnnnnn
  Scenario: Maker should able to enter Department,Debtor,creditor and Transaction details and able to reset the entered values
    When maker entered valid Department,Debtor,creditor,Transaction and Remarks details
    And Click Reset button
    Then all the fields value will get cleared
