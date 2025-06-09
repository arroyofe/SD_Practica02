FROM python:3.12
WORKDIR /python-flask-app
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt
COPY . .
ENTRYPOINT ["python","app.py"]
CMD["--port","8880"]
LABEL authors="Fernando"
