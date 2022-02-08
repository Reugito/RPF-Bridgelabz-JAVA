

let prompt = require("prompt-sync")();

// ***************pincode************************

let pincodeRegex =  new RegExp("^[0-9]{6,6}$");
let pincode =  parseInt(prompt("enter number = "));

if (pincodeRegex.test(pincode)){
    console.log("entey matched please go ahead");
}else{
    console.log("please enter proper pincode")
}

// ***************alphabet is ************************


let pincodeRegex =  new RegExp("^[0-9]{6,6}$");
let pincode =  (prompt("enter number = "));

if (pincodeRegex.test(pincode)){
    console.log("entey matched please go ahead");
}else{
    console.log("please enter proper pincode")
}


let pincodeRegex =  new RegExp("^[0-9]{6,6}$");
let pincode =  (prompt("enter number = "));

if (pincodeRegex.test(pincode)){
    console.log("entey matched please go ahead");
}else{
    console.log("please enter proper pincode")
}

let pincodeRegex =  new RegExp("^[0-9\\s]{6,7}$");
let pincode =  (prompt("enter number = "));

if (pincodeRegex.test(pincode)){
    console.log("entey matched please go ahead");
}else{
    console.log("please enter proper pincode")
}


//************validate multiple other emails******************

let emialRegex = new RegExp("^abc[-.+]*[0-9]*@[a-z]*[.a-z][.a-z]*")
let userInput = prompt("enter email id here = ");
if (emialRegex.test(userInput)){
    console.log("you entered valid email id ");
}else{
    console.log("you entered  wrong email id ");
}


