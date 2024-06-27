#!/bin/bash

# create fat jar
./gradlew shadowJar

# generate java
mkdir build/generated
protoc -I/usr/local/include -I. --plugin=protoc-gen-custom=protoc-gen-code.sh --experimental_allow_proto3_optional --custom_out=build/generated protos/**/*.proto