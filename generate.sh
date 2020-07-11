#!/bin/bash

# create fat jar
./gradlew shadowJar

# generate java
mkdir build/generated
protoc -I/usr/local/include -I. -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis --plugin=protoc-gen-custom=protoc-gen-code.sh --custom_out=build/generated *.proto