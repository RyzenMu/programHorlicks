
let i = 0;
let j = 0;
Repeat : while (true)
{
    console.log("outer i ", i);
    i += 1;
    j = 1;
    while (true)
    {
        console.log("inner j ", j);
        j+=1;
        if (i ===5 && j === 5)
        {
            break Repeat
        }
        else if (j===5)
        {
            break;
        }
    }
}