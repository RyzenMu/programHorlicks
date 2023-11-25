class stableMarriage:
    def __init__(self, n, menPref, womenPref) -> None:
        self.count = n
        self.menPref = menPref # Dictionary specifing men's preference
        self.womenPref = womenPref
        self.freewoman = list(self.womenPref.keys())
        self.engagedMen = {i: None for i in self.menPref.keys()}
        self.engagedWomen = {i: None for i in self.womenPref.keys()}

    def __str__(self) -> str:
        return str(self.engagedMen)
    
    def isStable(self, man, woman):
        rank = self.menPref[man].index(woman)
        i = 0
        stable = True
        while i < rank and stable:
            otherWoman = self.menPref[man][i]
            if otherWoman not in self.freewoman:
                stable = self.womenPref[otherWoman].index(man) > self.womenPref[otherWoman].index(self.engagedWomen[otherWoman])
            i += 1
        rank = self.womenPref[woman].index(man)
        i = 0
        while i < rank and stable:
            otherman = self.womenPref[woman][i]
            if otherman < man :
                stable = self.menPref[otherman].index(woman) > self.menPref[otherman].index(self.engagedMen[otherman])
            i += 1
        return stable
    
    def free(self, man, woman):
        self.freewoman.append(woman)
        self.engagedMen[man] = None
        self.engagedWomen[woman] = None
    
    def engage(self, man, woman):
        self.freewoman.remove(woman)
        self.engagedMen[man] = woman
        self.engagedWomen[woman] = man

    def findmatching(self, man = 1):
        if man > self.count:
            print(self)
            return
        for woman in self.menPref[man]:
            if woman in self.freewoman and self.isStable(man, woman):
                self.engage(man, woman)
                self.findmatching(man+1)
                self.free(man, woman)

def findStablemarriage():
    n = int(input('Enter number of men : '))
    menPref = eval(input('Specify men\'s preferences : '))
    womanPref = eval(input('Specify Woman\'s preferences: '))
    print('Stable pairings')
    ob = stableMarriage(n, menPref, womanPref)
    ob.findmatching()

def main():
    findStablemarriage()

if __name__ == "__main__":
    main()