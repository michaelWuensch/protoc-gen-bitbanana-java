#!/bin/bash
java -cp build/libs/protoc-gen-zap-java-all.jar zapsolutions.zap.protoc.ProtocPlugin "$@"