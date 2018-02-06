#!/usr/bin/env bash

while true; do
    sleep 1;
    echo
    cat /dev/urandom | gtr -dc 'a-zA-Z0-9' | fold -w 128 | head -n 10 | tee -a runtime-data/in/`cat /dev/urandom | gtr -dc 'a-zA-Z0-9' | head -c 12`
done
