class Stack:
    data = []
    count = 0

    def __init__(self):
        return

    def pop(self):
        self.count -= 1
        return self.data.pop()

    def read(self):
        return self.data[-1]

    def push(self, num: int) -> bool:
        self.data.append(num)
        self.count += 1
        return True
