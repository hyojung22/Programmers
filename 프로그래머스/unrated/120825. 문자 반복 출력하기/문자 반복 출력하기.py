def solution(my_string, n):
    result = ""
    for i in range(len(my_string)):
        result = result + (my_string[i]*n)
    return result