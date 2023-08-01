let employee = {
base : 40000,
overTime : 40,
overTimeRate : 200,
totSalary : function()
{
return (this.base + (this.overTime * this.overTimeRate));
}

}

document.writeln("the total salary is " +employee.totSalary());