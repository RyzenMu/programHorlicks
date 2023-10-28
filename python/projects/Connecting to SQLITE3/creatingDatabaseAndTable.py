import sqlite3

def main():
        #Establish DB connection
        conn = sqlite3.connect('COLLEGE.db')
        print('Database connected successfully')
        
        #create a cursor
        cur = conn.cursor()

        #Create a table
        cur.execute('CREATE TABLE STUDENT(\
                RollNum INT CHECK(TYPEOF(RollNum) = "integer") PRIMARY KEY, \
                Name VARCHAR(20) CHECK(TYPEOF(Name) = "text") NOT NULL,\
                Percentage INT CHECK(TYPEOF(Percentage) = "integer") NOT NULL);')
        print('Table created successfully')

        # close the connection
        conn.close()

if __name__ == '__main__':
        main()
