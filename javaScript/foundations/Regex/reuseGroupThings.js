let repeatStr = "regex regex";
let repeatRegex = /(\w+)\s\1/;
repeatRegex.test(repeatStr); // returns true
repeatStr.match(repeatRegex) // Returns ["regex regex", "regex"]

let repeatNum = "42 42 42";
let rwgex = /^(\d+)\s\1\s\1$/;
let result = rwgex.test(repeatNum);

// use capture gropus for find and replace
let wrongText = "The sky is silver";
let silverRegex = /silver/;
wrongText.replace(silverRegex, "blue");
// returns the sky is blue

"Code Camp".replace(/(\w+)\s(\w+)/, '$2 $1');
// returns camp code

let hunText = "This sandwich is good.";
let fixRegex =/good/;
let replaceText = "okey-dokey";
result = hunText.replace(fixRegex, replaceText);
