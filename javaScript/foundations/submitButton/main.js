function clickme(){

    selectedValue = document.querySelector('#IN1').value;

    let para = document.querySelector('p').innerHTML;

    // console.log(selectedValue);

    if (selectedValue == -1){
        alert('You must select an item first!...');
        console.log("You must select any one");
        para = " You must select one";
        console.log.log(para);

    }
    else {
        document.querySelector('#submit').click();
    }
}