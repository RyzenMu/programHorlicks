
// Normally the regex is a greedy 
let sentence = 'titanic';
let regex = /t[a-z]*i/;
let result = sentence.match(regex);
console.log(result);

// to become lazy use ?
sentence = 'titanic';
regex = /t[a-z]*?i/;
result = sentence.match(regex);
console.log(result);

sentence = "<h1>Today is awesome </h1>";
regex = /<.*>/;
result = sentence.match(regex);
console.log(result);

sentence = "<h1>Today is awesome </h1>";
regex = /<.*?>/;
result = sentence.match(regex);
console.log(result);

