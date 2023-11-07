console.log("learning Modules.....")
const {sayHi, sayHolla} = await import('./greetings.js');

const promises = Promise.all([await import('./greetings.js'), 
            await import('./whoAmI.js'),
             await import('./calc.js')]);

// method 1
console.log(promises);

//method2
promises.then(result => {
    console.log(result);
    console.log(result[0].sayHi());
    console.log(result[0].sayHolla());
}) 


