import sqlite3

conn = sqlite3.connect('COLLEGE.db')
cur = conn.cursor()

print('Retriving roll numbers, names, and percentages of students')
cur.execute('SELECT RollNum, Name, Percentage FROM\
        STUDENT;')
print(cur.fetchall())

print('Retriving all attribute values of students')
cur.execute('SELECT * FROM STUDENT;')
print(cur.fetchall())

print('Retriving roll numbers and names of students')
cur.execute('SELECT RollNum, Name FROM STUDENT;')
print(cur.fetchall())

print('Retriving all attribute values of Students with \
        percentage greater than 80')
cur.execute('SELECT * FROM STUDENT WHERE percentage > 80;')
print(cur.fetchall())

print('Retriving all attribute values of Students with \
        percentage greater than 80')
cur.execute('SELECT * FROM STUDENT WHERE percentage > 80;')
for row in cur:
        print(row)

#place holder


#place holders
print('Retriving all attribute values of Students with \
        percentage greater than 80')
cur.execute('SELECT * FROM STUDENT WHERE percentage > :value;', {'value' : 80})

