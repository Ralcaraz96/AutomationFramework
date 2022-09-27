Feature: Create Account

  @Login

  Scenario Outline: Account Creation
    Given User is on AutomationPractice page
    When User click sing in.
    Then User submits invalid <email>
    Then User validates error <message>

    Examples:
      | email        |  | message                |
      | invalidEmail |  | Invalid email address. |

  @Login
  Scenario Outline: Account Creation
    Given User is on AutomationPractice page
    When User click sing in.
    Then User submits valid <EmailPI>
    Then User log in create an account page
    And User provides personal information <FirstName>, <LastName>, <EmailPI> , <PasswordPI> and date of birth <days> / <months> / <years>
    And User provides address information <FirstName>, <LastName>, <Company>, <Address>, <Address2>, <City>, <State>, <ZipCode>, <Country>, <AdditionalInfo>, <Phone>, <Alias>
    Then User submit personal information and create an account
    Examples:
      | FirstName | LastName |  | PasswordPI |  | EmailPI    |  | days |  | months |  | years |  | Company  |  | Address            |  | Address2                         |  | City          |  | State    |  | ZipCode |  | Country |  | AdditionalInfo |  | Phone      |  | Alias      |
      | firstname | lastname |  | passwordPi |  | validEmail |  | 5    |  | 7      |  | 1996  |  | Hexaware |  | Potomac Foundation |  | 618 WestwoodCenter Dr Suite #300 |  | Tysons Corner |  | Virginia |  | 22182   |  | USA     |  | Hello          |  | 6691998822 |  | Hexawarian |