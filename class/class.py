class dog:
    unNamed = "I need a name"
    
    def __init__(self, name,age = None):
        self.name = name
        self.age = age
        print(name)
        if(age == None):
            '''
            print("NO AGE")'''
        else:
            print(age)
        
   
newdog = dog("jaswanth",20)
