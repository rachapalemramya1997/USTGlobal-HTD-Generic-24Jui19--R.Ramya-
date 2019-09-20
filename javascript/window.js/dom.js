let pElement = document.getElementById('demo');
console.log(pElement);
pElement.textContent = 'this is new p tag';
let divElements = document.getElementsByClassName('blue');
console.log(divElements);
let pElements = document.getElementsByTagName('p');
console.log(pElements);
let nameElements = document.getElementsByName('ramya');
console.log(nameElements);
let blueclasselements = document.querySelector('#demo');
console.log(blueclasselements);
let demoElement = document.querySelectorAll('blue');
console.log(demoElement);
let buttonElement = document.createElement('button');
buttonElement.textContent = 'Click Me';
console.log(buttonElement);
document.body.appendChild(buttonElement);
let spanEle = document.getElementById('spanid');
spanEle.style.color = 'pink';
let buttonElement1 = document.getElementById('buttonEle');
//buttonElement1.className = 'add';
// buttonElement1.classList='add add1';
document.getElementById('tableid').innerHTML=`<table>
    <tr>
        <td>Name</td>
        <td>Age</td>
    </tr>
    <tr>
        <td>asu</td>
        <td>20</td>
    </tr>
    <tr>
        <td>ramya</td>
        <td>21</td>
    </tr>
    <tr>
        <td>priya</td>
        <td>19</td>
    </tr>
    <tr>
        <td>roopa</td>
        <td>22</td>
    </tr>
</table>`;
// document.getElementById('tableid').innerHTML = '<h1>hello</h1>';

let pElementData = document.getElementById('demo1');
//pElementData.style.color = 'Blue';
//pElementData.className = 'blue';
pElementData.classList = 'blue fonts';