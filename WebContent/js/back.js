
function calc(){
	good = document.getElementById("good").value;
	ng=document.getElementById("ng").value;
	 sum= parseInt(good)+parseInt(ng);
	 document.getElementById("goodrate").value=good/sum;
	 document.getElementById("ngrate").value=ng/sum;
}
window.onload = calc;

function jiance(){
    var spc = document.getElementById('spc').value;
    var thd = document.getElementById('thd').value;
    var oth = document.getElementById('oth').value;
    var ng = document.getElementById('ng').value;
    var sum1 = parseInt(spc)+parseInt(thd)+parseInt(oth);
    if(ng != sum1 ) {
    	 alert("bad数量与不良品不匹配");
    }
}
