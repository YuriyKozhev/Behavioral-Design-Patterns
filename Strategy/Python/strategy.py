from abc import ABC, abstractmethod

class Strategy(ABC):
    def __init__(self) -> None:
        pass

    @abstractmethod
    def execute(self) -> None:
        pass
