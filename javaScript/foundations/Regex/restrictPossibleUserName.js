/*
1. if there are numbers they must be at the end.
2. letters can be lowercase or uppercase
3. atleast two character long
{min, max} specifies the number of time 
*/

let userName = "JackOfAllTrades";
// let regex = /[a-zA-z]+[0-9]$/;
let regex = /^[A-Za-z]{2, 8}\d*$/;
let result = regex.test(userName);
console.log(result);

userName = "jacks876";
// let regex = /[a-zA-z]+[0-9]$/;
regex = /^[A-Za-z]{2, 8}\d*$/;
result = regex.test(userName);
console.log(result);