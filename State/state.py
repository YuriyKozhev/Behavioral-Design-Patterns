from abc import ABC, abstractmethod

class State(ABC):
    def __init__(self) -> None:
        pass

    @abstractmethod
    def handle(self) -> None:
        pass
