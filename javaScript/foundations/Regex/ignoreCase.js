// i flag ignores case

let sentence = "FreeCodeCamp";
let regex = /freecodecamp/i;

let result = regex.test(sentence);

console.log(result);

// exmple 2

sentence = " My Bag is Black and my other bag is blue ";
regex = /black/i;
result = regex.test(sentence);
console.log("is black available ", result);