const prompt = require("prompt-sync")();

let totalWorkingDays = 1;
let totalWorkingHrs = 0;
let employeeIsPresent = 1
let employeeIsPresentPartTime = 2;
let employeeIsAbsent = 0;
let empCheck;
let empHrs;
let dailyWage;
let totalWage = 0;
let dailyWageArray = [];
let dayAndwageMap =  new Map();
let numberOfDaysWorked = 0;

const getEmoloyeeHrs =  function(empCheck){
    switch(empCheck){
        case 1 :
            return empHrs = 8;
            break;
        case 2 :
            return empHrs = 4;
            break;
        case 0 :
            return empHrs = 0;
            break;
        default:
            return console.log("error");
        
    }
}
while((totalWorkingDays <= 20) && (totalWorkingHrs < 100)){

    empCheck =parseInt( Math.floor(Math.random()*3));
    empHrs = getEmoloyeeHrs(empCheck);
   
    dailyWage = 20*empHrs  ;
    dailyWageArray.push(dailyWage);

    dayAndwageMap.set(totalWorkingDays, dailyWage);

    totalWorkingDays++
    totalWorkingHrs = totalWorkingHrs + empHrs;
    
}

function findTotal (sum, dailyWage){
    return sum+dailyWage;

}
totalWage =  dailyWageArray.reduce(findTotal, 0);
console.log("the total wage of mont is : "+totalWage);

for ( let [key , value ] of  dayAndwageMap){
    console.log(" for day " +  key + " the wage is " + value )
}

console.log("the days when employee worked full time are as follows ")
for ( let [key , value ] of  dayAndwageMap){

    if (value == 160) {
        console.log("day "+key)
    }
}

console.log("the first occurance when employee worked full time is as follows ")
for ( let [key , value ] of  dayAndwageMap){

    if (value == 160) {
        console.log("day "+key)
        break;
    }
}

console.log("the part time wages are as follows ")
for ( let [key , value ] of  dayAndwageMap){

    if (value == 80) {
        console.log("day "+key)
    }
}

console.log("the number of days worked are as follows  ")
for ( let [key , value ] of  dayAndwageMap){

    if (value == 80 || value == 160) {
        numberOfDaysWorked ++;
    }
}
console.log("number of days employee worked is " + numberOfDaysWorked);


prompt("enter number = ")
