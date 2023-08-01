document.writeln("this is java Script");
document.writeln("\n");

/*let baseSalary = 30000;
let overTime = 10;
let rate = 20;

document.writeln("base Salary" +baseSalary, overTime,rate);*/

let employee ={
baseSalary : 30000,
overTime: 100,
rate : 200,
getWage : function()
{
return this.baseSalary + (this.overTime * this.rate);
}
};

document.writeln(employee.getWage());

