Feature: Application Login

  @Login


  Scenario Outline: Home page default login
    Given User is on AutomationPractice page
    When User click sign in.
    Then User logins using data from "<SheetName>" and <RowNumber>
    Then User is in Account page.
    Examples:
      | SheetName |  | RowNumber |
      | Hoja1     |  | 0         |

  Scenario Outline: 5. 'Search Product' feature
    Given User is on AutomationPractice page
    Then User move cursor over Women link and click on sub menu T-Shirts
    Then User Get Text of the first product displayed on the page
    Then User Search the text from "<SheetName>" and <RowNumber> of the product displayed and click search button
    Then User validates that same product is displayed on searched page

    Examples:
      | SheetName   |  | RowNumber |
      | ProductName |  | 0         |