// match function returns the exact match in the string with an array
// returns only one result in an array

let sentence = " coding is a very good profeession, as coding consumes less energy and more thinking";
let regex = /coding/;
let result = sentence.match(regex);
console.log(result);
console.log(result[0]);
console.log(result[1]);


// Find more than one exact match
// g flag is used to find more than one match

sentence = "repeat1, repeat2, repeat3, repeat4";
regex = /repeat/g;
result = sentence.match(regex);
console.log(result);


// Find more than one match also with ignoring case
//using 2 flags -- i, g
sentence = "Twinkle, twinkle little star, uncle is a bunny poor";
regex = /twinkle/ig;
result = sentence.match(regex);
console.log(result);