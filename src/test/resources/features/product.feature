Feature: Search a product
    Given User is logged in


  Scenario: Verify that the user can able to search a product
    Given the user navigates to the home page
    When the user enter the product name
    Then the product results should be displayed

  Scenario:Verify user can able to search invalid product
    Given the user navigates to the home page
    When the user enter invalid product name
    Then the user able the get invalid results


  Scenario: Verify user search chocolate gift hamper product
    Given the user navigates to the home page
    When the user enter chocolate gift hamper product
    Then the product chocolate gift hamper will be displayed

  Scenario: Verify user search panda teddy product
    Given the user navigates to the home page
    When the user enter panda teddy product
    Then the panda teddy product will displayed



  Scenario: Verify user search  bag product
    Given the user navigates to the home page
    When the user enter bag product
    Then the bag product will displayed







