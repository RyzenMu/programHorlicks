"""
* - zero or more ocuurances of the preceding pattern
. - exactly one arbitrary character excluding new line
? - zero or one occurances of the preceding pattern
+ - one or more occurances of the preceding pattern
{m} - exactly m occurances of the preceding pattern
{m, n} - atleast m and at most n occurances of the preceding pattern , in the absence of n there is no upper bound and in the absence of m , the lower bound is assumed to be 0
[list of character] - a single character from list of characters enclosed between[], for example[aeiou]
[.] - matches a dot, not an arbitrary chaaracter
[a-z] - A single alphabet in the range a to z
[A-Z] - A single alphabet in the range A to Z
[0-9] - A single digit in the range 0 to 9
[^...] - when ^ occurs at the begining of the list of symbols enclosed between [], it denotes a single charcter not in the list
^ - matches begining of the string
$ - matches end of the string or before the new line character at the end of the string
r1|r2 - regular expression r1 or r2
() - groups pattern elements
\d - any digit
\D - any non digit character
\s - whitespace character
\S - non-whitespace character
\w - any alphanumeric character
\W - any non-alphanumeric character

"""