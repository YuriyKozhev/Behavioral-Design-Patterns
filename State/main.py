from context import Context
from concrete_state_a import ConcreteStateA
from concrete_state_b import ConcreteStateB

if __name__ == "__main__":
    context = Context()
    csA = ConcreteStateA()
    csB = ConcreteStateB()
    context.request(csA)
    context.request(csB)