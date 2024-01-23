#Author:kahlaoui marwa
Feature: OrangeHrm Login Page

Background:
Given : admin is on login page


  Scenario: Login With valid credantials
    When admin enter correct username"Admin" and correct password "admin123"
    Then admin is directed to the hompage that contains" Dashboard "

     Scenario: Login with wrong credentials 
    When admin enter correct username "Admin" and wrong password "Admin"
    Then admin is still on login page that contains message "Invalid credentials "
    