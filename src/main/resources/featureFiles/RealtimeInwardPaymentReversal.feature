Feature:  Inward Real time payment reversal maker verification screen 
#Narration: As a business user I need a screen to verify inward Real time payment reversal request
#@URS_11412

#This feature file cannot be executed because the data is not known
Background: 
    
    Given The user has logged in as Maker
    And from home page the maker navigates to utility page
    And maker clicks Realtime Inward Payment Reversal
    

Scenario Outline: To verify the filter options with Credit Transfer Status 

		When maker selects Add filter
    And selects "Credit Transfer Status" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    Then the result will be displayed successfully
	
	Examples: 
      | Operator     | Search              |
      | Equal To     | Equal Search        |
      | Not Equal to | Not Equal To Search |
      | Contains     | Contains Search     |
      | Starts With  | Starts With Search  |
      | Ends With    | Ends With Search    |
      | is NUll      | No Search           |
      | is Not NUll  | No Search           |



Scenario Outline: To verify the filter options with Amount

		When maker selects Add filter
    And selects "Amount" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    Then the result will be displayed successfully
	
	 Examples: 
      | Operator                  | Search                                       |
      | Equal To                  | Transaction Equal To Search                  |
      | Not Equal to              | Transaction Not Equal To Search              |
      | Less Than                 | Transaction Less Than Search                 |
      | Greater Than              | Transaction Greater Than Search              |
      | Less Than and Equal To    | Transaction Less Than and Equal To Search    |
      | Greater Than and Equal To | Transaction Greater Than and Equal to Search |
      | is Null                   | No Search                                    |
      | is Not NUll               | No Search                                    |
      
      
 Scenario Outline: To verify the filter options with Transaction Date
    When maker selects Add filter
    And selects "Transaction Date" in Select Name field of Outward Screen
    And Selects Date "<Operator>" Operator in Operator Field
    Then the result will be displayed successfully

    Examples: 
      | Operator                  |
      | Less than and Equal To    |
      | Greater than and Equal to |
      | Between                   |
      | is Null                   |
      | is Not Null               |
      
      
 Scenario Outline: To verify the filter options with Created Date
    When maker selects Add filter
    And selects "Created Date" in Select Name field of Outward Screen
    And Selects Date "<Operator>" Operator in Operator Field
    Then the result will be displayed successfully

    Examples: 
      | Operator                  |
      | Less than and Equal To    |
      | Greater than and Equal to |
      | Between                   |
      | is Null                   |
      | is Not Null               |
      
 
Scenario Outline: To verify the filter options with Transaction Identifier 

		When maker selects Add filter
    And selects "Transaction Identifier" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    Then the result will be displayed successfully
	
	Examples: 
      | Operator     | Search              |
      | Equal To     | Equal Search        |
      | Not Equal to | Not Equal To Search |
      | Contains     | Contains Search     |
      | Starts With  | Starts With Search  |
      | Ends With    | Ends With Search    |
      | is NUll      | No Search           |
      | is Not NUll  | No Search           |

Scenario Outline: To verify the filter options with Debtor Agent ID

		When maker selects Add filter
    And selects "Debtor Agent ID" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    Then the result will be displayed successfully
	
	Examples: 
      | Operator     | Search              |
      | Equal To     | Equal Search        |
      | Not Equal to | Not Equal To Search |
      | Contains     | Contains Search     |
      | Starts With  | Starts With Search  |
      | Ends With    | Ends With Search    |
      | is NUll      | No Search           |
      | is Not NUll  | No Search           |
      
      
Scenario Outline: To verify the filter options with Creditor Agent ID

		When maker selects Add filter
    And selects "Creditor Agent ID" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    Then the result will be displayed successfully
	
	Examples: 
      | Operator     | Search              |
      | Equal To     | Equal Search        |
      | Not Equal to | Not Equal To Search |
      | Contains     | Contains Search     |
      | Starts With  | Starts With Search  |
      | Ends With    | Ends With Search    |
      | is NUll      | No Search           |
      | is Not NUll  | No Search           |



	
	
	
	
	
	