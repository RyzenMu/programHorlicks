//match with single character using square bracket []

let sentence = " I donot have bug in my big bag";
let regex = /b[aiu]g/g;
let result = sentence.match(regex);
console.log(result);