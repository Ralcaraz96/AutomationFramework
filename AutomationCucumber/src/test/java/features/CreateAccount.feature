Feature: Create Account

  @Login

  Scenario Outline: Account Creation
    Given User is on AutomationPractice page
    When User click sing in.
    Then User submits invalid <email>
    Then User validates error <message>

    Examples:
      | email |  | message                |
      | invalidEmail  |  | Invalid email address. |