const circle = {
radius : 5,
location : {
x : 13,
y : 11, 
z : 31
},
area : function(){
let a;
a = 3.14 * this.radius * this.radius;
return a;
},

}

document.writeln("The area of circle is " + circle.area());

