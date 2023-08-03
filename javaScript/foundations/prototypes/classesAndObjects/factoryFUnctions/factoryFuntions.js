document.writeln("Hello");
document.writeln("<br>");
const circle = function(radius, x, y, z){
let a ;
a = 3.14 * radius * radius;
document.writeln("The location of the circle is ", x + " "+ y+" "+ z);
document.writeln("<br>");
document.writeln("The area of circle is " + a);
}

circle(5, 9, 7, 8);
