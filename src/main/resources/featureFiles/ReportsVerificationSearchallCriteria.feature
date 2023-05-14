#Author: Dhamodharan.S & Mukeshvb
Feature: US_12146 As user (maker/checker/admin), report option in the system should be enhanced to include different search operations like equal, like, in,<=,>= etc. Also, Reports input fields should be text, dropdown list, date picker based on the data types of fields

  Background: 
    Given The user has logged in as Maker
    And Maker selects Report from side menu

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Debtor Acc Number
    When selects Outward Transaction Detail Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Creditor Acc Number
    When selects Outward Transaction Detail Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Transaction Amount
    When selects Outward Transaction Detail Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Transaction Type
    When selects Outward Transaction Detail Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Posting Reference Number
    When selects Outward Transaction Detail Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with State
    When selects Outward Transaction Detail Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionDetailsReport
  Scenario Outline: To verify the filter options with Mode
    When selects Outward Transaction Detail Report
    And maker selects valid from date and valid to date
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with debtor acc number
    When maker clicks Inward transaction details report
    And maker selects valid from date and valid to date
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with creditor acc number
    When maker clicks Inward transaction details report
    And maker selects valid from date and valid to date
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with transaction amount
    When maker clicks Inward transaction details report
    And maker selects valid from date and valid to date
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with transaction type
    When maker clicks Inward transaction details report
    And maker selects valid from date and valid to date
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with posting reference number
    When maker clicks Inward transaction details report
    And maker selects valid from date and valid to date
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with state
    When maker clicks Inward transaction details report
    And maker selects valid from date and valid to date
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

  @InwardTransactionDetailsReport
  Scenario Outline: maker verify the filter option with mode
    When maker clicks Inward transaction details report
    And maker selects valid from date and valid to date
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

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Debtor Acc Number
    When maker clicks outward reconcilication details report
    And maker selects valid from date and valid to date
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

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Creditor Acc Number
    When maker clicks outward reconcilication details report
    And maker selects valid from date and valid to date
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

  @OutwardReconciliationDetailsReport
  Scenario Outline: To verify the filter options with Transaction Amount
    When maker clicks outward reconcilication details report
    And maker selects valid from date and valid to date
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

  @InwardReconciliationDetailReport
  Scenario Outline: To verify the filter options with Debtor Acc
    When maker clicks Inward Reconciliation Detail Report
    And maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Debtor Account" in Select Name field
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

  @InwardReconciliationDetailReport
  Scenario Outline: To verify the filter options with Creditor Acc
    When maker clicks Inward Reconciliation Detail Report
    And maker selects valid from date and valid to date
    And maker selects Add filter
    And selects "Creditor Account" in Select Name field
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

  @InwardReconciliationDetailReport
  Scenario Outline: maker verify the filter option with transaction amount
    When maker clicks Inward Reconciliation Detail Report
    And maker selects valid from date and valid to date
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
      | Less Than and Equal To    | Transaction Less Than and Equal To Search    |
      | Greater Than and Equal To | Transaction Greater Than and Equal to Search |

  @OutwardTransactionSummaryReport
  Scenario Outline: To verify the filter options with Debtor Acc Number
    When selects Outward Transaction summary Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionSummaryReport
  Scenario Outline: To verify the filter options with Creditor Acc Number
    When selects Outward Transaction summary Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionSummaryReport
  Scenario Outline: To verify the filter options with Transaction Amount
    When selects Outward Transaction summary Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionSummaryReport
  Scenario Outline: To verify the filter options with Transaction Type
    When selects Outward Transaction summary Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionSummaryReport
  Scenario Outline: To verify the filter options with Posting Reference Number
    When selects Outward Transaction summary Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionSummaryReport
  Scenario Outline: To verify the filter options with State
    When selects Outward Transaction summary Report
    And maker selects valid from date and valid to date
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

  @OutwardTransactionSummaryReport
  Scenario Outline: To verify the filter options with Mode
    When selects Outward Transaction summary Report
    And maker selects valid from date and valid to date
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
