Feature: To validate flight functionality of booking.com application

Scenario Outline: To validate flights functionality of flights skyscanner application
Given The user have to click flights button
When The user has to click one way button
And The user should be enter "<From>" and "<To>"
And The user has to click cabin class and increase adult count
And The user should be provide depart and return
And The user has to click busness class
Then The user has to click search button


Examples:
|From|To|
|chennai|madurai|


