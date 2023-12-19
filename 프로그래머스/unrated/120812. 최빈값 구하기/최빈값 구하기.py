def solution(array):
    if len(array) == 1:
        answer = array[0]
    else: 
        li = []
        for i in range(1000):
            li.append(array.count(i))
        maximum = max(li)
        if li.count(maximum) >= 2:
            answer = -1
        else:
            answer = li.index(maximum)
    return answer