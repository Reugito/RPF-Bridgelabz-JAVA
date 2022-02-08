var arr = [];
var largest = 0;
var secondLargNum = 0;
for (var i=1; i<=5; i++){
    var num = Math.floor(Math.random()*(999-100+1)+100);
    arr.push(num);
    if(num > largest){
        largest = num;
    }
}
for(let i = 0; i < arr.length; i++){
    if(secondLargNum < arr[i] && arr[i] != largest){
        secondLargNum = arr[i];
    }
}
console.log(arr, secondLargNum);