str = "encyclopedia"

cou = str.count("c")

print(cou)

str = "Muruganantham"

cou_m = str.count("m")
cou_n = str.count("n")
cou_a = str.count("a")


print("The m count is ", cou_m)
print("The n count is " , cou_n)
print("The a count is " , cou_a)

str = " I will go to chennai very soon"
pat = str.count("ch")
print(pat)
con = "ch" in str
print( "ch in str", con )
