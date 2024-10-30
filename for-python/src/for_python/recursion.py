def reverse_string(s: str) -> str:
    if len(s) == 0:
        return s
    return reverse_string(s[1:]) + s[0]
