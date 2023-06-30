class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows==1:
            return [[1]]
        elif numRows == 2:
            return [[1],[1,1]]
        else:
            dp = [[1],[1,1]] 
            temp = [1]
            for i in range(2,numRows):
                for j in range(1,i):
                    temp.append(dp[i-1][j-1]+dp[i-1][j])
                temp.append(1)
                dp.append(temp)
                temp = [1]
            return dp
