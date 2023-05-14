#Author:Barnabas
Feature: To configure the user configuration from Admin
#Narrative:As a maker i should be able to map the roles and department for the user.
#@URS_12203,@URS_12227



  Scenario: To configure user from Maker
    Given The user has logged in as Maker
    And selects the option to change Admin
    And selects settings from side menu
    And selects User Configuration in Settings
    And selects Roles menu
    And change toggle of "ConfigMaker"

  Scenario: To configure department from Maker
    Given The user has logged in as Maker
    And selects the option to change Admin
    And selects settings from side menu
    And selects User Configuration in Settings
    And selects Departments menu
    And change toggle of "Finance" in department
