// regex
// regular expression

let sentence = "The dog chased the cat";
let regex = /the/;

let myString = "Hello World";
let myreges = /Hello/;

let result = myreges.test(myString);
console.log(result);// returns true

// Example 2

let muSentence = " JavaScript is a Weired Language";
let result1 = /weired/.test(muSentence);// returns false -- case sensitive
let result2 = /Weired/.test(muSentence);
console.log(result1);
console.log(result2);

//Example 3

let waldoSentence = "The person waldo is hiding in this sentence";
let waldoRegex = /wal/
let result3 = waldoRegex.test(waldoSentence);
console.log("is waldo in the sentence ", result3 );
