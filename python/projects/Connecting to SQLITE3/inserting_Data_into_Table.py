import sqlite3

def main():
        conn = sqlite3.connect('COLLEGE.db')
        print('database connected successfully')
        cur = conn.cursor()
        cur.execute("INSERT INTO STUDENT VALUES(1, 'Hiten', 89);")
        cur.execute("INSERT INTO STUDENT VALUES(2, 'Muskan', 85);")
        cur.execute("INSERT INTO STUDENT VALUES(3, 'Nidhi', 78);")
        cur.execute("INSERT INTO STUDENT VALUES(4, 'Nikhil', 55);")
        print('data inserted successfully')
        conn.commit()

        conn.close()

if __name__ == '__main__':
        main()
