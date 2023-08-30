@shop
Feature: Demo Web Shop Register User Test

  Scenario: User Register and Add to cart Test
    Given Navigate to web page url
    When Click to register link
    When Enter to form user info
    And Click to register button
    Then Verify to text message "Your registration completed"
    And Click to continue button
    When Enter the search box  "Computing and Internet"
    And Click to search box button
    And Add to cart product
    Then Verify add to cart message "The product has been added to your shopping cart"
  @DDF
  Scenario Outline: DDF User Register Test
    Given Navigate to web page url
    When Click to register link
    When The user enters "<sheetName>" and row number <rowNumber>
    And Click to register button
    Examples:
      | sheetName | rowNumber |
      | Test Data | 0         |
      | Test Data | 1         |
      | Test Data | 2         |
      | Test Data | 3         |
      | Test Data | 4         |
      | Test Data | 5         |