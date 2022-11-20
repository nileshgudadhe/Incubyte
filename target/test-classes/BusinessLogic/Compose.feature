Feature: Compose mail functionality

#Please note that as gmail is not supporting automation browser, I couldn't complete the test script. 
#Please refer this code for our BDD framework
#Code can be run from junit and result is stored in TestResults folder at project location

@SmokeTest
Scenario: User successfully logs in his account
When user opens "chrome" browser with exe as "E:\\chromedriver.exe"
And enter url as "https://mail.google.com/mail/"
And enter user name as "ngbhayya@gmail.com"
And click on Next button

