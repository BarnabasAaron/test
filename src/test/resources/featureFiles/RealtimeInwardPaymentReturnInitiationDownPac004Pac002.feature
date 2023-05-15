#Author: Dhamodharan.S
Feature: US_11444 As a business user, I need APIs to view and initiate the return request against earlier received payment.
  So, that end customer/channel system can initiate the return request as needed.

  #working
  Background: 
    Given The user has logged in as Maker
    And from home page the maker navigates to utility page
    And maker clicks Realtime Inward Payment Return initiation

  @test
  Scenario Outline: Maker can able to view realtime inward payment return initiation list
    When maker selects valid from date and valid to date
    And maker clicks search button
    Then maker can see inward payment return list

  @test
  Scenario Outline: Maker can able to confirm realtime inward payment return initiation by selecting reason
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker selects the return reason for particular initaion list
    And maker clicks confirm return initiation button
    And maker clicks yes in return payment confirmation popup
    Then return initiation will be successfull

  @test
  Scenario Outline: Maker can able to confirm realtime inward payment return initiation by selecting reason and entering remarks
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker selects the return reason for particular initaion list
    And maker enters the remarks
    And maker clicks confirm return initiation button
    And maker clicks yes in return payment confirmation popup
    Then return initiation will be successfull

  @test
  Scenario Outline: Maker cannot able to confirm realtime inward payment return initiation by without selecting reason
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker not selects the return reason for particular initaion list
    And maker clicks confirm return initiation button
    Then return reason error will be displayed

  @dhamo
  Scenario: Maker can able to view and download PAC002 realtime inward payment return initiation in inward transaction details report
    When maker selects valid from date and valid to date
    And maker conforming the particular record in inward return initiation list
    And maker selects Report
    And maker clicks Inward transaction details report
    And maker select valid date
    And maker click view report
    Then the result will be displayed successfully
    And maker selects the eye icon
    And maker clicks download icon of "Pacs002 Payment Return Accepted Confirmation Recei" file
    Then the file will be downloaded successfuly

  @test
  Scenario: Maker can able to view and download PAC004 realtime inward payment return initiation in inward transaction details report
    When maker selects valid from date and valid to date
    And maker conforming the particular record in inward return initiation list
    And maker selects Report
    And maker clicks Inward transaction details report
    And maker select valid date
    And maker click view report
    Then the result will be displayed successfully
    And maker selects the eye icon
    And maker clicks download icon of "PACS004 Message Processing To CB" file
    Then the file will be downloaded successfuly
