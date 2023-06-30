class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        rowIndex +=1
        if rowIndex==1:
            return [1]
        elif rowIndex == 2:
            return [1,1]
        else:
            dp = [[1],[1,1]] 
            temp = [1]
            for i in range(2,rowIndex):
                for j in range(1,i):
                    temp.append(dp[i-1][j-1]+dp[i-1][j])
                temp.append(1)
                dp.append(temp)
                temp = [1]
            return dp[rowIndex-1]
