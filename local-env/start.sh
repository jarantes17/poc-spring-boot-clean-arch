#! /bin/bash
export COMPOSE_PROJECT_NAME="poc-spring-clean-arch"

docker compose up -d

sh ../mvnw -f ../pom.xml -DFlyway.configFiles=local-env/flyway.conf flyway:migrate