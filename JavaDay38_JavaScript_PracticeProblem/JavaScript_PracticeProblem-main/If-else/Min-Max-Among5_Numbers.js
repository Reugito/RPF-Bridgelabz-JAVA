var minNum = 999;
var maxNum = 0;

for (var i=1; i<=5; i++){
    var num = Math.floor(Math.random()*(999-100+1)+100);
    if(minNum > num){
        minNum = num;
    }
    if(maxNum < num){
        maxNum = num;
    }
}
console.log(maxNum, minNum)
