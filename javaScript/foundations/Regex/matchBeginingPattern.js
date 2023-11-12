// carrot character   without a square bracket is used for begining string
// carrot caharcter within square bracket is used for negation

let sentence = "Cal and Ricky both like Racing";
let regex = /^cal/ig;
let result = regex.test(sentence);
console.log(result); // true

sentence = "Ricky and cal both like Racing";
result = regex.test(sentence);
console.log(result); // false