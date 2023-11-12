// wild card character \s used for matching white spaces

let sentence = "Whitespace is important in separating words";
let regex = /\s/g;
let result = sentence.match(regex);
console.log(result);

// wild card character \S (upper case) used for matching non-whitespaces

sentence = "Whitespace is important in separating words";
regex = /\S/g;
result = sentence.match(regex);
console.log(result);