document.writeln("Hello");
function circle(radius, x, y, z)
{
this.radius = radius;
this.x = x;
this.y = y;
this.z = z;
this.area = function(){
let a;
a = 3.14 * this.radius * this.radius;
document.writeln("the area is " + a);
}
}

let c1 = new circle(4, 8, 3, 9);

c1.area();