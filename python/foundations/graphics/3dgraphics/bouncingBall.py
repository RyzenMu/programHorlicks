from vpython import *

ball = sphere(pos=vector(0, 10, 0), radius=1, color=color.red)

floor = box(pos=vector(0,0,0), size=vector(10, 0.5, 10), color=color.blue)

dt =0.1

ball.velocity = vector(0, 0, 0)


t = 0 #time
g = -9.8

while (t < 20):
    rate(10)
    ball.velocity.y = ball.velocity.y + g * dt 
    ball.pos = ball.pos + ball.velocity * dt
    if ball.pos.y < floor.pos.y + 0.5 + ball.radius:
        ball.velocity.y = -ball.velocity.y

    t = t + dt