Feature: To validate carrentals functionality of booking.com application

Scenario Outline: To validate carrentals functionality of carrentals skyscanner application
Given The user have to click carrentals button
When The user has to click return to different location
And The user should be fill "<pickup>" and "<drop>"
And The user should be provide start to end
Then The user have to click search button



Examples:
|pickup|drop|
|North Chennai|Tambaram|


