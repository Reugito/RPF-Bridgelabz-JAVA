arr = [0, -1, 2, -3, 1];
    function findTriplets(arr) {
        let found = false;
        for (let i = 0; i < arr.length - 2; i++) {
        for (let j = i + 1; j < arr.length - 1; j++) {
            for (let k = j + 1; k < arr.length; k++) {
                if (arr[i] + arr[j] + arr[k] === 0)
                {
                    console.log(arr[i], arr[j], arr[k]);
                    console.log();
                    found = true;
                    
                }
            }
        }
        if(found === false) {
            console.log(" not exist ");
        }
    }
   }
    findTriplets(arr);
