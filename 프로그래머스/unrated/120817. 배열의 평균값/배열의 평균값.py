def solution(numbers):
    sum = 0
    for i in range(len(numbers)):
        sum = sum + numbers[i]
        avg = sum / len(numbers)
    return avg