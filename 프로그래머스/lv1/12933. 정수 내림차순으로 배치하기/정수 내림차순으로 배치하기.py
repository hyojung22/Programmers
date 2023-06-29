def solution(n):
    result = list(str(n))
    result.sort()
    result.reverse()
    return int(''.join(result))