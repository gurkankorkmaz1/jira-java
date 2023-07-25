Feature: Register Test

  Scenario Outline: Create An Account

    Given Navigate to Website
    And click Sing in button
    And type email"<Email>"
    And click on Create an Account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    Examples:
      | Email | firstname | lastname | password |
      |cony@hotmail.com|rick|morty|morty123|
      |clara1@gmail.com         |cant|kent |kale123  |