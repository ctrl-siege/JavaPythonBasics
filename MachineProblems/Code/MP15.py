
def firstMethod(text: str):
    if text == text[::-1]:
        return "Palindrome"
    else:
        return "Not Palindrome"


def secondMethod(text: str):
    is_palindrome = True
    left = 0
    right = len(text) - 1

    while left < right:
        if text[left] != text[right]:
            is_palindrome = False
            break
        left += 1
        right -= 1

    if is_palindrome:
        return "Palindrome"
    else:
        return "Not Palindrome"

text = input()

print(firstMethod(text))