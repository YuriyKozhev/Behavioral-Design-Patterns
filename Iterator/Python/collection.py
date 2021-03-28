from collections.abc import Iterator
from aggregate import Aggregate


class Collection(Iterable):
    def __init__(self, aggregate: Aggregate, iterator: type(Iterator)) -> None:
        self._aggregate = aggregate
        self._iterator = iterator(self._aggregate)

    def __iter__(self) -> Iterator:
        return self._iterator
