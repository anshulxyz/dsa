all: setup test

setup:
	rye sync

test:
	rye run pytest

fmt:
	rye run ruff check .
