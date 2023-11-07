console.log("learning Modules");

import {sum as s2, sub as m2} from './calc.js';
import {sum as s3, sub as m3} from './calc1.js'

import {default as Name} from './whoAmI.js'

console.log(s2(13, 2));
console.log(m2(110, 5));


console.log(s3(13, 2, 10));
console.log(m3(110, 5, 10));

console.log(Name());
