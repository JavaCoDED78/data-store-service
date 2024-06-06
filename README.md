# Data store service

This application receives data
from [Data analyser service](https://github.com/JavaCoDED78/data-analyser-service)
with Apache Kafka and Debezium.

### Usage

To start an application you need to pass variables to `.env` file.

You can use example `.env.example` file with some predefined environments.

You can find Docker compose file
in [Data analyser service](https://github.com/JavaCoDED78/data-analyser-service) `docker/docker-compose.yaml`.

Application is running on port `8083`.

All insignificant features (checkstyle, build check, dto validation) are not
presented.

Just after startup application will try to connect to Apache Kafka and begin to
listen topics from `data` topic created by Debezium.
