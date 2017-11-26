<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8" />
    <title>Title</title>
    <style>
    html, body {
        height: 100%;
    }
div {

}
li {
    font-size: 1em;
}
h1, h2 {
    text-align:center;
    font-family:verdana;
    color:MediumSeaGreen;
}
.button {
    <!--background-color: #4CAF50; /* Green */-->
    border: none;
    color: white;
    <!--padding: 15px 32px;-->
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    width: 10%;
}
div.upper {
    width: 49.5%;
    border: 1px groove DodgerBlue;
    height: 70%;
    margin-bottom: 10px;
}
div.lower {
    width: 49.5%;
    border: 1px groove DodgerBlue;
    height: 20%;
}
div.inner#web {
    position: relative;
    top: 60%;
    left: 65%;
}
div.inner#customer {
    position: relative;
    top: 80%;
    left: 65%;
}
div.inner#opp {
    position: relative;
    bottom: 10%;
    left: 65%;
}
div.inner#action {
    position: relative;
    bottom: 10%;
    left: 65%;
}
#webContent {
    float: left;

}
#customers {
    float: right;

}
#opportunities {
    float: left;
    position: relative;
    top: 0 px;
}
#actions {
    float: right;
    position: relative;
    top: 0 px;
}
.ac {
    display: inline-block;
    vertical-align: bottom;
    width: 10%;
    left-margin: 5%;
    }
</style>
</head>
<body>
<h1>Customer adviser dashboard</h1>
<div class="upper" id="webContent">

    <h2>
        Web content
    </h2>
    <h3>Team members:</h3>
    <ul>
        <li>Viktor Danyliuk</li>
        <li>Maksym Kondratenko</li>
        <li>Artur Komendatskyi</li>
    </ul>
    <div class="inner" id="web">
        <form class="button" action="/web-content">
            <input type="submit" value="Go to Web Content Page" />
        </form>
    </div>
</div>
<div class="upper" id="customers">
    <h2>
        Customers
    </h2>
    <div class="inner" id="customer">
        <form class="button" action="/customers">
            <input type="submit" value="Go to Web Content Page" />
        </form>
    </div>
</div>
<div class="lower" id="opportunities">
    <h2>
        Opportunities
    </h2>
    <div class="inner" id="opp">
        <form class="button" action="/opportunities">
            <input type="submit" value="Go to Web Content Page" />
        </form>
    </div>
</div>
<div class="lower" id="actions">
    <h2>
        Actions
    </h2>
    <div class="ac">
        <form class="button">
            <input type="submit" value="Deposit" />
        </form>
    </div>
    <div class="ac">
        <form class="button">
            <input type="submit" value="Checkout" />
        </form>
    </div>
    <div class="ac">
        <form class="button">
            <input type="submit" value="Manage" />
        </form>
    </div>
</div>
</body>
</html>