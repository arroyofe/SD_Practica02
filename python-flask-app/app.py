from flask import Flask, render_template
import os

template_dir=os.path.dirname(os.path.abspath(os.path.dirname(__file__)))
template_dir=os.path.join(template_dir,'./src','./src/templates')

#Inicialización de flask
app = Flask(__name__, template_folder= template_dir)

#Ruta principal
@app.route('/')
def home():
    return render_template ('./src/resources/templates/registro.html')

if __name__=='__main__':
    app.run(debug=True,port = 4000)
