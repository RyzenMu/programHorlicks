
let myNUmber = new Number(9897);
let n = myNUmber.toString();
document.querySelector('p').innerHTML = myNUmber;
console.log(typeof(n));



let myNUmber1 = Number;
myNUmber1 = 245;

document.querySelector('.p1').innerHTML = myNUmber1;

// when the Number() constructor is called as a function, it will perform a type conversion

let a = "983";
let b = Number(a);
console.log("b" ,typeof(b));
let c = Number();
console.log(c);
let d = Number(true);
console.log("true" ,d);

// Math.ceil(), Math.floor() and Math.round() can be used for long strings.


// to find the maximum value of a number

console.log("maximum number :", Number.MAX_VALUE);

// it is unreliable to compare NaN values with simple equality test

let n3 = 'wer';
let n4 = NaN;
console.log(typeof(n3) == typeof(n4)); // returns false.so we can use isNAN() to verify.

console.log("Is Nan function", isNaN(n3));


// Negative Infinity is a constant

console.log(Number.NEGATIVE_INFINITY);
console.log(Number.POSITIVE_INFINITY);

// Numeric literals are expressed in Decimal, Hexadecimal and Octal Notation





