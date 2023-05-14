#Author:Barnabas
Feature: To download the pacs002
  #Narrative:As a support/Business user, I need a screen to view the various states and status of messages processing, processing history. and  should be able to view  and download  the  Pacs 002 message in ISO formats  based on the  privilege configuration.
  #@URS_11481
  
  Scenario: To download the pacs002 file
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Mode" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And selects data "Mode Equal To" from search field
    And maker click view report
    Then the result will be displayed successfully
    And maker selects the eye icon
    And maker clicks download icon of "PACS002 Accept Message Received From CB" file
    Then the file will be downloaded successfuly

    