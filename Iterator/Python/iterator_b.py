from aggregate import Aggregate
from collections.abc import Iterator


class IteratorB(Iterator):
    def __init__(self, aggregate: Aggregate):
        self._aggregate = aggregate
        self._index = len(self._aggregate) - 1

    def __next__(self) -> ...:
        if self._index >= 0:
            value = self._aggregate[self._index]
            self._index -= 1
            return value
        else:
            raise StopIteration()

    def __iter__(self) -> Iterator:
        return self
