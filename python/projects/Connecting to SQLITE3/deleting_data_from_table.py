import sqlite3

conn = sqlite3.connect('COLLEGE.db')
cur = conn.cursor()

cur.execute('DELETE FROM STUDENT WHERE RollNum = 3;')
