let basic = 25000;
let overTime = 40;
let overTimeWage = 200;

function totalSalary()
{
return basic + (overTime * overTimeWage);
}

document.writeln(" The July Salary is " + totalSalary());