from aggregate import Aggregate
from collections.abc import Iterator


class IteratorA(Iterator):
    def __init__(self, aggregate: Aggregate):
        self._aggregate = aggregate
        self._index = 0

    def __next__(self) -> int:
        try:
            value = self._aggregate[self._index]
            self._index += 1
            return value
        except IndexError:
            raise StopIteration()

    def __iter__(self) -> Iterator:
        return self