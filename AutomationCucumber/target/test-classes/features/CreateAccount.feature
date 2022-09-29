Feature: Create Account

  @CreateAccount

  Scenario Outline: Account Invalid
    Given User is on AutomationPractice page
    When User click sing in.
    Then User submits invalid <email>
    Then User validates error <message>

    Examples:
      | email        |  | message                |
      | invalidEmail |  | Invalid email address. |

  Scenario Outline: Create Account Valid
    Given User is on AutomationPractice page
    When User click sing in.
    Then User submits valid <Email>
    Then User log in create an account page.

    Examples:
      | Email                        |
      | roberto.bertrand@hotmail.com |


  Scenario Outline: Create An Account
    Given User is on AutomationPractice page
    When User click sing in.
    Then User log in create an account page.
    And User provides personal information <FirstName>, <LastName>, <PasswordPI> and date of birth <days>, <months>, <years>
    And User provides address information <FirstName>, <LastName>, <Company>, <Address>, <Address2>, <City>, <State>, <ZipCode>, <Country>, <AdditionalInfo>, <Phone>,<MobilePhone>, <Alias>
    Then User submit personal information and create an account
    Examples:
      | Email                        |  | FirstName | LastName |  | PasswordPI |  | days |  | months |  | years |  | Company  |  | Address            |  | Address2                         |  | City          |  | State    |  | ZipCode |  | Country |  | AdditionalInfo |  | Phone      |  | MobilePhone |  | Alias      |
      | roberto.bertrand@hotmail.com |  | firstname | lastName |  | passwordPi |  | 5    |  | 7      |  | 1996  |  | Hexaware |  | Potomac Foundation |  | 618 WestwoodCenter Dr Suite #300 |  | Tysons Corner |  | Virginia |  | 22182   |  | USA     |  | Hello          |  | 6699838822 |  | 6691999751  |  | Hexawarian |