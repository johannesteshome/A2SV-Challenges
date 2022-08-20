/**
 * @param {string} s
 * @return {number}
 */
var longestValidParentheses = function(s) {
  var max = 0;
  var len = s.length;
  var dp = Array(len).fill(0);
  var tmp = 0;
  var getNum = function (index) {
    return index >= 0 ? dp[index] : 0;
  };

  for (var i = 1; i < len; i++) {
    if (s[i] === ')') {
      if (s[i - 1] === '(') {
        dp[i] = getNum(i - 2) + 2;
      } else {
        tmp = i - dp[i - 1] - 1;
        if (tmp >= 0 && s[tmp] === '(') {
          dp[i] = dp[i - 1] + getNum(tmp - 1) + 2;
        }
      }
      max = Math.max(max, dp[i]);
    }
  }

  return max;
};
    
