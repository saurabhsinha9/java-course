
var NewWin;
var counter=0;
var ID;

function openAlert(){
	window.alert('You Clicked For Alert Box');
}

function openConfirm(){
	var temp=window.confirm('You Clicked For Confirm Box(YES?NO)');
	var msg=(temp)?'You Are Right':'You Are Wrong';
	window.status=msg;
	var shTxt=document.getElementById("showTxt");
	shTxt.innerHTML=msg;
}

function openPrompt(){
	var temp=window.prompt('Enter Your Name:','JLC');
	window.status=temp;
	var shTxt=document.getElementById("showTxt");
	shTxt.innerHTML=temp;
}

function restart(){
	counter=0;
	ID=window.setTimeout("Update();",1000);
}

function stop(){
	window.clearTimeout(ID);
}

function Update(){
	counter++;
	window.status="Count: ";+counter;
	document.getElementById("showTxt").innerHTML="Count: "+counter;
	ID=window.setTimeout("Update();",1000);
}

function openNewWin(){
	NewWin=window.open('WinTest.html', 'NewWin',
			'toolbar=no,status=no,width=300,height=300');
}

function closeMainWin(){
	window.close();
}

function closeNewWin(){
	NewWin.close();
}

function printpage(){
	self.print();
}

function formatTime(){
	var now=new Date();
	var hour=now.getHours();
	var min=now.getMinutes();
	var sec=now.getSeconds();
	var add;
	if(document.clock.jlctime[0].checked){
		if(min<=9){
			min="0"+min;
		}
		if(sec<=9){
			sec="0"+sec;
		}
		if(hour>12){
			hour=hour-12;
			add="p.m.";
		}else{
			hour=hour;
			add="p.m.";
		}
		if(hour==12){
			add="p.m.";
		}
		if(hour==00){
			hour="12";
		}
		document.getElementById("jlc").innerHTML='<h1>'+((hour<=9)?"0"+hour:
			hour)+":"+min+":"+sec+add;
	}
	if(document.clock.jlctime[1].checked){
		if(min<=9){
			min="0"+min;
		}
		if(sec<=9){
			sec="0"+sec;
		}
		if(hour<10){
			hour="0"+hour;
		}
		document.getElementById("jlc").innerHTML='<h1>'+hour+':'+min+':'+sec;
	}
	setTimeout("formatTime()", 1000);
}
window.onload=formatTime;