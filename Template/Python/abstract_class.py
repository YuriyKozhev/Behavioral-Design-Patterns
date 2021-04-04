from abc import ABC, abstractmethod

class AbstractClass(ABC):
    def template_method(self) -> None:
        self._primitive_operation_1()
        self._primitive_operation_2()

    @abstractmethod
    def _primitive_operation_1(self) -> None:
        pass

    @abstractmethod
    def _primitive_operation_1(self) -> None:
        pass
    

