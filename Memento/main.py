from caretaker import Caretaker
from originator import Originator

if __name__ == "__main__":
    caretaker = Caretaker()
    originator = Originator()
    print(f"Created originator with content {originator.get_content()}")
    caretaker.save(originator.create_state())
    originator.set_content("a2", "b2")
    print(f"Originator content: {originator.get_content()}")
    caretaker.save(originator.create_state())
    originator.set_content("a3", "b3")
    print(f"Originator content: {originator.get_content()}")
    originator.restore_state(caretaker.load())
    print(f"Originator content: {originator.get_content()}")
    originator.restore_state(caretaker.load())
    print(f"Originator content: {originator.get_content()}")
    originator.restore_state(caretaker.load())
    print(f"Originator content: {originator.get_content()}")