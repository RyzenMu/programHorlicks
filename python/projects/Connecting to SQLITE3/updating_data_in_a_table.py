import sqlite3

conn = sqlite3.connect('COLLEGE.db')

cur = conn.cursor()

cur.execute('UPDATE STUDENT \
        SET percentage = percentage *1.02 \
        WHERE percentage < 50;')

conn.close()
