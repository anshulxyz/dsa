class Queue:
    def __init__(self):
        self.data = []

    def enqueue(self, num: int) -> bool:
        self.data.append(num)
        return True

    def dequeue(self):
        return self.data.pop(0)

    def read(self):
        try:
            return self.data[0]
        except IndexError:
            return None
