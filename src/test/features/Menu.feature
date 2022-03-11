Feature: menu
  As a user I should be able to navigate product using menu option
@menu
  Scenario Outline: Menu Navigation

    Given I am on the home page "https://www.next.co.uk"
    When  I mouse over on the header menu option "<Menu>"
    And   I click on the menu option
    Then  I should be able to see the appropriate page "<ExpectedTitle>"
    Examples:
    | Menu | ExpectedTitle |
    | MEN  | Mens Clothing |
    | WOMEN | Women's Clothing|
    | BEAUTY | Beauty         |


