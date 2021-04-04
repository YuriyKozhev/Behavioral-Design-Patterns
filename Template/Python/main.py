from abstract_class import AbstractClass
from concrete_class_a import ConcreteClassA
from concrete_class_b import ConcreteClassB

if __name__ == "__main__":
    cca = ConcreteClassA()
    cca.template_method()
    ccb = ConcreteClassB()
    ccb.template_method()