#Sample Feature Definition Template
@tag
Feature: Datadriver Testing for Form
  @tag2
  Scenario Outline: Title of your scenario outline
    Given User opens the chrome browser and navigate to training form website
    When User is Entering "<Firstname>", "<Lastname>", "<Email>"
    And User  Enter "<ContactNumber>", "<Message>"
    And  clicking on submit button
    Then All the data enter sucessfully

    Examples: 
      | Firstname  | Lastname | Email         | ContactNumber | Message |
      | Shivaji    | thorat   | 123@gmail.com |    9652964326 | Hello   |
      |nikhil      | Mane     | 354@gmail.com | 5425125598    | Chalo   |
      | pushapa    | thorat   | 365@gmail.com | 5248963214    | Bholo   |
      | shrisha    | shinde   | 336@gmail.com | 1236584789    | Khelo   |
      |ayush       | thorat   | 142#gmail.com | Andn@jsb25    | 85412   |