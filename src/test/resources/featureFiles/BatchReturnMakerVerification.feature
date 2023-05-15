#Author: Mukesh
Feature: Batch Return Maker Verification Screen
#Narrative: As a business user, I need see the inward messages in maker queue and need to verify the payment.
#@URS_11056
#This feature file is getting failed because there is no option to select in homepage 
  Background: 
    Given The user has logged in as Maker
   # And in home page the maker clicks Inward Payment Processing
    And maker clicks on Batch Return Maker Verification button
    And maker gets redirected to Batch Return Maker Verification screen

  @batchReturnMakerVerification
  Scenario: maker should click on the view button if records are present
    When maker identifies record
    Then the maker clicks on view button

  @batchReturnMakerVerification
  Scenario: maker should able to view no records found text if the records are not present
    When no records are present in Batch Return Maker Verification Queue
    Then maker should able to view the No record found text

  @batchReturnMakerVerification
  Scenario: clicking on view button redirects the maker to verification screen
    When maker identifies record
    And the maker clicks on view button
    Then verification screen will be displayed

  @batchReturnMakerVerification
  Scenario: maker should verify all the summary screen details are displayed
    When maker identifies record
    And the maker clicks on view button
    And verification screen will be displayed
    Then all the summary details will be displayed successfully

  @batchReturnMakerVerification
  Scenario: maker checks whether the verification details table is showing
    When maker identifies record
    And the maker clicks on view button
    And verification screen will be displayed
    Then verify Details table is displayed

  @batchReturnMakerVerification
  Scenario: maker clicks approve button when all details are present correctly
    When maker identifies record
    And the maker clicks on view button
    And verification screen will be displayed
    And click on approve button
    Then confirmation screen should be displayed

  @batchReturnMakerVerification
  Scenario: verify maker can able to reject verification details
    When maker checks record is presents
    And the maker clicks on view button
    And verification screen will be displayed
    And click on reject button
    Then confirmation screen should be displayed

  @batchReturnMakerVerification
  Scenario: verify maker can able to click history page
    When maker identifies record
    And the maker clicks on view button
    And verification screen will be displayed
    Then maker can click history tab

  @batchReturnMakerVerification
  Scenario: verify maker can able to view history page workflow logs
    When maker identifies record
    And the maker clicks on view button
    And verification screen will be displayed
    Then maker can click history tab and should view workflow logs
