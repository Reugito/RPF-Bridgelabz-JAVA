var arr = [];
console.log("lenthOfArr = "+arr.length);

arr = [1, 2, 3, 4, 5];
console.log(arr)

console.log("-------------------------------concat method-------------------------")
arr = arr.concat([9,8]);
console.log(arr);
console.log("lenthOfArr = "+arr.length);

// UC for join method 
console.log("-------------------------------join method-------------------------")
arr = arr.join();
console.log("array after join method: "+arr)
console.log("type of arr:  "+typeof(arr));

console.log("-------------------------------pop method-------------------------")

arr = [1, 2, 3, 4, 5];
console.log("popped ele: "+arr.pop());

console.log("-------------------------------reverse method-------------------------")
arr.reverse()
console.log("reverce: "+arr);

console.log("-------------------------------slice method-------------------------")
console.log(arr.slice(0,3))

console.log("-------------------------------shift method-------------------------")
console.log(arr.shift())

console.log("-------------------------------unshift method-------------------------")
console.log(arr.unshift(5))
console.log(arr)

console.log("------------------------------- sort method-------------------------")
console.log(arr.sort())

console.log("------------------------------- index method-------------------------")
console.log("index of 4 is "+arr.indexOf(5))


