class Salad:
    def __init__(self):
        self.ingredients = []

    def add_beans(self):
        self.ingredients.append("Beans")
        return self
    
    def add_egg(self):
        self.ingredients.append("Egg")
        return self
    
    def add_leaves(self):
        self.ingredients.append("Leaves")
        return self
    
    def eat(self):
        for i in self.ingredients:
            print("I have eaten:", i)
            
        print("Tasy salad!")
        del self

    def add_all(self):
        return self.add_leaves().add_beans().add_egg()
    
s1 = Salad()
s2 = Salad()

s1.add_beans().add_leaves()
s2.add_all()

print("s1:")
s1.eat()
print("s2:")
s2.eat()