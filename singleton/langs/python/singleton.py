import random

class Singleton:

    #class vars
    instance = None
    data = None

    #dont call this or singleton wont work (if not in python, use private)
    def __init__(self, data):
        self.data = data

    #function for instantiating signleton
    def getInstance(data):
        if Singleton.instance == None:
            Singleton.instance = Singleton(data)

        return Singleton.instance

    #getter for good practice, data should be private but python dont do private.
    def getData(self):
        return self.data

