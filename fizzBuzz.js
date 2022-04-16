var fizzBuzz = function(n) {
    let arrStr = [];
    for (let i = 1; i <= n; i++) {
        if (i % 3 === 0 && i % 5 === 0) {
            arrStr.push("FizzBuzz");
        } else if (i % 3 === 0) {
            arrStr.push("Fizz");
        } else if (i % 5 === 0) {
            arrStr.push("Buzz");
        } else {
            arrStr.push(i.toString());
        }
    }
    return arrStr;
};