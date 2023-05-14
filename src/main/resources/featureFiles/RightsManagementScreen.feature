#Author: Mukesh
Feature: Screen Rights Management Screen

  #Narrative: As an admin maker I need to configure screen access rights through this screen so that other users can access the required screens.
  #@URS_12233,@URS_12231,@URS_12229,@URS_12228
  @Scenario1 
  Scenario: Maker should able to create role & permission details and checker should able to approve the created role and permission details.
    Given The user has logged in as Maker
    And Switch to admin account and click on settings button
    And Click on Role registration button
    And Create Role and select Permission details
    And Click on Save button
    And verify created role is showing in grid
    And Logout from maker
    And user logged in as a checker
    And Switch to admin account and click on settings button
    And Click on Role Registration Approval button
    And By clicking on edit button Verify the created role and permission details
    Then Enter the remarks and click on Approve button

  @Scenario2
  Scenario: Maker should be able  to Update role & permission details and checker should able to verify and approve the created role and permission details.
    Given The user has logged in as Maker
    And Switch to admin account and click on settings button
    And Click on Role registration button
    And Update Role and Permission details which is approved by Checker
    Then Click on Save button
    And Logout from maker
    And user logged in as a checker
    And Switch to admin account and click on settings button
    And Click on Role Registration Approval button
    And By clicking on edit button Verify the updated role and permission details is displaying
    Then Enter the remarks and click on Approve button

  @Scenario3
  Scenario: Maker should able to delete role & permission details
    Given The user has logged in as Maker
    And Switch to admin account and click on settings button
    And Click on Role registration button
    And delete any Role and Permission details
    And Enter the remarks and click on delete button
    And Logout as maker
    And user logged in as a checker
    And Switch to admin account and click on settings button
    And Click on Role Registration Approval button
    And verify the deleted rolename and click on edit button
    And Enter the remarks and click on Approve button
    And Logout as checker
    And The user has logged in as Maker
    Then Verify deleted role is not displaying in grid

  @Scenario4 @runtestrun
  Scenario: Checker should able to Reject the created role & permission details
    Given The user has logged in as Maker
    And maker create a new role and permission details
    And user logged in as a checker
    And Switch to admin account and click on settings button
    And Click on Role Registration Approval button
    And By clicking on edit button Verify the created role and permission details
    And enter remarks and click on reject button
    And Logout as checker
    Then Login as maker and verify the reject role is showing in the grid
