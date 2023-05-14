#Author: Mukesh
#CreatedDate: 07/01/2023 #lastupdatedDate: 07/01/2023
#@URS_11340
Feature: As a bank user maker/checker I need a reconciliation summary report as per the attachment.
  So i can view the report in PDF/Excel/page view and shall print the report as based on need.

  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And maker clicks reconcilication summary report

  @public
  Scenario: Maker should able to download reconciliation PDF file
    When maker click PDF download
    Then the Reconciliation Summary Report pdf file will be downloaded successfully

  @public
  Scenario: Maker should able to download reconciliation Excel file
    And maker click EXCEL download
    Then the Reconciliation Summary Report excel file will be downloaded successfully
