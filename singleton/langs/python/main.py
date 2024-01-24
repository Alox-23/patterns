import singleton
import random

def main():
    print("Hit Enter !!")
    while True:
        #make sure the loop doesnt repeat uncontrolobly(user needs to press enter)
        a = input()

        #create singleton
        obj = singleton.Singleton.getInstance(random.randint(100, 999))
        obj2 = singleton.Singleton.getInstance(random.randint(100, 999))
       
        print("obj.getDate():", obj.getData())
        print("obj2.getDate():", obj2.getData())

if __name__ == "__main__":
    main()
