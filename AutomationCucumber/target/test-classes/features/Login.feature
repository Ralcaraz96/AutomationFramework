Feature: Application Login

  @Login


  Scenario Outline: Home page default login
    Given User is on AutomationPractice page
    When User click sing in.
    Then User logins in with <username> and <password>
    Then User is in Account page.
    Examples:
      | username                |  | password   |
      | raul.al.go.96@gmail.com |  | MyPassword |

