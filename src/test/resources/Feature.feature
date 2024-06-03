Feature: Verify functionality of different modules of Saucedemo web application

  Scenario Outline: Open browser and enter url
    Given Open browser and enter <url> url
    When Click on username field and enter <password> username
    When Click on password field and enter <password> password
    #When Click on login button   
Examples:
|url|username|password|
|url|username|password|