#!/bin/bash
java -cp build/libs/${PWD##*/}-all.jar zapsolutions.zap.protoc.ProtocPlugin "$@"