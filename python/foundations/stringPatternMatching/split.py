import re

str = 'Mira, Ronit, Vivek'

match = re.split(r',', str)
print(match)

str = """Mira, Ronit, Vivek
Aiysha, Renuka, Robin
Sneha, Ravi"""

match = re.split(r',|\n', str)
print(match)
