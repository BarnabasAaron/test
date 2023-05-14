#Author:Mukeshvb
Feature: As a Business user, I need a screen to configure various charges applicable to NPSS. This charges would be our charges or cb charges.
  So that, I can configure the required charges using this screen. System will claim the charges automatically from customer accordingly

  #@URS_12151 @URS_12194 @URS_13022 
  Background: 
    Given The user has logged in as Maker
    And select Setting from side menu
    And click on NPSS Charge Configuration

  @case1 
  Scenario Outline: Configure the Realtime message type in outward payment type for Default Charge
    When selects "Realtime" in message type
    And Selects "outward" in payment flow type
    And select "<checkbox>" field and click on submit button
    Then Save the result displayed in the toast msg

    Examples: 
      | checkbox          |
      | Accept            |
      | Reject            |
      | Accept and Reject |

  @case2
  Scenario Outline: Configure the Realtime message type in inward payment type for Default Charge
    When selects "Realtime" in message type
    And Selects "inward" in payment flow type
    And Enters Card and IBAN charges
    And select "<checkbox>" field then click on submit button
    Then Save the result displayed in the toast msg

    Examples: 
      | checkbox          |
      | Accept            |
      | Reject            |
      | Accept and Reject |

  @case3
  Scenario Outline: Configure the Reversal message type in outward payment type for Default Charge
    When selects "Reversal" in message type
    And Selects "outward" in payment flow type
    And select "<checkbox>" field and then click on submit button
    Then Save the result displayed in the toast msg

    Examples: 
      | checkbox          |
      | Accept            |
      | Reject            |
      | Accept and Reject |

  @case4
  Scenario Outline: Configure the Reversal message type in inward payment type for Default Charge
    When selects "Reversal" in message type
    And Selects "inward" in payment flow type
    And Enters Card and IBAN charges
    And select "<checkbox>" field then click on submit button
    Then Save the result displayed in the toast msg

    Examples: 
      | checkbox          |
      | Accept            |
      | Reject            |
      | Accept and Reject |

  @case5 @testruntest
  Scenario Outline: Configure the BatchCreditTransfer message type in outward payment type for Default charge
    When selects "Batchcredittransfer" in message type
    And Selects "Outward" in payment flow type
    And Enters Card and IBAN charges
    And select "<checkbox>" field then click on submit button
    Then Save the result displayed in the toast msg

    Examples: 
      | checkbox          |
      | Accept            |
      | Reject            |
      | Accept and Reject |
