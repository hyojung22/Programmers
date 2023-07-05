def solution(n):
    answer = []
    n = str(n)
    n = list(n)
    n.reverse()
    for i in range(len(n)):
        answer.append(int(n[i]))
    return answer