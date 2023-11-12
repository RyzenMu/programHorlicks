// wild card . operator means any letter


let humSentence = " I will hum a song";
let hugSentence = " i will hug my dear girl";
let huRegex = /hu./
let result = humSentence.match(huRegex);
let result1 = hugSentence.match(huRegex);

console.log(result);
console.log(result1);

// wild card .. operatorr

huRegex = /h../
result = humSentence.match(huRegex);
result1 = hugSentence.match(huRegex);

console.log(result);
console.log(result1);

// wild card ... operatorr

huRegex = /.../g;
result = humSentence.match(huRegex);
result1 = hugSentence.match(huRegex);

console.log(result);
console.log(result1);

//wild card . operator before a word

let sentence = ' I will run, i will fun, i love nun';
let regex = /.un/g;
result = sentence.match(regex);
console.log(result);