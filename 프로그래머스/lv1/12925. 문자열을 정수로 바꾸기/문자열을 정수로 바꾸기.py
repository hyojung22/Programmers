def solution(s):
    if s[0] == '-':
        x = -int(s[1:])
    else:
        x = int(s)
    return x