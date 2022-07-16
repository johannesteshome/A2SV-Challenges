/**
 * @param {number[][]} points
 * @param {number} k
 * @return {number[][]}
 */
var kClosest = function(points, k) {
  
    let sortedDist = [];
   
    for(let i=0; i<points.length; i++){
        let num1 = parseInt(points[i][0]);
        let num2 = parseInt(points[i][1]);

let x = Math.pow(num1, 2);
let y = Math.pow(num2, 2);
        
        

let nums = x+y;
        
       
        sortedDist.push([Math.sqrt(nums), i]);
        
      
        
        
       
    }
    
    sortedDist.sort(function (a, b) {
  return a - b;
});
    
    sortedDist.sort(function (a, b) {
  if (a[0] === b[0]) {
    return 0;
  } else {
    return a[0] < b[0] ? -1 : 1;
  }
});

    
   
    let ksorted = [];
      for(let i=0; i<k; i++){
         ksorted.push(points[sortedDist[i][1]])
      }
        
        return ksorted;
};

