from for_python.stack import Stack


def test_pop():
    stack = Stack()
    stack.push(1)
    assert stack.pop() == 1
    assert stack.count == 0


def test_read():
    stack = Stack()
    stack.push(9)
    assert stack.read() == 9
    assert stack.count == 1


def test_push():
    stack = Stack()
    assert stack.push(7)
    stack.push(8)
    stack.push(9)

    assert stack.pop() == 9
    assert stack.pop() == 8


def test_count():
    stack = Stack()
    assert stack.count == 0
    assert stack.push(7)
    assert stack.count == 1
