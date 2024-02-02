class Solution:
    def intToRoman(self, num: int) -> str:
        roman = {
            "I": 1,
            "IV": 4,
            "V": 5,
            "IX": 9,
            "X": 10,
            "XL": 40,
            "L": 50,
            "XC": 90,
            "C": 100,
            "CD": 400,
            "D": 500,
            "CM": 900,
            "M": 1000,
        }
        integer = dict()
        for key in roman.keys():
            integer[roman[key]] = key

        answer = ""
        for i in reversed(integer.keys()):
            while num >= i:
                answer += integer[i]
                num -= i
        return answer
