DIR := ./src/for_python
FILES := $(wildcard $(DIR)/*)
CLEAN_FILES := $(filter-out $(DIR)/__%,$(FILES))
FILENAMES := $(notdir $(CLEAN_FILES))
ITEMS := $(basename $(FILENAMES))

run-chain:
	@set -e; \
	for item in $(ITEMS); do \
		echo "==> Executinhg tests for $$item"; \
		uvx pytest -k "$$item"; \
		done

format:
	uvx ruff check
