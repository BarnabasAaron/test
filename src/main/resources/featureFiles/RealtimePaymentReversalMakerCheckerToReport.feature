#Author: Dhamodharan.S
Feature: Realtime Payment Reversal Initiation, Checker Action and Report

  #@URS_13026
  #@URS_13028
  #@URS_13029
  #@URS_13030
  Background: 
    Given The user has logged in as Maker
    And maker clicks utility and click outward realtime payment reversal button

  @public @case1
  Scenario: Check whether maker can able to verify queue datas with details datas
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker verify the realtime paymenet reversal queue
    Then maker click edit button to verify details page with queue datas

  @public @case2
  Scenario: Check whether maker can able to initiate realtime reversal payment with valid reason
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker verify the realtime paymenet reversal queue
    And maker click edit button to verify details page with queue datas
    And maker clicks confirm reversal initiation button
    Then maker clicks yes in reversal payment confirmation popup

  @public @case3
  Scenario: Check whether maker can able to initiate realtime reversal payment with valid reason and verify with checker queue data
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker verify the realtime paymenet reversal queue
    And maker click edit button to verify details page with queue datas
    And maker clicks confirm reversal initiation button
    Then maker clicks yes in reversal payment confirmation popup
    And Logout from maker
    And user logged in as a checker
    And click reversal payment request approval in outward payment processing
    Then verify reversal checker queue datas with maker initiated payment data

  @public @case4
  Scenario: Check whether maker can able to initiate realtime reversal payment with valid reason and verify with details data
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker verify the realtime paymenet reversal queue
    And maker click edit button to verify details page with queue datas
    And maker clicks confirm reversal initiation button
    Then maker clicks yes in reversal payment confirmation popup
    And Logout from maker
    And user logged in as a checker
    And click reversal payment request approval in outward payment processing
    And verify reversal checker queue datas with maker initiated payment data
    Then verify reversal checker detail datas with maker initiated payment data

  @public @case5
  Scenario: Check whether maker can able to initiate realtime reversal payment with valid reason and checker need to approve
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker verify the realtime paymenet reversal queue
    And maker click edit button to verify details page with queue datas
    And maker clicks confirm reversal initiation button
    Then maker clicks yes in reversal payment confirmation popup
    And Logout from maker
    And user logged in as a checker
    And click reversal payment request approval in outward payment processing
    And verify reversal checker queue datas with maker initiated payment data
    And verify reversal checker detail datas with maker initiated payment data
    And Checker click Approve
    And Approve option will be selected successfully
    Then reversal payment approve done successfully

  @public @case6
  Scenario: Check whether maker can able to initiate realtime reversal payment with valid reason and checker need to reject
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker verify the realtime paymenet reversal queue
    And maker click edit button to verify details page with queue datas
    And maker clicks confirm reversal initiation button
    Then maker clicks yes in reversal payment confirmation popup
    And Logout from maker
    And user logged in as a checker
    And click reversal payment request approval in outward payment processing
    And verify reversal checker queue datas with maker initiated payment data
    And verify reversal checker detail datas with maker initiated payment data
    And Checker click Reject
    And in Confirmation Popup checker enters data under remarks to reject
    Then reversal payment reject done successfully

  @public @case7
  Scenario: Check whether maker can able to initiate realtime reversal payment with valid reason and checker need to approve and need to see datas in report
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker verify the realtime paymenet reversal queue
    And maker click edit button to verify details page with queue datas
    And maker clicks confirm reversal initiation button
    Then maker clicks yes in reversal payment confirmation popup
    And Logout from maker
    And user logged in as a checker
    And click reversal payment request approval in outward payment processing
    And verify reversal checker queue datas with maker initiated payment data
    And verify reversal checker detail datas with maker initiated payment data
    And Checker click Approve
    And Approve option will be selected successfully
    Then reversal payment approve done successfully
    And Logout as checker
    And The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report
    And maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Payment Reference Number" in Select Name field of Outward Screen
    And Selects "Equal To" in Operator Field
    And send the valid payment reference number
    And maker click view report
    And the result will be displayed successfully
    Then maker selects the eye icon
    And maker clicks download icon of "PACS007 Message sent to CB" file
    Then the file will be downloaded successfuly

  @public @case8
  Scenario: Check whether maker can able to initiate realtime reversal payment with valid reason checker need to reject and need to see datas in report
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker verify the realtime paymenet reversal queue
    And maker click edit button to verify details page with queue datas
    And maker clicks confirm reversal initiation button
    Then maker clicks yes in reversal payment confirmation popup
    And Logout from maker
    And user logged in as a checker
    And click reversal payment request approval in outward payment processing
    And verify reversal checker queue datas with maker initiated payment data
    And verify reversal checker detail datas with maker initiated payment data
    And Checker click Reject
    And in Confirmation Popup checker enters data under remarks to reject
    Then reversal payment reject done successfully
    And Logout as checker
    And The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report
    And maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Payment Reference Number" in Select Name field of Outward Screen
    And Selects "Equal To" in Operator Field
    And send the valid payment reference number
    And maker click view report
    And the result will be displayed successfully
    Then maker selects the eye icon
    And maker clicks download icon of "PACS002 Accept Message Received From CB" file
    Then the file will be downloaded successfuly
