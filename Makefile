DIRS=$$(ls)
MAKE=$$(which make)

all:
	@for a in $(DIRS); do \
		if [ -d $$a ]; then \
			$(MAKE) -C $$a; \
		fi; \
	done;

clean:
	@find . | grep class | xargs rm
