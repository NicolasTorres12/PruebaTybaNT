Feature: Registro de usuario y validacion de compra en el portal advantageonlineshopping

  Scenario Outline:Registro de usuario y validacion de compra en el apartado de "Popular Items"
    Given el usuario Nicolas ingresa a la pagina advantageonlineshopping
    When Se dirige al apartado de perfil para registrarse, una vez en la pagina de registro ingresa los datos solicitados
      | username   | email   | password   | confirmPassword   | fristName   | lastName   | country   | phoneNumber   | city   | address   | state   | postalCode   |
      | <username> | <email> | <password> | <confirmPassword> | <fristName> | <lastName> | <country> | <phoneNumber> | <city> | <address> | <state> | <postalCode> |
    And Selecciona el apartado de popular items, selecciona los productos que desea comprar y los agrega al carrito, una vez agregados al carrito se realiza el proceso de compra
      | cardNumber   | cVVnumber   | cardholderName   |
      | <cardNumber> | <cVVnumber> | <cardholderName> |

    Examples:
      | username        | email                   | password   | confirmPassword | fristName  | lastName | phoneNumber   | city      | address        | country    | state      | postalCode | cardNumber | cVVnumber | cardholderName |
      |randomtype   	|pruebatyda001@hotmail.com|	Colom2022@@|	Colom2022@@  |	pruebatyda|  torres  |	3229695222   | Bogota    |	Calle74 #QA-85|	Colombia   |	 Bogota	|110111	     |857496521458|145        |poruebatyda     |

