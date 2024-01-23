#Author:kahlaoui marwa
Feature: Consultations des menus des home pages
Background:

 Given : Utilisateur est connecté avec le bon Username "Admin" et le bon password "admin123"
    


  Scenario Outline: acceder aux page de chaque menu de la page home
  
    When : utilisateur clique sur le menu "<menu>"
    Then : la page menu est afichée

    Examples: 
      | menu         |
      | admin        |
      
