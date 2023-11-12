//positive look ahead
let quit = "qu";
let regex = /q(?=u)/;
let result = quit.match(regex);
console.log(result);

//negative look ahead
quit = "qt";
regex = /q(?!u)/;
result = quit.match(regex);
console.log(result);

//match 5 or more characters and 2 digits
let password = "astronaut";
regex = /(?=\w{5,}(?=\D*\d{2,}))/;
result = regex.test(password);
console.log(result);