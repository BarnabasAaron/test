#Author:Barnabas
Feature: To configure the workflow rule
#Narrative:As an admin user, I need a configuration screen to configure the workflow for the files from channels.
#@URS_12148,@URS_12195

Background:
Given The user has logged in as Maker
And selects the option to change Admin
And selects settings from side menu
And selects Workflow Rule Configuration in Settings


Scenario:To add the workflow with one condition and approve from Checker
When Maker selects Application
And Maker selects Message Type
And Maker selects Event Type
And Maker Enters Rule Name
And maker selects Field 
And Maker selects Operator
And Maker selects Value
And selects is STP
And selects Stp status
And enters Sort Order
And selects submit
And verifies data in table
And maker selects logout
And Checker logs in
And Checker selects the option to change Admin
And selects settings from side menu
And selects Workflow Rule Configuration Approval in Seetings
And selects edit icon for the particular transaction
And verifies the data of configuration
And selects Approve

Scenario:To add the workflow with one condition and reject from Checker
When Maker selects Application
And Maker selects Message Type
And Maker selects Event Type
And Maker Enters Rule Name
And maker selects Field 
And Maker selects Operator
And Maker selects Value
And selects is STP
And selects Stp status
And enters Sort Order
And selects submit
And verifies data in table
And maker selects logout
And Checker logs in
And Checker selects the option to change Admin
And selects settings from side menu
And selects Workflow Rule Configuration Approval in Seetings
And selects edit icon for the particular transaction
And verifies the data of configuration
And selects Reject




Scenario:To add the workflow with two conditions and approve from Checker
When Maker selects Application
And Maker selects Message Type
And Maker selects Event Type
And Maker Enters Rule Name
And maker selects Field 
And Maker selects Operator
And Maker selects Value
And selects add button to add new clause
And selects and operator
And maker selects Amount in new clause
And maker selects Operator in new clause
And maker selects value in new clause
And selects is STP
And selects Stp status
And enters Sort Order
And selects submit
And verifies data in table
And maker selects logout
And Checker logs in
And Checker selects the option to change Admin
And selects settings from side menu
And selects Workflow Rule Configuration Approval in Seetings
And selects edit icon for the particular transaction
And verifies the data of configuration
And selects Approve




Scenario: To add the workflow with two conditions and reject from Checker
When Maker selects Application
And Maker selects Message Type
And Maker selects Event Type
And Maker Enters Rule Name
And maker selects Field 
And Maker selects Operator
And Maker selects Value
And selects add button to add new clause
And selects and operator
And maker selects Amount in new clause
And maker selects Operator in new clause
And maker selects value in new clause
And selects is STP
And selects Stp status
And enters Sort Order
And selects submit
And verifies data in table
And maker selects logout
And Checker logs in
And Checker selects the option to change Admin
And selects settings from side menu
And selects Workflow Rule Configuration Approval in Seetings
And selects edit icon for the particular transaction
And verifies the data of configuration
And selects Reject




