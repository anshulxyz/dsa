from for_python.queue import Queue


def test_enqueue():
    q = Queue()
    assert q.enqueue(3)


def test_dequeue():
    q = Queue()
    assert q.enqueue(1)
    assert q.enqueue(2)

    assert q.dequeue() == 1
    assert q.dequeue() == 2


def test_read():
    q = Queue()

    assert q.read() is None
    assert q.enqueue(9)
    assert q.read() == 9
