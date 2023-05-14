#Author:Barnabas
Feature: Outward Transaction Detail Report Screen
#Narrative: As a product owner I need a report to see all the Outward Payment transaction details report  and its process status
#@URS_12192
  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And selects Outward Transaction Detail Report

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Debtor Acc Number
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Debtor Acc Number" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
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

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Creditor Acc Number
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Creditor Acc Number" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                  |
      | Equal To     | CAN Equal To Search     |
      | Not Equal to | CAN Not Equal To Search |
      | Contains     | CAN Contains Search     |
      | Starts With  | CAN Starts With Search  |
      | Ends With    | CAN Ends With Search    |
      | is NUll      | No Search               |
      | is Not NUll  | No Search               |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Debtor Name and Address
    When maker selects valid from date and valid to date
    And  maker selects Add filter
    And selects "Debtor Name and Address" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                  |
      | Equal To     | DNA Equal To Search     |
      | Not Equal to | DNA Not Equal To Search |
      | Contains     | DNA Contains Search     |
      | Starts With  | DNA Starts With Search  |
      | Ends With    | DNA Ends With Search    |
      | is NUll      | No Search               |
      | is Not NUll  | No Search               |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Creditor Name
    When maker selects valid from date and valid to date
    And  maker selects Add filter
    And selects "Creditor Name" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                            |
      | Equal To     | Creditor Name Equal To Search     |
      | Not Equal to | Creditor Name Not Equal To Search |
      | Contains     | Creditor Name Contains Search     |
      | Starts With  | Creditor Name Starts With Search  |
      | Ends With    | Creditor Name Ends With Search    |
      | is NUll      | No Search                         |
      | is Not NUll  | No Search                         |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Charge Details
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Charge Details" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                      |
      | Equal To     | Charge Details Equal To     |
      | Not Equal to | Charge Details Not Equal To |
      | Contains     | Charge Details Contains     |
      | Starts With  | Charge Details Starts With  |
      | Ends With    | Charge Details Ends With    |
      | is NUll      | No Search                   |
      | is Not NUll  | No Search                   |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Creditor Agent Name
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Creditor Agent Name" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                  |
      | Equal To     | CAG Equal To Search     |
      | Not Equal to | CAG Not Equal To Search |
      | Contains     | CAG Contains Search     |
      | Starts With  | CAG Starts With Search  |
      | Ends With    | CAG Ends With Search    |
      | is NUll      | No Search               |
      | is Not NUll  | No Search               |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Transaction Amount
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Transaction Amount" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
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

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Transaction Type
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Transaction Type" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                        |
      | Equal To     | Transaction Type Equal To     |
      | Not Equal to | Transaction Type Not Equal To |
      | Contains     | Transaction Type Contains     |
      | Starts With  | Transaction Type Starts With  |
      | Ends With    | Transaction Type Ends With    |
      | is NUll      | No Search                     |
      | is Not NUll  | No Search                     |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Posting Reference Number
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Posting Reference Number" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                                |
      | Equal To     | Posting Reference Equal To Search     |
      | Not Equal to | Posting Reference Not Equal To Search |
      | Contains     | Posting Reference Contains Search     |
      | Starts With  | Posting Reference Starts With Search  |
      | Ends With    | Posting Reference Ends With Search    |
      | is NUll      | No Search                             |
      | is Not NUll  | No Search                             |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Payment Reference Number
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Payment Reference Number" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                         |
      | Equal To     | Payment Reference Equal To     |
      | Not Equal to | Payment Reference Not Equal To |
      | Contains     | Payment Reference Contains     |
      | Starts With  | Payment Reference Starts with  |
      | Ends With    | Payment Reference Ends with    |
      | is NUll      | No Search                      |
      | is Not NUll  | No Search                      |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with State
    When maker selects valid from date and valid to date 
    And maker selects Add filter
    And selects "State" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search             |
      | Equal To     | State Equal To     |
      | Not Equal to | State Not Equal To |
      | Contains     | State Contains     |
      | Starts With  | State Starts With  |
      | Ends With    | State Ends With    |
      | is NUll      | No Search          |
      | is Not NUll  | No Search          |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Transaction Date
    When maker selects valid from date and valid to date
    And  maker selects Add filter
    And selects "Transaction Date" in Select Name field of Outward Screen
    And Selects Date "<Operator>" Operator in Operator Field
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator                  |
      | Less than and Equal To    |
      | Greater than and Equal to |
      | Between                   |
      | is Null                   |
      | is Not Null               |

  @OutwardTransactionDetailsReport123
  Scenario Outline: To verify the filter options with Status
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Status" in Select Name field of Outward Screen
    And Selects equal "<Operator>" operator in Operator Field
    And selects data "<Search>" from status search field
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     |  | Search                     |
      | Equal To     |  | Status Equal To Be Completed |
      | Not Equal to |  | Status Not Equal To Search |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Mode
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Mode" in Select Name field of Outward Screen
    And Selects equal "<Operator>" operator in Operator Field
    And selects data "<Search>" from search field
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     |  | Search            |
      | Equal To     |  | Mode Equal To     |
      | Not Equal to |  | Mode Not Equal To |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify whether the maker can able to view the report
    When maker selects "<Option>" from Group By
    And changes the date range
    And selects View Report
    Then the report will be displayed successfuly

    Examples: 
      | Option                 |
      | Group By First Option  |
      | Group By Second Option |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify whether the maker can able to download pdf
    When maker selects "<Option>" from Group By
    And changes the date range
    And selects View Report
    And selects Download as PDF
    Then the file will be downloaded successfuly

    Examples: 
      | Option                 |
      | Group By First Option  |
      | Group By Second Option |

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify whether the maker can able to download excel
    When maker selects "<Option>" from Group By
    And changes the date range
    And selects View Report
    And selects Download as Excel
    Then the file will be downloaded successfuly

    Examples: 
      | Option                 |
      | Group By First Option  |
      | Group By Second Option |
