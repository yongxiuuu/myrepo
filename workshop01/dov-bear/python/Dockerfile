FROM python:alpine3.15

#mkdir /app & cd /app = WORKDIR /app
WORKDIR /app

RUN apk update & apk add curl

ADD main.py .
ADD requirements.txt .
ADD run.sh .
ADD utils.py .
ADD public public
ADD templates templates

RUN pip install --no-cache-dir --upgrade pip && \
    pip install --no-cache-dir -r requirements.txt

# for running the images
ENV APP_PORT=3000
EXPOSE  ${APP_PORT}
HEALTHCHECK --interval=30s --timeout=30s --start-period=5s --retries=3 CMD \
    CMD curl -s http://localhost:${APP_PORT}/healthz || exit 1

#run the app
#ENTRYPOINT [ "sleep", "300" ]
ENTRYPOINT [ "python", "./main.py" ]
