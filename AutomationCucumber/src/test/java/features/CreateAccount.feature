Feature: Create Account


  Scenario Outline: Account Invalid
    Given User is on AutomationPractice page
    When User click sign in.
    Then User submits invalid <email>
    Then User validates error <message>

    Examples:
      | email        |  | message                |
      | invalidEmail |  | Invalid email address. |

  Scenario Outline: Create Account Valid
    Given User is on AutomationPractice page
    When User click sign in.
    Then User submits valid <Email>

    Examples:
      | Email                    |
      | pitobertrand@hotmail.com |

  @CreateAccount

  Scenario Outline: Create An Account
    Given User is on AutomationPractice page
    When User click sign in.
    Then user fills the email from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User is in create an account page.
    And User provides personal information and address information from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User submit personal information and create an account
    Examples:
      | SheetName | RowNumber |
      | Hoja1     | 0         |