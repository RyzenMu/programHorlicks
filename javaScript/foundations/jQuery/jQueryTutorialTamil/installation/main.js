document.writeln("<h1>j Query from js</h1>");

$('#button1').click(function(){
    alert('bpb');
});

// hiding a button

$('#button2').hide();

// partial hiding a button

$('#button3').click(function(){
    document.querySelector('#button3').style.opacity = 0.2;
})