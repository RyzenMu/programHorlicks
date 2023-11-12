

let sentence = "favorite";
let regex = /favou?rite/;
let result = regex.test(sentence)
console.log(result)

sentence = "favorite"; // british english
regex = /favou?rite/;
result = regex.test(sentence)
console.log(result)
