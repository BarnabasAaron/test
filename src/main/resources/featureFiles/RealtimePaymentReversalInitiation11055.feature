#Author: Dhamodharan.S / Mukesh
Feature: Realtime Payment Reversal Initiation Screen

  #Narrative:As a maker I need to initiate Real time payment reversal from an initiation screen, so that the reversal will be processed through NPSS system.
  #@URS_11055
  #@URS_11054
  Background: 
    Given The user has logged in as Maker
    And maker clicks utility and click outward realtime payment reversal button

  @public @case1
  Scenario: Check whether maker can able to initiate realtime reversal payment with valid reason
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker selects the reversal reason for particular reversal initaion list
    And maker clicks confirm reversal initiation button
    Then maker clicks yes in reversal payment confirmation popup

  @public @case1
  Scenario: Check whether maker can able to initiate realtime reversal payment without selecting valid reason
    When maker selects valid from date and valid to date
    And maker clicks search button
    And maker not selects the reversal reason for particular initaion list
    And maker clicks confirm reversal initiation button
    Then reversal reason error will be displayed
