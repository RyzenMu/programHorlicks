document.write("Using for loop")
document.write("<br>")
for (let i=0; i <=10; i++){
    if (i == 5 || i == 6){
        continue;
    }

    document.write(i);
    
}
document.write("<br>");
document.write("Using while loop")
document.write("<br>");


let q = 0;
while (q <= 10){
    q++;

    if (q == 5 || q == 6){
        continue;
    }
    document.write(q);    
    
}
document.write("<br>")
document.write("\n Using Do while Loop");
document.write("<br>");

let w = 0;
do{
    w++;
    if (w == 5 || w == 6){
        continue;
    }
    document.write(w);
    

}while(w <= 10);

document.write("<br>");
document.write("Using for each ");
document.write("<br>");

let arr = new Array(2, 4, 6);
document.write("Array is :" , arr);
document.write("<br>");
arr.forEach((item, index, arr) => {
    document.write(item*10 + " " +  index, arr);
    document.write("<br>");
});
