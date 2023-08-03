
document.writeln("hello");
document.writeln("<br>");
function createCircle(radius, x, y, z)
{
return {
radius : radius,
area : function(){
let a;
a = 3.14 * this.radius * this.radius;
document.writeln("The area of circle is " + a);
}

}
}

let c1 = createCircle(2, 4, 5, 6);

c1.area();
document.writeln("<br>");
document.writeln(c1.radius);