// carrot symbol ^ is used to negate a character

let sentence = " 3 blind mice ";
let regex = /[^0-9aeiou]/ig;
let result = sentence.match(regex);
console.log(result);