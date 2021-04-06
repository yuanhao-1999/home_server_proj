#!/bin/bash
PID=$(ps -ef | grep /root/Documents/yuanhao/home_server_proj/home-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{ print $2 }')
if [ -z "$PID" ]
then
    echo Application is already stopped
else
    echo kill $PID
    kill $PID
fi
