from abstract_class import AbstractClass

class ConcreteClassB(AbstractClass):
    def __init__(self) -> None:
        pass

    def _primitive_operation_1(self) -> None:
        print("primitive operation 1 b")

    def _primitive_operation_2(self) -> None:
        print("primitive operation 2 b")