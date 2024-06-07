

Feature: : Agregar productos al carrito en un sitio web validando precio y finalizando la compra

Yo como usuario de la página web
Quiero ingresar varios productos al carrito de compras
Para validar el precio total y finalizar la compra de los productos

@successful
Scenario: Finalizar la compra agregando y quitando productos del carrito de compras
Given "usuario" ingresa a la pagina web
When el usuario añade productos al carrito de compras
  And el usuario remueve productos del carrito de compras
Then el usuario finaliza la compra de los productos con el precio correcto




