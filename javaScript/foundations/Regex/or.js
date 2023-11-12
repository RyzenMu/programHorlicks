let sentence = "James has a pet cat";

let regex = /dog|fish|cat|bird/ // or operator

let resu = regex.test(sentence);

console.log(resu);

// example 2

let sentence2 = "Crown is brown , Java is white, JavaScript is Pink, python is black";
regex = /c|go|python/;
resu = regex.test(sentence2);
console.log(resu);
