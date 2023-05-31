<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Shop</title>
</head>
<body>
<h1 align="center">Інтернет-магазин по продажу комплектуючим для комп'ютера</h1><hr/>

<h2>Всі товари</h2>
<#list products as product>
    <div>
        <p><b>Назва: ${product.name}</b>, Опис: ${product.description}, Ціна:${product.price} грн., Місто: ${product.city}</p>
    </div>
</#list>
<hr>
<h3>Додати новий товар</h3>

<form action="/product/create" method="post">
    Назва товару: <input type="text" name="name"><br><br>
    Опис: <input type="text" name="description"><br><br>
    Ціна: <input type="number" name="price"><br><br>
    Місто: <input type="text" name="city"><br><br>
    <input type="submit" value="Додати товар"/>
</form>

<button type="button"><a href=/>Повернутись назад</a></button>
</body>
</html>








<!--region Description-->
<style type="text/css">
    body {background-color: gray;}
</style>
<!--endregion-->