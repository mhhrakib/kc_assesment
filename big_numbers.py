def char_to_int(char):
    return ord(char) - ord('0')
    

def digit_to_char(digit):
    return chr(digit + 48)


def adjust_length(a, b):
    if len(a) < len(b):
        a, b = b, a
    return a, b.zfill(len(a))


def add(a, b):
    # pad the smaller number with leading zeros
    a, b = adjust_length(a, b)

    # reverse a, b
    a = a[::-1]
    b = b[::-1]

    ans = ""
    carry = 0
    for i in range(len(a)):
        sum = char_to_int(a[i]) + char_to_int(b[i])
        sum += carry
        ans += digit_to_char(sum % 10)
        carry = sum // 10

    # append carry if it's greater than 0
    if carry:
        ans += digit_to_char(carry)
    
    # reverse ans
    return ans[::-1]


if __name__ == "__main__":
    a = input()
    b = input()
    print(add(a, b))
