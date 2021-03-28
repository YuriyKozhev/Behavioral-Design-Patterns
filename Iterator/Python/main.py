from collection import Collection
from iterator_a import IteratorA
from iterator_b import IteratorB
from aggregate import Aggregate


if __name__ == "__main__":
    aggregate = Aggregate()
    aggregate.add_item(1)
    aggregate.add_item(2)
    aggregate.add_item(3)

    print("Iterator A")
    it_a = IteratorA(aggregate)
    for el in it_a:
        print(el)
        
    print("Iterator B")
    it_b = IteratorB(aggregate)
    for el in it_b:
        print(el)
    