#Author: Dhamodharan.S
Feature: US_11375 User can able to see the  beneficiary account details  based on the proxy ID and account number

  #working
  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report

  @test
  Scenario Outline: To verify Debitor account details based debitor account number
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Debtor Acc Number" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And Enters data "Equal Search" in search field of Outwards Screen
    And maker click view report
    Then the result displayed successfully

  @test
  Scenario Outline: To verify Debitor account details based proxy id
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Posting Reference Number" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And Enters data "Posting Reference Equal To Search" in search field of Outwards Screen
    And maker click view report
    Then the result displayed successfully

  @test
  Scenario Outline: To verify Creditor account details based creditor account number
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Creditor Acc Number" in Select Name field of Outward Screen
    And Selects equal "Equal To" operator in Operator Field
    And Enters data "CAN Equal To Search" in search field of Outwards Screen
    And maker click view report
    Then the result displayed successfully
