#Author: Dhamodharan.S
#Sprint_3
#USR_12198
#USR_12197
#USR_12196

Feature: As a maker, i need a screen to configure the template for accepting customized channel messages in csv, pipe delimited formats, excels etc. so that, system shall process the credit transfer based on the template configured.

  Background: 
    Given The user has logged in as Maker
    And Maker clicks settings
    And Maker clicks template configuration

  @test154
  Scenario: Maker configuring Batch Reverse template with message type, channel sorce and file then login as checker to approve
    When maker enter valid template name
    And maker selects "Batch Reverse" messasge type
    And maker selects Manual channel source
    And maker selects "EXCEL" format
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully

  @test554
  Scenario: Maker configuring Batch Reverse template with message type, channel sorce, file and header count then login as checker to reject
    When maker enter valid template name
    And maker selects "Batch Reverse" messasge type
    And maker selects Manual channel source
    And maker selects "CSV" format
    And maker enters header count
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Reject
    And in Confirmation Popup checker enters data under remarks to reject
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Batch Reverse template with message type, channel sorce, file and footer count then login as checker to approve
    When maker enter valid template name
    And maker selects "Batch Reverse" messasge type
    And maker selects Manual channel source
    And maker selects "EXCEL" format
    And maker enters footer count
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Batch Reverse template with message type, channel sorce, file, header and footer count then login as checker to reject
    When maker enter valid template name
    And maker selects "Batch Reverse" messasge type
    And maker selects Manual channel source
    And maker selects "CSV" format
    And maker enters header count
    And maker enters footer count
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Reject
    And in Confirmation Popup checker enters data under remarks to reject
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Batch Transfer template with message type, channel sorce and file then login as checker to approve
    When maker enter valid template name
    And maker selects "Batch Transfer" messasge type
    And maker selects Manual channel source
    And maker selects "EXCEL" format
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Batch Transfer template with message type, channel sorce, file and header count then login as checker to reject
    When maker enter valid template name
    And maker selects "Batch Transfer" messasge type
    And maker selects Manual channel source
    And maker selects "CSV" format
    And maker enters header count
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Reject
    And in Confirmation Popup checker enters data under remarks to reject
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Batch Transfer template with message type, channel sorce, file and footer count then login as checker to approve
    When maker enter valid template name
    And maker selects "Batch Transfer" messasge type
    And maker selects Manual channel source
    And maker selects "EXCEL" format
    And maker enters footer count
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Batch Transfer template with message type, channel sorce, file, header and footer count then login as checker to reject
    When maker enter valid template name
    And maker selects "Batch Transfer" messasge type
    And maker selects Manual channel source
    And maker selects "CSV" format
    And maker enters header count
    And maker enters footer count
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Reject
    And in Confirmation Popup checker enters data under remarks to reject
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Real Time Reverse template with message type, channel sorce and file then login as checker to approve
    When maker enter valid template name
    And maker selects "Real Time Transfer" messasge type
    And maker selects Manual channel source
    And maker selects "EXCEL" format
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Real Time Reverse template with message type, channel sorce, file and header count then login as checker to reject
    When maker enter valid template name
    And maker selects "Real Time Transfer" messasge type
    And maker selects Manual channel source
    And maker selects "CSV" format
    And maker enters header count
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Reject
    And in Confirmation Popup checker enters data under remarks to reject
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Real Time Reverse template with message type, channel sorce, file and footer count then login as checker to approve
    When maker enter valid template name
    And maker selects "Real Time Transfer" messasge type
    And maker selects Manual channel source
    And maker selects "EXCEL" format
    And maker enters footer count
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Real Time Reverse template with message type, channel sorce, file, header and footer count then login as checker to reject
    When maker enter valid template name
    And maker selects "Real Time Transfer" messasge type
    And maker selects Manual channel source
    And maker selects "CSV" format
    And maker enters header count
    And maker enters footer count
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Reject
    And in Confirmation Popup checker enters data under remarks to reject
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Batch Reverse template with message type, channel sorce, file, header, footer count with default values then login as checker to approve
    When maker enter valid template name
    And maker selects "Batch Reverse" messasge type
    And maker selects Manual channel source
    And maker selects "EXCEL" format
    And maker enters header count
    And maker enters footer count
    And maker enters value in their column while in active state
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully

  @test
  Scenario: Maker configuring Batch Reverse template with message type, channel sorce, file, header, footer count with default values with inactive state then login as checker to reject
    When maker enter valid template name
    And maker selects "Batch Reverse" messasge type
    And maker selects Manual channel source
    And maker selects "CSV" format
    And maker enters header count
    And maker enters footer count
    And maker enters value in their column while in inactive state
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Reject
    And in Confirmation Popup checker enters data under remarks to reject
    Then template configuration done successfully

  @test199
  Scenario: Maker configuring Batch Reverse template with message type, channel sorce and file then login as checker to approve and edit
    When maker enter valid template name
    And maker selects "Batch Reverse" messasge type
    And maker selects Manual channel source
    And maker selects "EXCEL" format
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully
    And Logout as checker
    And The user has logged in as Maker
    And Maker clicks settings
    And Maker clicks template configuration
    And maker selects that particular template which is approved by checker
    And maker selects "Batch Reverse" messasge type
    And maker clicks update button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully

  @test1996
  Scenario: Maker configuring Batch Reverse template with message type, channel sorce and file then login as checker to approve and delete
    When maker enter valid template name
    And maker selects "Batch Reverse" messasge type
    And maker selects Manual channel source
    And maker selects "EXCEL" format
    Then maker clicks submit button
    And Logout from maker
    And user logged in as a checker
    And Checker clicks settings
    And Checker clicks template configuration approval
    And Checker selects that particular template which is created by maker
    And Checker click Approve
    And Approve option will be selected successfully
    Then template configuration done successfully
    And Logout as checker
    And The user has logged in as Maker
    And Maker clicks settings
    And Maker clicks template configuration
    And maker selects that particular template which is approved by checker
    Then maker clicks delete button