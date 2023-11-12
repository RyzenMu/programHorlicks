let sentence = "Ohhhh no";
let regex = /Oh{3,} no/;
let result = regex.test(sentence);
console.log(result);

sentence = "Hzzzzzzah";
regex = /z{4,}/;
result = regex.test(sentence);
console.log(result);

sentence = "Timmmmber";
regex = /Tim{4}ber/;
result = regex.test(sentence);
console.log(result);