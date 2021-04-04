from abc import ABC, abstractmethod

class AbstractClass(ABC):
    def template_method(self) -> None:
        self.primitive_operation_1()
        self.primitive_operation_2()

    @abstractmethod
    def primitive_operation_1(self) -> None:
        pass

    @abstractmethod
    def primitive_operation_2(self) -> None:
        pass
    

