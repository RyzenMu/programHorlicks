
//import { sayHi, sayHolla } from "./greetings.js"; // static import

//console.log(sayHi()); // static import

//dynamic import


if(true) {
const {sayHi, sayHolla } = await import('./greetings.js');

console.log(sayHi());

console.log(sayHolla());
}



