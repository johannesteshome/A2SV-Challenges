'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

function countingValleys(steps, path) {
    // Write your code here
let stepsArr = [];
stepsArr = path.split('');
let seaLevel = 0;
let count = 0;
for(let i=0; i<stepsArr.length; i++){
    if(stepsArr[i] ==='D' && seaLevel === 0){
        seaLevel--;
        for(let j=i+1; j<stepsArr.length; j++){
            if(stepsArr[j] ==='D'){
        seaLevel--;
        }
        else if(stepsArr[j] === 'U'){
        seaLevel++;
        if(seaLevel === 0){
            count++;
            i=j;
            break;
        }
        }
        }
        continue;
        
    }
    if(stepsArr[i] ==='D'){
        seaLevel--;
    }
    else{
        seaLevel++;
    }
    
    
}
return count;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const steps = parseInt(readLine().trim(), 10);

    const path = readLine();

    const result = countingValleys(steps, path);

    ws.write(result + '\n');

    ws.end();
}
