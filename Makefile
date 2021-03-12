DIRS=$$(ls)
MAKE=$$(which make)

all:
  @for a in $(DIRS); do \
    if [ -d $$a ]; then \
      echo "Making directory $$a" \
      $(MAKE) -C $$a; \
    fi; \
  done;
