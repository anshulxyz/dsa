all: setup test

setup:
	rye sync

test:
	rye run pytest

lint:
	rye run ruff check .

fmt: lint
	rye run ruff format .
