from flask import Flask
app = Flask(__name__)
@app.route('/')
def hello_world():
    return 'Hello World!'
@app.route('/Home')
def hello_world():
    return 'Welcome to Home page!'
@app.route('/Products')
def hello_world():
    return 'Welcome to Products page!'