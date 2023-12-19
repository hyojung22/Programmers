from fractions import Fraction

def solution(numer1, denom1, numer2, denom2):
    answer = []
    fraction1 = Fraction(numer1, denom1)
    fraction2 = Fraction(numer2, denom2)
    result = fraction1 + fraction2
    answer.append(result.numerator)
    answer.append(result.denominator)

    return answer