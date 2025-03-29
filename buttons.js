const home=document.getElementById("Home");
const historyy=document.getElementById("History");
const loan=document.getElementById("Loan");
const settings=document.getElementById("Settings");
const logout=document.getElementById("out");
const list=[home,historyy,loan,settings,logout];
let i=0;
function changecolor(event)
{
    for(let j=0;j<list.length;j++)
    {
        list[j].style.backgroundColor="rgb(223, 224, 224)";
    }
    event.currentTarget.style.backgroundColor=" rgb(176, 179, 179)";
}
for(let i=0;i<list.length;i++)
{
    list[i].addEventListener("click",changecolor);
}