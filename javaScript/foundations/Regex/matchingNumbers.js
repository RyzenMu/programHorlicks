// wild card \d is used to match numbers

let sentence = "Your sandwich cost $5.00";
let regex = /\d/g;
let result = sentence.match(regex);
console.log(result);

// wild card \D is used to match non-numbers

sentence = "Your sandwich cost $5.00";
regex = /\D/g;
result = sentence.match(regex);
console.log(result);