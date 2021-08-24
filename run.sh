#!/bin/bash
sudo bash ./gradlew eureka-serv:bootRun gateway-serv:bootRun user-serv:bootRun course-serv:bootRun --parallel