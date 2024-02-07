class Solution:
    def addBinary(self, a: str, b: str) -> str:
        res = 0
        for i in range(len(a)):
            res = res + int(a[len(a)-1-i])*2**i
        for i in range(len(b)):
            res = res + int(b[len(b)-1-i])*2**i
        result = ""
        if res==0:
            return "0"
        while res !=0:
            result+= str(res%2)
            res //=2
        result = "".join(reversed(result))
        return result