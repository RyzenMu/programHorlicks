import socket

mySock = socket.socket()
host = '10.88.0.3'
port = 65535
mySock.connect((host, port))
while True:
        data = input('Enter data to be sent: ')
        if data == '':
                mySock.send('EOF'.encode())
                break
        else:
                mySock.send(data.encode())
        data = mySock.recv(1024)
        print(data.decode())

mySock.close()
