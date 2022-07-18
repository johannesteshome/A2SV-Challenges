intervals = [
  [2, 3],
  [8, 10],
  [1, 18],
];
let i = 0;
while (i < intervals.length - 1) {
  console.log("first loop");
  console.log(i);
  for (let j = i + 1; j < intervals.length; j++) {
    console.log("second loop");
    console.log(j);
    if (intervals[i][1] > intervals[j][0]) {
      if (
        intervals[i][0] < intervals[j][0] &&
        intervals[j][1] > intervals[i][1]
      ) {
        console.log(intervals[i][1]);
        console.log(intervals[j][1]);
        intervals[i][1] = intervals[j][1];
      } else if (
        intervals[i][0] > intervals[j][0] &&
        intervals[j][1] < intervals[i][1]
      ) {
        console.log(i);
        console.log(intervals[i][0]);
        intervals[i][0] = intervals[j][0];
        console.log(intervals[j][0]);
        console.log("redflag");
      } else if (
        intervals[i][0] > intervals[j][0] &&
        intervals[j][1] > intervals[i][1]
      ) {
        intervals.splice(i, 1);
        i = 0;
      }
      i = 0;
      console.log(i);
      console.log("op succeded");
      intervals.splice(j, 1);
      console.log(intervals);

      break;
    }
    if (j == intervals.length) {
      console.log("didnt find");
      i++;
    }
  }
  //   break;
}

console.log(intervals);
