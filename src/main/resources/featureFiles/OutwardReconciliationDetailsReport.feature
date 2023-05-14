#Author: Dhamodharan.S
#Sprint_3
Feature: US_12155 As a product owner I need a credit transfer reconciliation outward detail report.

  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu
    And maker clicks outward reconcilication details report

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Transaction Date
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Transaction Date" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field for transaction date
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator                  |
      | Less than and Equal To    |
      | Greater than and Equal to |
      | Between                   |
      | is Null                   |
      | is Not Null               |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Transaction Reference
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Transaction Reference" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                             |
      | Equal To     | Transaction Reference Equal To     |
      | Not Equal to | Transaction Reference Not Equal To |
      | Contains     | Transaction Reference Contains     |
      | Starts With  | Transaction Reference Starts with  |
      | Ends With    | Transaction Reference Ends with    |
      | is NUll      | No Search                          |
      | is Not NUll  | No Search                          |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Debtor Account
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Debtor Account" in Select Name field of Outward Screen
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

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Debtor Name
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Debtor Name" in Select Name field of Outward Screen
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

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Debtor Bank
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Debtor Bank" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                   |
      | Equal To     | DBNK Equal To Search     |
      | Not Equal to | DBNK Not Equal To Search |
      | Contains     | DBNK Contains Search     |
      | Starts With  | DBNK Starts With Search  |
      | Ends With    | DBNK Ends With Search    |
      | is NUll      | No Search                |
      | is Not NUll  | No Search                |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Creditor Account
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Creditor Account" in Select Name field of Outward Screen
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

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Creditor Name
    When maker selects valid from date and valid to date
    And maker selects Add filter
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

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Creditor Bank
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Creditor Bank" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                   |
      | Equal To     | CBNK Equal To Search     |
      | Not Equal to | CBNK Not Equal To Search |
      | Contains     | CBNK Contains Search     |
      | Starts With  | CBNK Starts With Search  |
      | Ends With    | CBNK Ends With Search    |
      | is NUll      | No Search                |
      | is Not NUll  | No Search                |

  @OutwardReconciliationDetailsReport
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

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Return Date
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Return Date" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field for transaction date
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator                  |
      | Less than and Equal To    |
      | Greater than and Equal to |
      | Between                   |
      | is Null                   |
      | is Not Null               |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Return Reference
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Return Reference" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                        |
      | Equal To     | Return Reference Equal To     |
      | Not Equal to | Return Reference Not Equal To |
      | Contains     | Return Reference Contains     |
      | Starts With  | Return Reference Starts with  |
      | Ends With    | Return Reference Ends with    |
      | is NUll      | No Search                     |
      | is Not NUll  | No Search                     |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Return Amount
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Return Amount" in Select Name field of Outward Screen
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

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with CB Reference
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "CB Reference" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                    |
      | Equal To     | CB Reference Equal To     |
      | Not Equal to | CB Reference Not Equal To |
      | Contains     | CB Reference Contains     |
      | Starts With  | CB Reference Starts with  |
      | Ends With    | CB Reference Ends with    |
      | is NUll      | No Search                 |
      | is Not NUll  | No Search                 |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with CB Return Reference
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "CB Return Reference" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                           |
      | Equal To     | CB Return Reference Equal To     |
      | Not Equal to | CB Return Reference Not Equal To |
      | Contains     | CB Return Reference Contains     |
      | Starts With  | CB Return Reference Starts with  |
      | Ends With    | CB Return Reference Ends with    |
      | is NUll      | No Search                        |
      | is Not NUll  | No Search                        |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with CB Recon Status
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "CB Recon Status" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                |
      | Equal To     | CB Recon Equal To     |
      | Not Equal to | CB Recon Not Equal To |
      | Contains     | CB Recon Contains     |
      | Starts With  | CB Recon Starts with  |
      | Ends With    | CB Recon Ends with    |
      | is NUll      | No Search             |
      | is Not NUll  | No Search             |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Core Reference
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Core Reference" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                      |
      | Equal To     | Core Reference Equal To     |
      | Not Equal to | Core Reference Not Equal To |
      | Contains     | Core Reference Contains     |
      | Starts With  | Core Reference Starts with  |
      | Ends With    | Core Reference Ends with    |
      | is NUll      | No Search                   |
      | is Not NUll  | No Search                   |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Core Return Reference
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Core Return Reference" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                             |
      | Equal To     | Core Return Reference Equal To     |
      | Not Equal to | Core Return Reference Not Equal To |
      | Contains     | Core Return Reference Contains     |
      | Starts With  | Core Return Reference Starts with  |
      | Ends With    | Core Return Reference Ends with    |
      | is NUll      | No Search                          |
      | is Not NUll  | No Search                          |

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Core Recon Status
    When maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Core Recon Status" in Select Name field of Outward Screen
    And Selects "<Operator>" in Operator Field
    And Enters data "<Search>" in search field of Outwards Screen
    And maker click view report
    Then the result will be displayed successfully

    Examples: 
      | Operator     | Search                  |
      | Equal To     | Core Recon Equal To     |
      | Not Equal to | Core Recon Not Equal To |
      | Contains     | Core Recon Contains     |
      | Starts With  | Core Recon Starts with  |
      | Ends With    | Core Recon Ends with    |
      | is NUll      | No Search               |
      | is Not NUll  | No Search               |
