console.log("learning Modules");

import {sum, sub} from './calc.js';

import {default as Name} from './whoAmI.js'

console.log(sum(13, 2));
console.log(sub(110, 5));

console.log(Name());
