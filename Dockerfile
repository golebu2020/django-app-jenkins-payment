FROM python:3.12.0b2-slim-bookworm

LABEL maintainer="Chinedu Olebu"

ENV PYTHONUNBUFFERED 1

RUN apt-get update && useradd -ms Chinedu

USER Chinedu

COPY . /App

WORKDIR /App

RUN pip install --upgrade pip

RUN pip install -r requirements.txt

RUN rm -rf requirements.txt

EXPOSE 8000

CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"]







