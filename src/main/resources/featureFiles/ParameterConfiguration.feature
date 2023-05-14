#Author: Dhamodharan.S
#Sprint_3
Feature: US_12230 As an admin user (Maker), I want to add configuration settings through this screen, and as an admin user (checker), I want to verify those configuration settings through this screen so that I can use the values throughout the WPS system process.

  Background: 
    Given The user has logged in as Maker
    And Maker switch NPSS to admin
    And Maker clicks settings
    And Maker clicks parameter configuration

  @test
  Scenario Outline: Maker can able to filter parameter configuration by system name
    When maker clicks filter option
    And maker enter valid system name
    And maker click search button
    Then maker can see parameter configuration based on system name

  @test
  Scenario Outline: Maker can able to filter parameter configuration by param name
    When maker clicks filter option
    And maker enter valid param name
    And maker click search button
    Then maker can see parameter configuration based on param name

  @test
  Scenario Outline: Maker can able to filter parameter configuration by param value
    When maker clicks filter option
    And maker enter valid param value
    And maker click search button
    Then maker can see parameter configuration based on param value

  @test
  Scenario Outline: Maker can able to filter parameter configuration by description
    When maker clicks filter option
    And maker enter valid description
    And maker click search button
    Then maker can see parameter configuration based on description

  @test
  Scenario Outline: Maker can able to filter parameter configuration by status
    When maker clicks filter option
    And maker enter valid status
    And maker click search button
    Then maker can see parameter configuration based on status

  @test
  Scenario Outline: Maker can able to disable system column by using setting option
    When maker clicks settings option
    And maker uncheck system toggle
    And maker click save button
    Then maker cannot see system row in param configration table

  @test
  Scenario Outline: Maker can able to disable param name column by using setting option
    When maker clicks settings option
    And maker uncheck param name toggle
    And maker click save button
    Then maker cannot see param name row in param configration table

  @test
  Scenario Outline: Maker can able to disable param value column by using setting option
    When maker clicks settings option
    And maker uncheck param value toggle
    And maker click save button
    Then maker cannot see param value row in param configration table

  @test
  Scenario Outline: Maker can able to disable description column by using setting option
    When maker clicks settings option
    And maker uncheck description toggle
    And maker click save button
    Then maker cannot see description row in param configration table

  @test
  Scenario Outline: Maker can able to disable status column by using setting option
    When maker clicks settings option
    And maker uncheck status toggle
    And maker click save button
    Then maker cannot see status row in param configration table
