#Author: Mukesh
#CreatedDate: 10/01/2023
Feature: User can access the NPSS Landing Page

  Background: 
    Given user launch with valid NPSS URL

  @login123
  Scenario: Verify whether user can able to login with valid username and valid password
    When user login with valid username and valid password
    Then user can view NPSS homepage

  @login
  Scenario: Verify whether user cannot able to login with valid username and invalid password
    When user login with valid username and invalid password
    Then user gets error message

  @login
  Scenario: Verify whether user cannot able to login with invalid username and valid password
    When user login with invalid username and valid password
    Then user gets error message

  @login
  Scenario: Verify whether user cannot able to login with invalid username and invalid password
    When user login with invalid username and invalid password
    Then user gets error message

  @login
  Scenario: Verify whether user cannot able to login with null username and password
    When user login with null username and password
    Then user gets error message
   
   @login
  Scenario: Verify whether user can able to login as checker
 		When user login with valid checker username and password
 		Then user can view NPSS homepage
