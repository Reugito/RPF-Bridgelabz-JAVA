console.log ("1: Ft to inch 2:inch to ft 3-ft to meter 4-meter to ft ");
let select = parseInt(prompt("Enter the choice: "));
switch(select){
    case 1 :
        let feet = parseInt(prompt("Enter value in feet -> "))
        console.log("ft to inch = "+ feet*12);
        break;
    case 2 :
        let inch = parseInt(prompt("Enter length in inch -> "))
        console.log("inch ft  = "+ inch/12);
    case 3 :
        let feet = parseInt(prompt("Enter lenght in feet -> "))
        console.log("ft to meter = "+ feet/3.25);
    case 4 :
        let meter = parseInt(prompt("Enter value in meter -> "));
        console.log("meter to feet  =" + meter*3.28);
    default :
    console.log("please select correct oprtion");
}