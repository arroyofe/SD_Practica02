import os
from flask import Flask, render_template

template_dir = os.path.dirname(os.path.abspath(os.path.dirname(__file__)))
template_dir = os.path.join(template_dir, 'python-flask-app', 'templates')

# Inicialización de flask
app = Flask(__name__, template_folder=template_dir)


# Ruta principal
@app.route('/')
def home():
    return render_template('base.html')


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)
