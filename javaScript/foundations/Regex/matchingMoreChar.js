// matching same char more than once use +
// example s+ means s, ss, sss, ssss, sssss etx


let sentence = 'Mississsippssi';
let regex = /s+/ig;
let result = sentence.match(regex);
console.log(result);

//Matching Characters zero or more times use *

sentence = "gooooooooal";
regex = /go*/ig;
result = sentence.match(regex);
console.log(result); // returns gooooooooo

sentence = "jim garry";
regex = /go*/ig;
result = sentence.match(regex);
console.log(result); // returns g

sentence = "birds for dinosaurus";
regex = /go*/ig;
result = sentence.match(regex);
console.log(result); // returns null

sentence = "Aaaaaaaaaaaaaaaaaaarah";
regex = /Aa*/ig;
result = sentence.match(regex);
console.log(result); // returns gooooooooo


