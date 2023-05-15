#Author: Dhamodharan.S
Feature: Inward Transaction Details Report Screen

  #Narrative: As a product owner I need a report to see all the inward Payment transaction details report and its process status
  #@URS_11051
  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And maker clicks Inward transaction details report

  @InwardTransactionDetailsReport
  Scenario: maker view the transaction details report between valid from date and valid to date
    When maker selects valid from date and valid to date
    And maker click view report
    Then the result will be displayed successfully

  @InwardTransactionDetailsReport
  Scenario: maker click the clear filter
    When maker click clear filter
    Then maker see null in from date and to date field

  @InwardTransactionDetailsReport
  Scenario: maker download the pdf document for transaction details report
    When maker selects valid from date and valid to date
    And maker click PDF download

  @InwardTransactionDetailsReport
  Scenario: maker download the excel document for transaction details report
    When maker selects valid from date and valid to date
    And maker click EXCEL download

  @InwardTransactionDetailsReport
  Scenario: maker add the another search filter
    When maker selects valid from date and valid to date
    And maker add the new search filter
    Then maker see search field name and operatior

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with debtor acc number
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Debtor Acc Number" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with debtor name and address
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Debtor name and address" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with creditor acc number
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Creditor Acc Number" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with creditor name
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Creditor name" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with creditor agent name
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Creditor agent name" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with transaction amount
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Transaction amount" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with transaction date
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Transaction date" in Select Name field
    And Selects "<Operator>" in Operator Field for transaction date
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator                  |
      | Less than and Equal to    |
      | Greater than and Equal to |
      | is Null                   |
      | is Not Null               |
      | Between                   |

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with transaction type
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Transaction type" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with posting reference number
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Posting reference number" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with payment reference number
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Payment reference Number" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with charge details
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Charge details" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with credit transfer status
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Credit transfer status" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field for credit transfer
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                                     |
      | Equal To     | Credit Transfer Status Equal To Search     |
      | Not Equal to | Credit Transfer Status Not Equal To Search |

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with state
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "State" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with mode
    When maker selects valid from date and valid to date
    And maker add the new search filter
    And selects "Mode" in Select Name field
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search            |
      | Equal To     | Mode Equal To     |
      | Not Equal to | Mode Not Equal To |
      | Contains     | Mode Contains     |
      | Starts With  | Mode Starts With  |
      | Ends With    | Mode Ends With    |
      | is NUll      | No Search         |
      | is Not NUll  | No Search         |
