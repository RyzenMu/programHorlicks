// \w (lowercase) matches all char a-z A-Z 0-9 and _

let sentence = 'The five boxing wizards jump quickly.';
let regex =/\w/g; // also called shorthand w
let result = sentence.match(regex);
let len = result.length
console.log(result);
console.log(len);

// \W(upper case) not matches characters (i.e. matches empty spaces) with . (period)

regex = /\W/g; // also called shorthand W
result = sentence.match(regex);
len = result.length
console.log(result);
console.log(len);
