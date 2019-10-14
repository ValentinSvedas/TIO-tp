# tareas-flask

Lista de tareas programada en Flask.

## Instalación

Nos aseguramos de tener instalado Python y luego instalamos pip.
```bash
sudo apt-get install python3-pip
```

Clonamos el repositorio y nos posicionamos dentro de la carpeta tareas-flask.
```bash
git clone https://github.com/ValentinSvedas/TIO-tp.git
cd tareas-flask
```


Luego ejecutamos los siguientes comandos para crear nuestro entorno virtual.
```bash
pip3 install virtualenv
virtualenv env
source env/bin/activate
pip3 install flask flask-sqlalchemy
python3
from app import db
db.create_all()
exit()
```

Finalmente, utilizamos el siguiente comando para inicar el servidor. Debemos asegurarnos de que estamos dentro del entorno virtual (source env/bin/activate).
```bash
python3 app.py
```

