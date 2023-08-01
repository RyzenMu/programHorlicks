
function displayOnPage(){

    let selectedRadio = document.getElementsByName("gender");

    let output = document.getElementById("output");

    console.log(selectedRadio);

    selectedRadio.forEach((gender) => {

        if(gender.checked){

            output.innerHTML = `${"You clicked " + gender.value }`
        };
        

    });


}