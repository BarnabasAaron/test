#Author:Mukeshvb
Feature: As a maker
  I want to add new classwise charges for collecting charges from corporate ,so that process the file (SIF,rfr).

  #@URS_13018 @URS_13019  @URS_13020  @URS_13021 @URS_13023
  Background: 
    Given The user has logged in as Maker
    And select Setting from side menu
    And click on NPSS Charge Configuration
    And Click on Custom Charge tab

  @case1 @PostiveFlow
  Scenario Outline: Configure the Realtime message type in outward payment type for Custom charge
    When select "Realtime" in message type
    And Select "Outward" in	 payment flow type
    And Enter AccountType,CustomerId and AccountNumber
    And select "<Accept/reject>" dropdown value then click on submit button
    And Enters Card and IBAN charges
    And verify the created ChargeDescription name and click on submit button
    And verify the created Custom Charge is showing in the grid
    And Logout from maker
    And user logged in as checker
    And select Setting from side menu
    And click on NPSS Charge Configuration Approval
    And Verify the created role and permission details in grid and click on edit button
    And Enter the remarks and click on Approve button
    And Approved record should not show in the grid
    And Logout as checker
    And The user has loggedin as Maker
    And click setting button and select NPSS Charge configuration
    And switch to custom tab
    Then after checker approved the charge rule Verify the status changed to approved in grid

    #NOTE: Both is not possible since already data is there for the Both flow.
    Examples: 
      | Accept/reject |
      | Accept        |
      | Reject        |

  @case2 @updateflow
  Scenario: Update the Realtime message type in outward payment type for Custom charge
    When create a custom rule and approve the custom rule as checker
    And Verify the created role and permission detail in grid and click on edit button
    And update the Accountype,CustomerId,AccountNumber,Acceptreject,Card and IBAN values
    And verify the updated ChargeDescription name and click on update button
    And verify the updated Custom Charge is showing in the grid
    And Logout from maker
    And user logged in as checker
    And Verify the updated role and permission details in grid and click on edit button
    And Enter the remarks and click on Approve button
    And Checker Approved record should not show in the grid
    And Logout as checker
    And The user has log in as Maker
    And click setting button and select NPSS Charge configuration
    And switch to custom tab
    Then after checker approved the charge rule Verify the updated chargerule status changed to approved in grid

  @case3 @Deleteflow
  Scenario: Delete the Realtime message type in outward payment type for Custom charge
    When create a custom rule and approve the custom rule as checker
    And Verify the created role and permission detail in grid and click on edit button
    And click on delete button and enter remarks and confirm Delete in popup
    And verify the status changed to Checker action is pending in grid
    And Logout from maker
    And user logged in as checker
    And click setting button and select NPSS Charge configuration Approval
    And Verify the deleted role and permission details in grid and click on edit button
    And Enter the remarks and click on Approve button
    And Checker Approved record should not show in the grid
    And Logout as checker
    And The user has log in as Maker
    And click setting button and select NPSS Charge configuration
    And switch to custom tab
    Then after checker approved the deleted charge rule should not show in makers grid

  @case4 @Rejectflowfromchecker
  Scenario Outline: Reject the Realtime message type in outward payment type for Custom charge
    When select "Realtime" in message type
    And Select "Outward" in	 payment flow type
    And Enter AccountType,CustomerId and AccountNumber
    And select "<Accept/reject>" dropdown value then click on submit button
    And Enters Card and IBAN charges
    And verify the created ChargeDescription name and click on submit button
    And verify the created Custom Charge is showing in the grid
    And Logout from maker
    And user logged in as a checker
    And select Setting from side menu
    And click on NPSS Charge Configuration Approval
    And Verify the created role and permission details in grid and click on edit button
    And Enter the remarks and click on Reject button
    And Rejected record should not show in the grid
    And Logout as checker
    And The user has log in as Maker
    And click setting button and select NPSS Charge configuration
    And switch to custom tab
    Then after checker Rejected the charge rule Verify the Rejected record is showing in the makers grid

    #NOTE: Both is not possible since already data is there for the Both flow.
    Examples: 
      | Accept/reject |
      | Accept        |
      | Reject        |

  @case5 @historytabapprove
  Scenario Outline: Configure the Realtime message type in outward payment type for Custom charge and approve from history tab
    When select "Realtime" in message type
    And Select "Outward" in	 payment flow type
    And Enter AccountType,CustomerId and AccountNumber
    And select "<Accept/reject>" dropdown value then click on submit button
    And Enters Card and IBAN charges
    And verify the created ChargeDescription name and click on submit button
    And verify the created Custom Charge is showing in the grid
    And Logout from maker
    And user logged in as a checker
    And select Setting from side menu
    And click on NPSS Charge Configuration Approval
    And Verify the created role and permission details in grid and click on edit button
    And Switch to History tab and verify Change details and Workflow grid is displaying
    And Verify the created datas are showing in Change details grid
    And Enter the remarks and click on Approve button
    And Redirect back to Charge details tab
    And Approved record should not show in the grid
    And Logout as checker
    And The user has logged in as Maker
    And click setting button and select NPSS Charge configuration
    And switch to custom tab
    Then after checker approved the charge rule Verify the status changed to approved in grid

    #NOTE: Both is not possible since already data is there for the Both flow.
    Examples: 
      | Accept/reject |
      | Accept        |
      | Reject        |

  @case6 @Resetflow
  Scenario Outline: Reset the Realtime message type in outward payment type for Custom charge
    When select "Realtime" in message type
    And Select "Outward" in	 payment flow type
    And Enter AccountType,CustomerId and AccountNumber
    And select "<Accept/reject>" dropdown value then click on submit button
    And Enters Card and IBAN charges
    And Click on Reset button
    Then all the existing field values should get deleted

    Examples: 
      | Accept/reject |
      | Accept        |
      | Reject        |
