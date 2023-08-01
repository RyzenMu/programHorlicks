document.writeln("Hello from tbody");

// getting an td
let age = document.getElementById("muruga-age").innerHTML;
document.writeln("The Age of Muruga is : \n", age);

age = parseInt(age) + 40;

document.write("\n The age of Kowshik is :", age);

document.getElementById("table-body").style.color = "cyan";

document.getElementById("muruga-age").style.color = "red";

function displayAge(){
    document.getElementById("output").innerHTML = age;
}

function displayAge1(){
    document.getElementById("output1").innerHTML = document.getElementById("musk-age").innerHTML;
}

function displayAge2(){
    document.getElementById("output2").innerHTML = document.getElementById("issac-age").innerHTML;
}

